package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * <p>
 * Class representing a response of the doctor profile, that provides
 * name of the doctor, doctor id, age, gender, experience, qualification, consultation fee,
 * associated hospital detail and specialization of doctor.
 * </p>
 */
@Builder
@Getter
@Setter
public class DoctorProfileResponseDto {
    private String doctorId;
    private String name;
    private int age;
    private String gender;
    private int experience;
    private String qualification;
    private int consultationFee;
    private HospitalResponseDto hospital;
    private Set<SpecializationResponseDto> specializations;
}
