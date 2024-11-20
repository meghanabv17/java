package com.xworkz.passportapp.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userGender;
    private String userAddress;
    private Long userPhoneNumber;
}
