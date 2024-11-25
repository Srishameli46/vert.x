package com.i2i.dcs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class represents a request to create Medicine for the patient.
 * This encapsulates the data required to generate medicine details that,
 * -Medicine name that can be alphanumerical characters.
 * -Dosage that must be a whole number.
 * -Timing should be given as before food or after food.
 * -Frequency should be given in the format (1-0-1)
 * which denotes the frequency for morning, afternoon and night.
 * </p>
 */
@Setter
@Getter
public class MedicineRequestDto {

    @NotBlank(message = "Medicine name cannot be blank")
    private String medicineName;

    @NotNull(message = "Dosage cannot be blank")
    private int dosage;

    @NotBlank(message = "Timing cannot be blank")
    private String timing;

    @NotBlank(message = "Frequency cannot be blank")
    private String frequency;
}
