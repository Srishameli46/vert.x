package com.i2i.dcs.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * <p>
 * This class representing a request to create patient information.
 * This class encapsulates the data required to create patient details,
 * including patient name, date of birth, gender, aadhar number, phone number, email id, blood group.
 * Along with their appointment details also be included.
 * </p>
 */
@Getter
@Setter
public class CreatePatientRequestDto {

    @NotBlank(message = "Name should not be blank")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Patient name should contain only letters and space")
    private String name;

    @Past(message = "Dob should not have future dates")
    @NotNull(message = "Dob can not be null")
    private LocalDate dob;

    @NotBlank(message = "Gender should not be blank")
    @Pattern(regexp = "^(male|female|Male|Female)$", message = "Gender name should contain only letters")
    private String gender;

    @NotNull(message = "Aadhar number shot not be blank")
    @Pattern(regexp = "^[0-9]{4}[ -]?[0-9]{4}[ -]?[0-9]{4}$", message = "Aadhar number should contain 12 digits." + "Please provide in following format\n" + "#### #### #### or ############ or ####-####-####")
    private String aadharNumber;

    @NotBlank(message = "Contact number must not be blank")
    @Pattern(regexp = "^(\\d{10}|\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4})$", message = "Invalid contact number format. " + "Please provide a valid 10-digit number or follow the format '###-###-####'")
    private String phoneNo;

    @NotBlank(message = "Address should not be blank")
    private String address;

    @NotBlank(message = "Blood group must not be blank")
    @Pattern(regexp = "^(A|B|AB|O)[+-]$", message = "Invalid Blood group. " + "Please provide a valid blood group only in upper cases.")
    private String bloodGroup;

    @NotBlank(message = "Email id must not be blank")
    @Email(message = "Please provide correct email format")
    @Pattern(regexp = "^[a-z0-9]+@(gmail\\.com|yahoo\\.com)$", message = "Email must be a valid Gmail or Yahoo email address and contain only lowercase letters and numbers")
    private String email;

}
