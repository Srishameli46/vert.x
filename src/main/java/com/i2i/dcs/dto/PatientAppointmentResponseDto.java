package com.i2i.dcs.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;

/**
 * <p>
 * Encapsulates patient appointment details, including personal information,
 * contact details, medical information, and a set of associated appointments.
 * </p>
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PatientAppointmentResponseDto {
    private String name;
    private LocalDate dob;
    private String email;
    private String phoneNo;
    private String gender;
    private String aadharNo;
    private String bloodGroup;
    private String address;
    private Set<AppointmentDoctorResponseDto> appointment;
}
