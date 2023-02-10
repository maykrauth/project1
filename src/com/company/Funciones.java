package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo("Alan");
        holaMundo(4);
        holaMundo("Mayra Krauth");
        sum(2, 2);
        String hola = devolverHola();
        System.out.println(hola);
    }

    public static void holaMundo() {
        System.out.println("Hola Mundo desde un Método");
    }
    private static void holaMundo (String name){
        System.out.println("Hola " + name);
    }
    private static void holaMundo(String name, String surname){
        System.out.println("Hola " + name + " " + surname);
    }
    private static void holaMundo(Integer number) {
        System.out.println("El numero es :" + number);
    }
    private static String devolverHola(){
        return "Hello word";
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }
}
