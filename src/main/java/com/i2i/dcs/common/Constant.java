package com.i2i.dcs.common;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Constant {
    public static final LocalTime SHIFT1_START_TIME = LocalTime.of(10, 0, 0);
    public static final LocalTime SHIFT1_END_TIME = LocalTime.of(13, 0, 0);
    public static final LocalTime SHIFT2_START_TIME = LocalTime.of(15, 0, 0);
    public static final LocalTime SHIFT2_END_TIME = LocalTime.of(18, 0, 0);
    public static final List<String> REGISTERED_MEDICAL_COUNCILS = List.of("APMC", "ArunMC", "ASMDC", "BRMC", "CGMC", "GMC", "HMC",
            "HPMC", "JMC", "JharMC", "KMC", "MMC", "MahMC", "ManMC", "MegaMC", "MizMC", "NagMC", "OdMC", "PbMC", "RajMC", "SikkMC", "TNMC",
            "TSMC", "TripMC", "UPMC", "UKMC");
    public static final String ADMIN_API = "/dcs/api/v1/admin";
    public static final String DOCTOR_API = "/dcs/api/v1/doctors";
    public static final String PATIENT_API = "/dcs/api/v1/patients";
    public static final String USER_API = "/dcs/api/v1/users";

    public static final List<LocalTime> SHIFT_1_TIMES = Arrays.asList(
            LocalTime.of(10, 0),
            LocalTime.of(11, 0),
            LocalTime.of(12, 0)
    );

    public static final List<LocalTime> SHIFT_2_TIMES = Arrays.asList(
            LocalTime.of(15, 0),
            LocalTime.of(16, 0),
            LocalTime.of(17, 0)
    );

    public static final List<String> DAYS = Arrays.asList(
            "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
    );

    public static final AppointmentStatus status = AppointmentStatus.NOT_BOOKED;
}
