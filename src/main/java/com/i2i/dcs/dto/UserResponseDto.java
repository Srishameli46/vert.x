package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * <p>
 * Represents user credentials response by authentication purposes.
 * This class encapsulates the email address, user id and role of the user while registration.
 * </p>
 */
@Getter
@Setter
@Builder
public class UserResponseDto {
    private String userId;
    private String userEmail;
    private Set<RoleResponseDto> roles;
}
