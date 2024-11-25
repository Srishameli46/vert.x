package com.i2i.dcs.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class provides the information about vital sign details like,
 * -Pulse Rate of the patient that should lies between 40 BPM to 120 BPM.
 * -Temperature of the patient that should lies between 75 to 105 degree fahrenheit.
 * -Systolic pressure of the patient that should lies 100 to 200.
 * -Diastolic pressure of the patient that should lies between 50 to 120.
 * -Weight of the patient that must be valid number.
 * Followed by the Spo2 and respiration rate.
 * </p>
 */
@Getter
@Setter
public class VitalSignRequestDto {
    @NotNull(message = "Pulse rate must not be blank. Enter a valid pulse rate between 40-120")
    @Min(40)
    @Max(120)
    private int pulseRate;

    @NotNull(message = "Temperature cannot be blank")
    @Min(75)
    @Max(105)
    private float temperature;

    @NotNull(message = "BP cannot be empty. Provide a valid BP")
    @Min(100)
    @Max(200)
    private int systolicBp;

    @NotNull(message = "BP cannot be empty. Provide a valid BP")
    @Min(50)
    @Max(120)
    private int diastolicBp;

    @NotNull(message = "Weight cannot be empty")
    @Min(2)
    @Max(200)
    private int weight;

    @NotNull(message = "SpO2 cannot be blank")
    @Min(90)
    @Max(100)
    private int spo2;

    @NotNull(message = "Respiration rate cannot be blank")
    @Min(10)
    @Max(25)
    private int respiratoryRate;
}
