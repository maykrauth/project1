package com.company;

public class ifElse {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 10;
        int number3 = 20;

        if (number1 < number2 && number2 < number3){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("fin");
    }
}
