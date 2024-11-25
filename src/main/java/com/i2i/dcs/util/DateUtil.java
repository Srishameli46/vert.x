package com.i2i.dcs.util;

import com.i2i.dcs.dto.CreatePatientAppointmentDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public final class DateUtil {

    /**
     * <p>
     * Calculate the difference between the given date year and current date year.
     * </p>
     *
     * @param date The date in the format ("yyyy-MM-dd") and must be lesser than current date .
     * @return int
     * The count of number of years between the given date year and the current date year.
     */
    public static int calculatePeriodDifference(LocalDate date) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(date,currentDate).getYears();
    }

    /**
     * <p>
     * Calculate the difference between the graduated year and current date year.
     * </p>
     *
     * @param license This is the unique license given for doctors in the format (AAAA/YYYY/NNNNN).
     * @return int
     * The count of number of years between the given date year and the current date year.
     */
    public static int calculateExperience(String license) {
        // Extract the middle portion (yyyy)
        String yearString = extractYear(license);
        int joinedYear = Integer.parseInt(yearString);
        int currentYear = LocalDate.now().getYear();
        return currentYear - joinedYear;
    }

    /**
     * <p>
     * Split the year portion from the license of the doctor.
     * </p>
     *
     * @param license This is the unique license given for doctors in the format (AAAA/YYYY/NNNNN).
     * @return the joining year of the doctor from the license in string format.
     */
    private static String extractYear(String license) {
        // Split the license string by "/"
        String[] parts = license.split("/");

        // License format is correct (xxxx/yyyy/zzzzz)
        if (parts.length == 3) {
            return parts[1];
        } else {
            throw new IllegalArgumentException("Invalid license format: " + license);
        }
    }

    /**
     * <p>
     * Check the timing to book the appointment.
     * This checks whether the given timing is before the appointment duration.
     * </p>
     *
     * @param createPatientAppointmentDto {@link CreatePatientAppointmentDto}
     * @return true if the timing is before the appointment date, otherwise else false.
     */
    public static boolean checkTiming(CreatePatientAppointmentDto createPatientAppointmentDto) {
        LocalDateTime appointmentDateTime = LocalDateTime.of(createPatientAppointmentDto.getAppointment().getSlotDate(), createPatientAppointmentDto.getAppointment().getSlotTime());
        LocalDateTime now = LocalDateTime.now();
        return appointmentDateTime.isAfter(now);
    }
}
