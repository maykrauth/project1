package com.company;

public class car {

    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //constructores

    public car(){

    }
    public car(String color, String fabricante,String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }

    //comportamiento
    public void  acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <= 120){
            this.velocidad += cantidad;
        }
    }

}
