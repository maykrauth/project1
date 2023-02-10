package com.company;

public class whileLoop {
    public static void main(String[] args) {

        boolean check = true;
        int count = 0;

        while (count < 10){
            count++;
            if (count == 6)
               // continue; salta la condicion
                break; //rompe el flujo de ejecucion

            System.out.println(count + " Hello World");

        }
        System.out.println("and");
    }
}
