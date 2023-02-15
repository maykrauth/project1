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

        CocheMain cocheMain = new CocheMain();

        cocheMain.motorElectrico = "Ejemplo Motor";
        cocheMain.color = "verde";
        cocheMain.fabricante = "Honda";
        cocheMain.modelo = "Tito";

        System.out.println(cocheMain);

        //Metodo super constructor un parametro

        CocheMain cocheMain2 = new CocheMain("azul", "alfa", "romeo", 1500d, 4.99, "TXZ");
        System.out.println(cocheMain2);

    }
}
