package com.i2i.dcs.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This representing a request to create Location information which includes
 * locality, city, state and pin code.
 * </p>
 */
@Getter
@Setter
public class CreateLocationRequestDto {

    @NotBlank(message = "Locality name must not be blank")
    @Size(min = 5, max = 30, message = "Locality name must be between {min} and {max} characters long")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Locality name must contain only alphabetic characters and spaces")
    private String locality;

    @NotBlank(message = "City name must not be blank")
    @Size(min = 5, max = 30, message = "City name must be between {min} and {max} characters long")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "City name must contain only alphabetic characters and spaces")
    private String city;

    @NotBlank(message = "State must not be blank")
    @Size(min = 5, max = 30, message = "State name must be between {min} and {max} characters long")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "State name must contain only alphabetic characters and spaces")
    private String state;

    @NotNull(message = "Provide a valid pin-code.")
    @Min(100000)
    @Max(999999)
    private int pinCode;
}
