package com.xworkz.pizzaapp;

public class PizzaRunner {
    public static void main(String[] args) {
        System.out.println("Come to our dominos");
        Pizzaapp pizza = new Pizzaapp();
        pizza.setId(1);
        pizza.setName("Cheese & corn");
        pizza.setPrice(129.0);
        pizza.setToppings("Corn");
        pizza.setSize('M');
        System.out.println("Pizza information: "+pizza);

        Pizzaapp pizza1 = new Pizzaapp();
        pizza1.setId(2);
        pizza1.setName("Margerita");
        pizza1.setPrice(99.0);
        pizza1.setToppings("Cheese");
        pizza1.setSize('M');
        System.out.println("Pizza information: "+pizza1);

        Pizzaapp pizza2 = new Pizzaapp();
        pizza2.setId(3);
        pizza2.setName("Veggy lodded");
        pizza2.setPrice(199.0);
        pizza2.setToppings("Vrggies");
        pizza2.setSize('M');
        System.out.println("Pizza information: "+pizza2);

        Pizzaapp pizza3 = new Pizzaapp();
        pizza3.setId(4);
        pizza3.setName("Tomato pie");
        pizza3.setPrice(89.0);
        pizza3.setToppings("Tomato");
        pizza3.setSize('M');
        System.out.println("Pizza information: "+pizza3);

        Pizzaapp pizza4 = new Pizzaapp();
        pizza4.setId(5);
        pizza4.setName("Grilled pizza");
        pizza4.setPrice(159.0);
        pizza4.setToppings("Capsicum");
        pizza4.setSize('M');
        System.out.println("Pizza information: "+pizza4);

        Pizzaapp pizza5 = new Pizzaapp();
        pizza5.setId(6);
        pizza5.setName("Cheese & corn");
        pizza5.setPrice(99.0);
        pizza5.setToppings("Corn");
        pizza5.setSize('M');
        System.out.println("Pizza information: "+pizza5);

        Pizzaapp pizza6 = new Pizzaapp();
        pizza6.setId(7);
        pizza6.setName("Chicken pizza");
        pizza6.setPrice(899.0);
        pizza6.setToppings("Chicken");
        pizza6.setSize('L');
        System.out.println("Pizza information: "+pizza6);

        System.out.println("Thanks for coming");

        boolean isEquals = pizza.equals(pizza1);
        System.out.println(isEquals);

        System.out.println("First Id is: "+pizza.hashCode());
        System.out.println("Second Id is: "+pizza3.hashCode());
    }
}
