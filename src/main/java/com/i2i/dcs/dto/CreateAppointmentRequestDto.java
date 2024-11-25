package com.i2i.dcs.dto;

import com.i2i.dcs.customAnnotation.WithinNextWeek;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <p>
 * This class represents a request to create appointment information.
 * This class encapsulates the data required to create appointment,
 * including appointment date and the associated slot time along with the doctor id and name.
 * </p>
 */
@Getter
@Setter
public class CreateAppointmentRequestDto {

    @FutureOrPresent(message = "Slot date should not have past date")
    @NotNull(message = "Slot date can not be null")
    @WithinNextWeek(message = "Slot date must be within the next 7 Days")
    private LocalDate slotDate;

    @NotNull(message = "Slot time can not be null")
    private LocalTime slotTime;

    @Valid
    private CreateDoctorAppointmentDto doctor;
}
