package org.demo.jwt.authbackend.services.auth;

import org.demo.jwt.authbackend.dto.SignupRequest;
import org.demo.jwt.authbackend.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
    public boolean hasUserWithEmail(String email);
}
