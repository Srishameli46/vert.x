package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class holds details such as the medicine name, dosage, timing, and frequency.
 * It is typically used to represent a single medicine in a prescription.
 * </p>
 */
@Builder
@Setter
@Getter
public class MedicineResponseDto {
    private String medicineName;
    private int dosage;
    private String timing;
    private String frequency;
}
