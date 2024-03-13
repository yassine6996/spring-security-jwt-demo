package org.demo.jwt.authbackend.dto;

import lombok.Data;
import org.demo.jwt.authbackend.enums.UserRole;

@Data
public class AuthenticationResponse{
    private String jwt;
    private UserRole userRole;
    private Long userId;
}
