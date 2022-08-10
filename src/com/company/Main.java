package com.company;

public class Main {

    public static void main(String[] args) {

        double precio = 50d;
        System.out.println("El precio con IVA es: " + setIva(precio));

    }

    public static double setIva(double precio){

        return precio + (precio * 0.21);
    }

}
