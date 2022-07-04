package com.damzxyno.hotelmanagementapi.services.interfaces;

import com.damzxyno.hotelmanagementapi.dto.requests.LoginDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;


public interface AuthenticationService {
    Authentication authenticateUser(LoginDetails loginDetails);
}
