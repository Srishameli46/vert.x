package com.i2i.dcs.dto;

import com.i2i.dcs.common.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Encapsulates information about a Role.
 * This class holds details such the register user as PATIENT or DOCTOR or ADMIN.
 * </p>
 */
@Builder
@Getter
@Setter
public class RoleResponseDto {
    private UserRole role;
}
