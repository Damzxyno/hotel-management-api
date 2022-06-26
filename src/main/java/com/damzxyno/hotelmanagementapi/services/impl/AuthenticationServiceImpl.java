package com.damzxyno.hotelmanagementapi.services.impl;

import com.damzxyno.hotelmanagementapi.dto.requests.LoginDetails;
import com.damzxyno.hotelmanagementapi.exceptions.IncorrectPasswordException;
import com.damzxyno.hotelmanagementapi.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationManager authenticationManager;


    @Override
    public Authentication authenticateUser(LoginDetails loginDetails) {
        String identifier = loginDetails.getIdentifier();
        String password = loginDetails.getPassword();
        log.info("Initiating authentication for {}", identifier);

        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(identifier, password);
        Authentication authenticatedToken = authenticationManager.authenticate(authToken);

        if (!authenticatedToken.isAuthenticated()) {
            log.error("{} Inputted an incorrect password!", identifier);
            throw new IncorrectPasswordException("The password you inputted is incorrect!");
        }

        SecurityContextHolder.getContext().setAuthentication(authenticatedToken);
        log.info("Successfully logged in {}!", identifier);

        return authenticatedToken;
    }
}
