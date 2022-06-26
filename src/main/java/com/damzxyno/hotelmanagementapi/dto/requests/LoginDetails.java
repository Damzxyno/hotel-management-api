package com.damzxyno.hotelmanagementapi.dto.requests;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDetails {
    private String identifier;
    private String password;
}
