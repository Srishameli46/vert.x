package com.i2i.dcs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * -Email of the registered user that should be in valid format.
 * -Password of the doctor that should not be blank.
 * </p>
 */
@Getter
@Setter
public class UserCredentialsRequestDto {

    @NotBlank(message = "Email address must not be blank.")
    @Email
    private String email;

    @NotBlank(message = "Password must not be blank.")
    private String password;
}
