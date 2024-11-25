package com.i2i.dcs;

import com.i2i.dcs.verticles.AppointmentVerticle;
import io.vertx.core.Vertx;

public class MainVerticle {

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();

    AppointmentService appointmentService = new AppointmentService();
    PatientService patientService = new PatientService();
    ResponseMapper responseMapper = new ResponseMapper();

    vertx.deployVerticle(new AppointmentVerticle(appointmentService, patientService, responseMapper), result -> {
      if (result.succeeded()) {
        System.out.println("AppointmentVerticle deployed successfully with ID: " + result.result());
      } else {
        System.err.println("Failed to deploy AppointmentVerticle: " + result.cause().getMessage());
      }
    });
  }
}
