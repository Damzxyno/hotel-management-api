package com.damzxyno.hotelmanagementapi.services.impl;

import com.damzxyno.hotelmanagementapi.exceptions.ResourceNotFoundException;
import com.damzxyno.hotelmanagementapi.models.User;
import com.damzxyno.hotelmanagementapi.repositories.UserRepository;
import com.damzxyno.hotelmanagementapi.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String identifier) throws UsernameNotFoundException {
        User user =  userRepo.findByUsernameOrEmail(identifier)
                .orElseThrow(
                        ()-> new ResourceNotFoundException("Username/Email not found!"));

        return new org.springframework.security.core.userdetails
                .User(user.getEmail(), user.getPassword(),
                List.of(new SimpleGrantedAuthority(user.getRole().name())));
    }
}
