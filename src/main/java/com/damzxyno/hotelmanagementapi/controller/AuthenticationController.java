package com.damzxyno.hotelmanagementapi.controller;

import com.damzxyno.hotelmanagementapi.dto.requests.LoginDetails;
import com.damzxyno.hotelmanagementapi.services.AuthenticationService;
import com.damzxyno.hotelmanagementapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
@CrossOrigin("https://localhost:3306")
@RequiredArgsConstructor
public class AuthenticationController {
    private final UserService userService;
    private final AuthenticationService authenticationService;


    @PostMapping("/login")
    public void authenticateUser(@RequestBody LoginDetails loginDetails){
        authenticationService.authenticateUser(loginDetails);
    }
}
