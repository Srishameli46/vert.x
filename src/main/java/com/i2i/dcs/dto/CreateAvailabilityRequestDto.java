package com.i2i.dcs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

/**
 * <p>
 * This class represents a request to create Doctor's availability information.
 * This encapsulates the data required to generate availability hours,
 * including availability day and time slot.
 * </p>
 */
@Getter
@Setter
public class CreateAvailabilityRequestDto {

    @NotBlank(message = "Available day cannot not be blank")
    @Size(min = 6, max = 10, message = "Provide a valid day")
    private String day;

    @NotNull(message = "Doctor's shift cannot be null")
    private int shift;

    @NotNull(message = "Doctor's availability time cannot be null")
    private LocalTime startTime;

    @NotNull(message = "Provide a valid end time of availability")
    private LocalTime endTime;

    @NotNull(message = "Provide a valid consultation time")
    private int consultTime;
}
