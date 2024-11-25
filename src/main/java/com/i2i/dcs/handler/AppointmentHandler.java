package com.i2i.dcs.handler;

import com.i2i.dcs.dto.CreatePatientAppointmentDto;
import com.i2i.dcs.service.AppointmentService;
import io.vertx.core.json.Json;
import io.vertx.ext.web.RoutingContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppointmentHandler {

  private static final Logger logger = LoggerFactory.getLogger(AppointmentHandler.class);
  private final AppointmentService appointmentService;
  private final PatientService patientService;
  private final ResponseMapper responseMapper;

  public AppointmentHandler(AppointmentService appointmentService, PatientService patientService, ResponseMapper responseMapper) {
    this.appointmentService = appointmentService;
    this.patientService = patientService;
    this.responseMapper = responseMapper;
  }

  public void createBooking(RoutingContext context) {
    String userId = context.request().getHeader("Id");
   var appointmentDto = Json.decodeValue(context.getBodyAsString(), CreatePatientAppointmentDto.class);

//    logger.debug("Starting to create an appointment for patient");

    appointmentService.addAppointment(userId, appointmentDto)
      .onSuccess(response -> {
        if (response == null) {
            logger.error("Doctor not available for slot on {} at {}",
            appointmentDto.getAppointment().getSlotDate(),
            appointmentDto.getAppointment().getSlotTime());
          context.response()
            .setStatusCode(404)
            .end(Json.encode(responseMapper.entityToDto("Doctor not available for slot on "
              + appointmentDto.getAppointment().getSlotDate() + " at "
              + appointmentDto.getAppointment().getSlotTime())));
        } else {
          logger.info("Appointment successfully booked for patient {}", appointmentDto.getName());
          context.response()
            .setStatusCode(201)
            .end(Json.encode(response));
        }
      })
      .onFailure(err -> {
        logger.error("Error while creating appointment", err);
        context.response().setStatusCode(500).end("Internal Server Error");
      });
  }
}
