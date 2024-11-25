package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This representing a response to create Location information which includes
 * locality, city, state and pin code.
 */
@Builder
@Getter
@Setter
public class LocationResponseDto {
    private String locality;
    private String city;
    private String state;
    private int pinCode;
}
