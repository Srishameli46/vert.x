package com.i2i.dcs.verticles;

import com.i2i.dcs.handler.AppointmentHandler;
import com.i2i.dcs.router.AppointmentRouter;
import com.i2i.dcs.service.AppointmentService;
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
    router.route().handler(BodyHandler.create());

    AppointmentHandler appointmentHandler = new AppointmentHandler(appointmentService, patientService, responseMapper);
    new AppointmentRouter(router, appointmentHandler);

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
