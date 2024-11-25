package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * Class representing a response of the doctor availability, that provides
 * name of the doctor, specialization of doctor, available day, slot timings and the status.
 * </p>
 */
@Getter
@Setter
@Builder
public class DoctorAvailabilityResponseDto {
    private String name;
    private Set<SpecializationResponseDto> specializations;
    private List<AppointmentDurationResponseDto> appointmentDurations;
}
