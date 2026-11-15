package Taller_19_DIP.Ejercicio_2;

// Guarda y recupera en el disco local.
public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardar(String nombreArchivo) {

        System.out.println("Guardando " + nombreArchivo + " en el disco local.");

    }

    @Override
    public void recuperar(String nombreArchivo) {

        System.out.println("Recuperando " + nombreArchivo + " del disco local.");

    }
}