package com.xworkz.passportapp;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.passportimpl.PassportImpl;
import com.xworkz.passportapp.user.User;

import java.util.Scanner;

public class PassportRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Passport passport = new PassportImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 1; index++)
        {
            User user = new User();

            System.out.print("Enter UserId:");
            user.setUserId(scanner.nextInt());

            System.out.print("Enter UserName:");
            user.setUserName(scanner.next());

            System.out.print("Enter UserAge:");
            user.setUserAge(scanner.nextInt());

            System.out.print("Enter UserGender:");
            user.setUserGender(scanner.next());

            System.out.print("Enter UserAddress:");
            user.setUserAddress(scanner.next());

            System.out.print("Enter UserPhoneNumber:");
            user.setUserPhoneNumber(scanner.nextLong());

            boolean isAdded = passport.addUserDetails(user);
            System.out.print("Passport user details added is "+isAdded);
            System.out.println();
            System.out.println();
        }
        System.out.println();
        passport.getUserDetails();
        System.out.println();



        System.out.print("Enter the UserId for which the Phone Number should be updated:");
        int id1 = scanner.nextInt();
        System.out.print("Enter the updated Phone Number:");
        Long num1 = scanner.nextLong();
        boolean isNumberUpdated = passport.updateUserPhoneNumberByUserId(num1,id1);
        System.out.print("Phone Number Updated is "+isNumberUpdated);
        System.out.println();


        System.out.print("Enter the UserId for which the Address should be updated:");
        int id2 = scanner.nextInt();
        System.out.print("Enter the updated Address:");
        String add1 = scanner.next();
        boolean isAddressUpdated = passport.updateUserAddressByUserId(add1,id2);
        System.out.print("Address Updated is "+isAddressUpdated);
        System.out.println();
        System.out.println("Main ended");

//        System.out.print("Enter the UserId for which the Age should be updated:");
//        int id3 = scanner.nextInt();
//        System.out.print("Enter the updated Age:");
//        int age1 = scanner.nextInt();
//        boolean isAgeUpdated = passport.updateUserAgeByUserId(age1,id3);
//        System.out.print("Age Updated is:"+isAgeUpdated);
//        System.out.println();
//        System.out.println();
//        passport.getUserDetails();
//        System.out.println();

//        System.out.print("Enter the UserName for which the Gender should be given:");
//        String name1 = scanner.next();
//        String gen1 = passport.getUserGenderByUserName(name1);
//        System.out.print("The Gender of the User "+name1+" is "+gen1);
//        System.out.println();
//        System.out.println();
//        System.out.println("Main ended");
//
//        System.out.print("Enter the UserName for which the Age should be given:");
//        String name2 = scanner.next();
//        int age2 = passport.getUserAgeByUserName(name2);
//        System.out.print("The Age of the User "+name2+" is "+age2);
//        System.out.println();
//        System.out.println();
//
//        System.out.println("Enter the UserId for which the Name should be given:");
//        int id4 = scanner.nextInt();
//        String name3 = passport.getUserNameByUserId(id4);
//        System.out.println("The Name of the UserId "+id4+" is "+name3);
//        System.out.println();
    }
}
