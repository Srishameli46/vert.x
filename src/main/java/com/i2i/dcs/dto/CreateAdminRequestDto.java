package com.i2i.dcs.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class provides the information about admin like,
 * -Email of the user that should be in valid format.
 * -Password of the user that should not be blank.
 * -Phone number of the user should contain 10 digits.
 * </p>
 */
@Getter
@Setter
public class CreateAdminRequestDto {

    @NotNull(message = "EmailId cannot be null.")
    @Email(message = "Provide a valid email address. eg: xyzpqr@rst.com")
    private String email;

    @NotBlank(message = "Contact number must not be blank")
    @Pattern(regexp = "^(\\d{10}|\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4})$", message = "Invalid contact number format. " + "Please provide a valid 10-digit number in the format '###-###-####' or '##########'")
    private String phoneNumber;

    @NotBlank(message = "Password must not be blank")
    @Size(min = 8, max = 15)
    private String password;

}
