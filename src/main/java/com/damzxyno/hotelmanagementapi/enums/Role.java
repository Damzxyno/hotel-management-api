package com.damzxyno.hotelmanagementapi.enums;

public enum Role {
    CUSTOMER("ROLE_CUSTOMER"),
    CLERK("ROLE_CLERK"),
    ADMIN("ADMIN");

    private final String position;

    Role(String position){
        this.position = position;
    }

    @Override
    public String toString() {
       return position;
    }
}
