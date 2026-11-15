package Taller_18_ISP.Ejercicio_3;

//1. Define una interfaz Vehiculo que incluya métodos para conducir y cargar mercancías.
//2. Refactoriza el sistema para tener interfaces más específicas para la conducción y el transporte de mercancías.

public class Ejercicio_3 {

    public static void main(String[] args) {

        Conducible auto = new Auto();
        auto.conducir();

        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancia();

    }
}