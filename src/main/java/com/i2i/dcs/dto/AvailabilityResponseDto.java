package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;


/**
 * <p>
 * Encapsulates a doctor's availability for appointments on a specific day and shift.
 * This class provides detailed information about,
 * The `day` specifies the day of the week when the availability applies.
 * The `shift` indicates the specific shift or time period within the day.
 * The `startTime` and `endTime` gives the start and end times of the available time slot for appointments.
 * The `consultTime` property represents the duration of each individual consultation in hours.
 * </p>
 */

@Builder
@Setter
@Getter
public class AvailabilityResponseDto {
    private String id;
    private String day;
    private int shift;
    private LocalTime startTime;
    private LocalTime endTime;
    private int consultTime;
}
