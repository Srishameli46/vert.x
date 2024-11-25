package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class encapsulates the email address and password provided by a user during registration.
 * The email field must be a non-empty string and adhere to standard email format.
 * The password field must also be non-empty.
 * The phoneNumber field must also be non-empty and contain exactly 10 digits.
 * </p>
 */
@Builder
@Getter
@Setter
public class UserRegistrationDto {
    private String userId;
    private String userEmail;
    private String password;
    private String phoneNumber;
}
