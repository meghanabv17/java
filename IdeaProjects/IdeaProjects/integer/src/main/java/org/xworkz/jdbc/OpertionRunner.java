package org.xworkz.jdbc;

import java.util.HashMap;

public class OpertionRunner {
    public static void main(String[] args) {

        int values[] = {12,32,89,51,63,22,53,12,895};

        Operation operation = array -> {
            for(int value : array){
                if(value % 2 == 0)
                    System.out.println(value);
            }
        };
        operation.even(values);


    }
}
