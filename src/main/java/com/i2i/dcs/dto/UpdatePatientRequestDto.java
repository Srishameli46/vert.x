package com.i2i.dcs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * <p>
 * This class is used to update the patients details includes
 * -Name: Should not be blank and must contain only letters and spaces.
 * -Date of Birth (dob): Should not be a future date and must not be null.
 * -Gender: Should not be blank and must be either 'male' or 'female' or 'transgender' (case-insensitive).
 * -Phone Number: Should not be blank and must be a valid 10-digit number or follow the format '###-###-####'.
 * -Address: Should not be blank.
 * -Blood Group: Should not be blank and must be a valid blood group (A+, A-, B+, B-, AB+, AB-, O+, O-).
 * </p>
 */
@Getter
@Setter
public class UpdatePatientRequestDto {
    @NotBlank(message = "Name should not be blank")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Patient name should contain only letters and space")
    private String name;

    @Past(message = "Dob should not have future dates")
    @NotNull(message = "Dob can not be null")
    private LocalDate dob;

    @NotBlank(message = "Gender should not be blank")
    @Pattern(regexp = "^(male|female|Male|Female|transgender|Transgender)$", message = "Gender name should contain only letters")
    private String gender;

    @NotBlank(message = "Address should not be blank")
    private String address;

    @NotBlank(message = "Blood group must not be blank")
    @Pattern(regexp = "^(A|B|AB|O)[+-]$", message = "Invalid Blood group. " + "Please provide a valid blood group only in upper cases.")
    private String bloodGroup;
}
