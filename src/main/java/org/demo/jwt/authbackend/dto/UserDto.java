package org.demo.jwt.authbackend.dto;

import lombok.Data;
import org.demo.jwt.authbackend.enums.UserRole;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;
}
