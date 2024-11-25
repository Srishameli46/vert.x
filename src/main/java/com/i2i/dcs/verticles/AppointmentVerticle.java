package com.i2i.dcs.verticles;

import com.example.appointments.handler.AppointmentHandler;
import com.example.appointments.router.AppointmentRouter;
import com.example.appointments.service.AppointmentService;
import com.example.appointments.service.PatientService;
import com.example.appointments.service.ResponseMapper;
import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

public class AppointmentVerticle extends AbstractVerticle {

  private final AppointmentService appointmentService;
  private final PatientService patientService;
  private final ResponseMapper responseMapper;

  public AppointmentVerticle(AppointmentService appointmentService, PatientService patientService, ResponseMapper responseMapper) {
    this.appointmentService = appointmentService;
    this.patientService = patientService;
    this.responseMapper = responseMapper;
  }

  @Override
  public void start() {
    Router router = Router.router(vertx);

    // Enable body handling for POST requests
    router.route().handler(BodyHandler.create());

    // Set up handler and routes
    AppointmentHandler appointmentHandler = new AppointmentHandler(appointmentService, patientService, responseMapper);
    new AppointmentRouter(router, appointmentHandler);

    // Start HTTP server
    vertx.createHttpServer()
      .requestHandler(router)
      .listen(8080, result -> {
        if (result.succeeded()) {
          System.out.println("HTTP server started on port 8080");
        } else {
          System.err.println("Failed to start HTTP server: " + result.cause().getMessage());
        }
      });
  }
}
