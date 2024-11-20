package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.user.User;

public interface Passport {

    boolean addUserDetails(User user);
    void getUserDetails();
    boolean updateUserPhoneNumberByUserId(Long userPhoneNumber,Integer userId);
    boolean updateUserAddressByUserId(String userAddress,Integer userId);
    boolean updateUserAgeByUserId(Integer userAge,Integer userId);
    String getUserGenderByUserName(String userName);
    Integer getUserAgeByUserName(String userName);
    String getUserNameByUserId(Integer userId);

}
