package com.i2i.dcs.dto;

import com.i2i.dcs.common.AppointmentStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Builder
public class AppointmentDurationResponseDto {
    private String day;
    private LocalTime startTime;
    private LocalTime endTime;
    private AppointmentStatus status;
}
