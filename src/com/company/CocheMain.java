package com.company;

public class CocheMain extends car {

    String motorElectrico;

    //constructor
    public CocheMain(){

    }
    public CocheMain(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheMain(String color, String fabricante,String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }
//El metodo super nos permite invocara un constructor de la clase superior

    @Override
    public String toString() {
        return "CocheMain{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}

