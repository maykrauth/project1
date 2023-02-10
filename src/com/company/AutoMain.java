package com.company;

public class AutoMain {
    public static void main(String[] args) {

        String car = "alfa romeo";
        car autoObj = new car();

        car autoObj2 = new car("rojo", "Honda", "Fiat", 1430.45, 5.4);

        autoObj2.acelerar(50);

        System.out.println(autoObj2);

        autoObj2.peso = 1350.8;

        System.out.println(autoObj2);

    }
}
