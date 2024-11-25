package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Class representing a response of the doctor profile, that provides
 * name of the doctor and doctor id,
 * associated hospital detail and their location.
 * </p>
 */
@Getter
@Setter
@Builder
public class DoctorResponseDto {
    private String doctorId;
    private String doctorName;
    private HospitalResponseDto hospital;
}
