package com.i2i.dcs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Represents user credentials for authorization purposes.
 * This class encapsulates the token given for the user.
 * </p>
 */
@Getter
@Setter
@AllArgsConstructor
public class JwtResponseDto {
    private String Token;
}
