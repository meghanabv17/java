package com.xworkz.passportapp.passportimpl;

import com.xworkz.passportapp.exception.PassportUserIdNotFoundException;
import com.xworkz.passportapp.exception.UserNameNotFoundException;
import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.user.User;

import java.util.Scanner;

public class PassportImpl implements Passport {


    User user[] = new User[1];
    Scanner scanner = new Scanner(System.in);
    int index = 0;
    @Override
    public boolean addUserDetails(User user) {
        boolean isUserDetailsAdded = false;
        if(user!=null)
        {
            this.user[index++]=user;
            isUserDetailsAdded = true;
        }
        return isUserDetailsAdded;
    }

    @Override
    public void getUserDetails() {
        for (User user:user) {
            System.out.println(user);
        }

    }

    @Override
    public boolean updateUserPhoneNumberByUserId(Long userPhoneNumber,Integer userId) {
        boolean isPhoneNumberUpdated = false;
        for(int i = 0 ;i<user.length;i++)
        {
            //PassportUserIdNotFoundException
           try {
               if (user[i].getUserId().equals(userId)) {
                   this.user[i].setUserPhoneNumber(userPhoneNumber);
                   isPhoneNumberUpdated = true;
               }
               if (!isPhoneNumberUpdated) {
                   PassportUserIdNotFoundException passportUserIdNotFoundException = new PassportUserIdNotFoundException("Given UserId " + userId + " not found");
                   throw passportUserIdNotFoundException;
               }
           }
           catch (PassportUserIdNotFoundException pe)
           {
               pe.printStackTrace();
           }
        }
        return isPhoneNumberUpdated;
    }

    @Override
    public boolean updateUserAddressByUserId(String userAddress, Integer userId) {
        System.out.println("updateUserAddressByUserId started");
        boolean isAddressUpdated = false;
        for (int j = 0; j < user.length; j++)
        {
            //PassportUserIdNotFoundException
           try {
               if (this.user[j].getUserId().equals(userId)) {
                   this.user[j].setUserAddress(userAddress);
                   isAddressUpdated = true;
               }
               if (!isAddressUpdated) {
                   PassportUserIdNotFoundException passportUserIdNotFoundException = new PassportUserIdNotFoundException("Given UserId "+userId+" not Found");
                   throw passportUserIdNotFoundException;

                   //throw new PassportUserIdNotFoundException("Given User Id is not Found");
               }
           }catch (PassportUserIdNotFoundException pe)
           {
               pe.printStackTrace();
           }
        }
        System.out.println("updateUserAddressByUserId ended");
        return isAddressUpdated;
    }

    @Override
    public boolean updateUserAgeByUserId(Integer userAge, Integer userId) {
        boolean isUserAgeUpdated = false;
        for (int k = 0; k < user.length; k++)
        {
            //PassportUserIdNotFoundException
            try {
                if (this.user[k].getUserId().equals(userId)) {
                    this.user[k].setUserAge(userAge);
                    isUserAgeUpdated = true;
                }
                if (!isUserAgeUpdated) {
                    PassportUserIdNotFoundException passportUserIdNotFoundException = new PassportUserIdNotFoundException("Given UserId " + userId + " not found");
                    throw passportUserIdNotFoundException;
                }
            }
            catch (PassportUserIdNotFoundException pe)
            {
                pe.printStackTrace();
            }
        }
        return isUserAgeUpdated;
    }

    @Override
    public String getUserGenderByUserName(String userName) {
        System.out.println("getUserGenderByUserName started");
        String gender = null;
        for (int l = 0; l < user.length; l++)
        {
            //UserNameNotFoundException
            try {
                if (this.user[l].getUserName().equals(userName)) {
                    gender = this.user[l].getUserGender();
                }
                UserNameNotFoundException userNameNotFoundException = new UserNameNotFoundException("User name not found");
                throw userNameNotFoundException;
            }
            catch (UserNameNotFoundException ue)
            {
                ue.printStackTrace();
            }
        }
        System.out.println("getUserGenderByUserName ended");
        return gender;
    }

    @Override
    public Integer getUserAgeByUserName(String userName) {
        System.out.println("getUserAgeByUserName started");
       int age = 0;
        for (int m = 0; m < user.length; m++)
        {
            //UserNameNotFoundException
           try {
               if (this.user[m].getUserName().equals(userName)) {
                   age = this.user[m].getUserAge();
               }
               UserNameNotFoundException userNameNotFoundException = new UserNameNotFoundException("User name not found");
               throw userNameNotFoundException;
           }
           catch (UserNameNotFoundException ue)
           {
               ue.printStackTrace();
           }
        }
        System.out.println("getUserAgeByUserName ended");
        return age;
    }

    @Override
    public String getUserNameByUserId(Integer userId) {
        System.out.println("getUserNameByUserId started");
        String name = null;
        for (int n = 0; n < user.length; n++)
        {
            //PassportUserIdNotFoundException
            try {
                if (this.user[n].getUserId().equals(userId)) {
                    name = this.user[n].getUserName();
                }
                PassportUserIdNotFoundException passportUserIdNotFoundException = new PassportUserIdNotFoundException("Given UserId " + userId + " not found");
                throw passportUserIdNotFoundException;
            }
            catch (PassportUserIdNotFoundException pe)
            {
                pe.printStackTrace();
            }
        }
        System.out.println("getUserNameByUserId ended");
        return name;
    }
}
