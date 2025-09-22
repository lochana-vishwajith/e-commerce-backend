package com.userservice.user.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int id;

    private String firstName;

    private String lastName;

    private String city;

    private String address;

    private int zipcode;

    private int phoneNumber;

    private String email;

    @Override
    public String toString(){
        return "User{id=" + id + ", firstName="+ firstName +", lastName=" + lastName +
                ", address="+address+ ", city="+city+", zipcode="+zipcode+", phoneNumber="+phoneNumber+", email="+email+"}";
    }
}
