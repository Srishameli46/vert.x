package com.i2i.dcs.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * <p>
 * Represents doctor update details that includes the information,
 * -Name of the doctor that should be in alphabets which are separated with spaces.
 * -Dob of the doctor that should not be in future date.
 * -Gender of the doctor in the alphabets alone.
 * -Qualification of the doctor that must be valid.
 * -Consultation fee that must not exceed Rs.2000.
 * </p>
 */
@Setter
@Getter
public class UpdateDoctorRequestDto {
    @NotBlank(message = "Name must not be blank")
    @Size(min = 5, max = 30, message = "Name must be between {min} and {max} characters long")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only alphabetic characters and spaces")
    private String name;

    @Past(message = "Provide a valid date.")
    private LocalDate dob;

    @NotBlank(message = "Gender must not be blank")
    @Size(min = 4, max = 10, message = "Gender must contain only alphabetic characters.")
    private String gender;

    @NotBlank(message = "Qualification cannot be blank. Please provide your qualification details.")
    private String qualification;

    @NotNull(message = "Consultation fee must not be blank")
    @Min(100)
    @Max(2000)
    private int consultationFee;
}
