package com.i2i.dcs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePasswordRequestDto {
    @NotBlank(message = "Email address must not be blank.")
    @Email
    private String email;

    @NotBlank(message = "Old Password must not be blank.")
    @Size(min = 5, max = 15)
    private String oldPassword;

    @NotBlank(message = "New Password must not be blank.")
    @Size(min = 5, max = 15)
    private String newPassword;
}
