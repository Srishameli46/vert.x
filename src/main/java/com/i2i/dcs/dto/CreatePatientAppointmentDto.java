package com.i2i.dcs.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class provides the information about patient details like,
 * -Name of the patient that should be in alphabets which are separated with spaces.
 * -Email of the patient that should be in valid format.
 * -Aadhar number of the patient should contain 12 digits.
 * -Appointment details like appointment date and time along with doctor id and doctor name.
 * </p>
 */
@Getter
@Setter
public class CreatePatientAppointmentDto {

    @NotBlank(message = "Name should not be blank")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Patient name should contain only letters and space")
    private String name;

    @NotBlank(message = "Email id must not be blank")
    @Email(message = "Please provide correct email format")
    private String email;

    @NotNull(message = "Aadhar number shot not be blank")
    @Pattern(regexp = "^[0-9]{4}[ -]?[0-9]{4}[ -]?[0-9]{4}$", message = "Aadhar number should contain 12 digits." + "Please provide in following format\n" + "#### #### #### or ############ or ####-####-####")
    private String aadharNumber;

    @Valid
    private CreateAppointmentRequestDto appointment;
}
