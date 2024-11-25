package com.i2i.dcs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * This class represents a request to create Doctor's specialization information.
 * This class encapsulates the data required to create Doctor's specialization details.
 * </p>
 */
@Getter
@Setter
public class CreateSpecializationRequestDto {

    @NotBlank(message = "Specialization must not be blank")
    @Size(min = 3, max = 20, message = "Specialization must be between {min} and {max} characters long.")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Specialization should be contains alphabets and space")
    private String specialization;
}
