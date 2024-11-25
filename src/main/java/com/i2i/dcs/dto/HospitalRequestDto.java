package com.i2i.dcs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HospitalRequestDto {

    @NotBlank(message = "Hospital name must not be blank")
    @Size(min = 5, max = 50, message = "Hospital name must be between {min} and {max} characters long")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only alphabetic characters and spaces")
    private String name;

    @NotBlank(message = "Contact number must not be blank")
    @Pattern(regexp = "^(\\d{10}[7-9]|\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4})$", message = "Invalid contact number format. Please provide a valid 10-digit number or follow the format '###-###-####'")
    private String phoneNumber;

    @NotBlank(message = "Hospital registration number must not be blank")
    @Pattern(regexp = "^[a-zA-Z0-9]{13}$", message = "The HNR must be alphanumeric and exactly 13 characters long")
    private String hrn;

}
