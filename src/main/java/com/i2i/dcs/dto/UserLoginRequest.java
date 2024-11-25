package com.i2i.dcs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Represents user credentials for authentication purposes.
 * This class encapsulates the email address and password provided by a user during login or registration.
 * The email field must be a non-empty string and adhere to standard email format.
 * The password field must also be non-empty.
 * </p>
 */
@Getter
@Setter
public class UserLoginRequest {

    @NotBlank(message = "Email address must not be blank.")
    @Email
    private String email;

    @NotBlank(message = "Password must not be blank.")
    private String password;
}
