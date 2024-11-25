package com.i2i.dcs.dto;

import lombok.*;

import java.util.Set;

/**
 * <p>
 * Encapsulates information about a prescribed medicine.
 * This class holds details such as the medicine name, dosage, timing, and frequency.
 * It is typically used to represent a set of medicine in a prescription.
 * </p>
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionResponseDto {
    private String remarks;
    private String advice;
    private VitalSignResponseDto vitalSign;
    private Set<MedicineResponseDto> medicines;
}
