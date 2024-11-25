package com.i2i.dcs.dto;

import com.i2i.dcs.common.AppointmentStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <p>
 * Encapsulates comprehensive information about a doctor's appointment.
 * This class provides a detailed overview of,
 * The `appointmentId`for identifying and managing the appointment within the system.
 * The `slotDate` and `slotTime` define the exact date and time when the appointment is scheduled to take place.
 * The `status` indicates the current state of the appointment, such as booked, cancelled, rescheduled, or completed.
 * The `patient` contains detailed information about the patient involved in the appointment.
 * </p>
 */
@Setter
@Getter
@Builder
public class AppointmentResponseDto {
    private String appointmentId;
    private LocalDate slotDate;
    private LocalTime slotTime;
    private AppointmentStatus status;
    private PatientResponseDto patient;
}
