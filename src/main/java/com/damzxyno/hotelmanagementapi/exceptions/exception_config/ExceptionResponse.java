package com.damzxyno.hotelmanagementapi.exceptions.exception_config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

@AllArgsConstructor
@RequiredArgsConstructor
public class ExceptionResponse {
    private Date timeStamp;
    private String message;
    private String details;


}
