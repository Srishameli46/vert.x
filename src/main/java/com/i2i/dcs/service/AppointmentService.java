package com.i2i.dcs.service;

import com.i2i.dcs.dto.AppointmentDoctorResponseDto;
import com.i2i.dcs.dto.CreatePatientAppointmentDto;
import com.i2i.dcs.util.DateUtil;
import io.vertx.core.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppointmentService {

   private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    public Future<AppointmentDoctorResponseDto> addAppointment(String userId, CreatePatientAppointmentDto appointmentDto) {
      return Future.future(promise -> {
        try {
          logger.debug("Started to create new appointment for patient {}", appointmentDto.getName());

          if (DateUtil.checkTiming(appointmentDto)) {
            boolean isDoctorAvailable = true;

            if (!isDoctorAvailable) {
              promise.complete(null);
              return;
            }

            // Mock successful appointment creation
            AppointmentDoctorResponseDto response = new AppointmentDoctorResponseDto();
//            response.setDoctor.appointmentDto.getAppointment().getDoctor().getDoctorName());
            response.setSlotDate(appointmentDto.getAppointment().getSlotDate());
            response.setSlotTime(appointmentDto.getAppointment().getSlotTime());

            promise.complete(response);
          } else {
            promise.fail(new IllegalArgumentException("Invalid appointment time"));
          }
        } catch (Exception e) {
          logger.error("Error occurred while adding appointment", e);
          promise.fail(e);
        }
      });
    }


}
