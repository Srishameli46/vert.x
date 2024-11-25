package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Class representing a response of the hospital profile, that provides
 * name of the hospital and id,
 * associated hospital location.
 * </p>
 */
@Builder
@Setter
@Getter
public class HospitalResponseDto {
    private String id;
    private String name;
    private String phoneNo;
    private String hospitalRegistrationNumber;
    private LocationResponseDto location;
}
