package com.userservice.user.Response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserResponse {

    private String firstName;

    private String lastName;

    private String city;

    private String address;

    private int zipcode;

    private int phoneNumber;

    private String email;

    @Override
    public String toString(){
        return "UserResponse{firstName="+ firstName +", lastName=" + lastName +
                ", address="+address+ ", city="+city+", zipcode="+zipcode+", phoneNumber="+phoneNumber+", email="+email+"}";
    }

}
