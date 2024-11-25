package com.i2i.dcs.dto;

import lombok.*;

import java.time.LocalDate;

/**
 * <p>
 * This class encapsulates core patient information required for identification, contact.
 * It can be used in various contexts, including patient registration,
 * appointment scheduling, and medical record management.
 * This gives the attributes like patient id, name, dob, phone number,
 * email address, and address to ensure data integrity.
 * </p>
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponseDto {
    private String id;
    private String name;
    private LocalDate dob;
    private String gender;
    private String aadharNumber;
    private String bloodGroup;
    private String address;
}
