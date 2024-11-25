package com.i2i.dcs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Encapsulates information about a specialization of doctor.
 * This class holds details such as the specialization Id and the stream of specialization.
 * </p>
 */
@Getter
@Setter
@Builder
public class SpecializationResponseDto {
    private String specializationId;
    private String specialization;
}
