package com.i2i.dcs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class represents a request to create appointment for patient whose Doctor's information.
 * including doctor id and doctor name.
 * </p>
 */
@Getter
@Setter
public class CreateDoctorAppointmentDto {

    @NotBlank(message = "Doctor id can not be blank")
    private String doctorId;

    @NotBlank(message = "Doctor name can not be blank")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Patient name should contain only letters and space")
    private String doctorName;
}
