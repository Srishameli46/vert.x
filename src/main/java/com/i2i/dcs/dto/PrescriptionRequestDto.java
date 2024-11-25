package com.i2i.dcs.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * <p>
 * This class represents a request to create prescription for the patient.
 * This encapsulates the data required to generate prescription details that,
 * -Remarks for the patient about the intake of the medicines.
 * -Advice that should not be blank.
 * Associated vital signs of the patients and their medicine details.
 * </p>
 */
@Getter
@Setter
public class PrescriptionRequestDto {

    @NotBlank(message = "Remarks cannot be blank, Give proper remarks")
    private String remarks;

    @NotBlank(message = "Advice cannot be blank")
    private String advice;

    @NotBlank(message = "Vital Sign cannot be blank")
    @Valid
    private VitalSignRequestDto vitalSign;

    @Valid
    private Set<MedicineRequestDto> medicines;
}
