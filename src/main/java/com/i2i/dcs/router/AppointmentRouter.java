package com.i2i.dcs.router;

import io.vertx.ext.web.Router;
import com.i2i.dcs.handler.AppointmentHandler;

public class AppointmentRouter {


    private final Router router;

    public AppointmentRouter(Router router, AppointmentHandler appointmentHandler) {
      this.router = router;
      configureRoutes(appointmentHandler);
    }

    private void configureRoutes(AppointmentHandler appointmentHandler) {
      router.post("/me/appointments").handler(appointmentHandler::createBooking);
    }

    public Router getRouter() {
      return router;
    }
}
