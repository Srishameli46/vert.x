package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Encapsulates a vital signs measurements for a patient.
 * This class used to monitor patient health and detecting potential abnormalities.
 * Pulse rate is a measure of heart rate that need for health care.
 * Temperature deviations from normal range often signaling illness.
 * Blood pressure (systolic and diastolic) provides information about the heart's pumping efficiency.
 * Weight is a fundamental measure of body composition and can be used for overall health.
 * Oxygen saturation (SpO2) reflects the amount of oxygen carried by hemoglobin in the blood.
 * Respiratory rate indicates the efficiency of breathing and can be indicative of respiratory issues.
 * </p>
 */
@Builder
@Setter
@Getter
public class VitalSignResponseDto {
    private int pulseRate;
    private float temperature;
    private int systolicBp;
    private int diastolicBp;
    private int weight;
    private int spo2;
    private int respiratoryRate;
}
