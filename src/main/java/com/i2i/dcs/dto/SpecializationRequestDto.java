package com.i2i.dcs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class represents a request to create Doctor's specialization information.
 * This class encapsulates the data required to create Doctor's specialization details along with symptoms.
 * </p>
 */
@Getter
@Setter
public class SpecializationRequestDto {
    @NotBlank(message = "Specialization must not be blank")
    @Size(min = 3, max = 20, message = "Specialization must be between {min} and {max} characters long.")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Specialization should be contains alphabets and space")
    private String specialization;

    @NotBlank(message = "Symptoms cannot be blank. Please provide symptoms for the corresponding specialization")
    @Size(min = 10, message = "Symptoms must be provide as a string separated by comma. eg. \"cough, cold etc...\"")
    @Pattern(regexp = "^([a-zA-Z]+(\\s*[a-zA-Z]*)*\\s*,\\s*)*[a-zA-Z]+(\\s*[a-zA-Z]*)*$", message = "Symptoms should be given in alphabets, space and comma")
    private String symptom;
}
