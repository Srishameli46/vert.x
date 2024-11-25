package com.i2i.dcs.dto;

import com.i2i.dcs.common.AppointmentStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Encapsulates information about a status of the appointment that
 * doctor need to update after completion of the visit of patient.
 * This class holds detail such as status.
 * It is typically used to change the status to completed once the medicine and prescription added.
 * </p>
 */
@Setter
@Getter
public class UpdateAppointmentStatusDto {
    private AppointmentStatus status;
}
