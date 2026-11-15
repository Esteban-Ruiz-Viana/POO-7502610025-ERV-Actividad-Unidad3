package Taller_20_DIP.Ejercicio_2;

//Ejercicio 2: Sistema de Almacenamiento de Archivos
//1. Define una interfaz Almacenamiento con métodos para guardar y recuperar archivos.
//2. Implementa clases AlmacenamientoLocal y AlmacenamientoNube que implementen la interfaz.
//3. Crea una clase GestorArchivos que dependa de Almacenamiento.

public class Ejercicio_2 {

    public static void main(String[] args) {

        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestor = new GestorArchivos(local);
        gestor.guardarArchivo("notas.txt");
        gestor.recuperarArchivo("notas.txt");

        Almacenamiento nube = new AlmacenamientoNube();
        gestor = new GestorArchivos(nube);
        gestor.guardarArchivo("informe.txt");
        gestor.recuperarArchivo("informe.txt");

    }
}
