package com.i2i.dcs.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

/**
 * <p>
 * This class provides the information about doctor details like,
 * -Name of the doctor that should be in alphabets which are separated with spaces.
 * -Dob of the doctor that should not be in future date.
 * -Gender of the doctor in the alphabets alone.
 * -Qualification of the doctor that must be valid.
 * -License of the doctor that must follow the format.
 * -Consultation fee that must not exceed Rs.2000.
 * -specialization details along with symptoms and and associated hospitals.
 * </p>
 */
@Getter
@Setter
public class CreateDoctorRequestDto {

    @NotBlank(message = "Name must not be blank")
    @Size(min = 5, max = 30, message = "Name must be between {min} and {max} characters long")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only alphabetic characters and spaces")
    private String name;

    @Past(message = "Provide a valid date.")
    private LocalDate dob;

    @NotBlank(message = "Gender is required")
    @Pattern(regexp = "^(male|female|Male|Female)$", message = "Gender must be either 'male' or 'female'")
    private String gender;

    @NotBlank(message = "Qualification cannot be blank. Please provide your qualification details.")
    private String qualification;

    @NotBlank(message = "License number must not be blank")
    @Size(min = 10, max = 16, message = "License must be between {min} and {max} characters long, should be in the format xxxx/yyyy/zzzzz.")
    private String license;

    @NotNull(message = "Consultation fee must not be blank")
    @Min(100)
    @Max(2000)
    private int consultationFee;

    @NotBlank(message = "Email must not be blank")
    @Pattern(regexp = "^[a-z0-9]+@(gmail\\.com|yahoo\\.com)$", message = "Email must be a valid Gmail or Yahoo email address and contain only lowercase letters and numbers")
    private String email;

    @NotBlank(message = "Contact number must not be blank")
    @Pattern(regexp = "^[6789](\\d{9}|\\d{2}[-\\s]?\\d{3}[-\\s]?\\d{4})$", message = "Invalid contact number format. " + "Please provide a valid 10-digit number or follow the format '###-###-####'")
    private String phoneNumber;

    @NotNull(message = "Hospital Id must not be blank")
    private HospitalRequestDto hospital;

    @NotNull(message = "Specializations must not be blank")
    private Set<CreateSpecializationRequestDto> specializations;
}
