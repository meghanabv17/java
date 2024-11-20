package org.xworkz.jdbc.constructorchainingg;

public class ConstrutorChaining extends  Object{

    public ConstrutorChaining(){
        super();
        System.out.println("parent constructor ");

    }
    public ConstrutorChaining(String name){
        this();
        System.out.println("This is name constructor   ::    "+name);

    }
    public ConstrutorChaining(String name,int number){
        this(name);
        System.out.println("This is name and number constructor    ::  "+name +" number is   "+number);
    }
}
