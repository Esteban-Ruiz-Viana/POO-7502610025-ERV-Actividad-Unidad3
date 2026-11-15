package Taller_20_DIP.Ejercicio_2;

// Guarda y recupera en la nube.
public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardar(String nombreArchivo) {

        System.out.println("Subiendo " + nombreArchivo + " a la nube.");

    }

    @Override
    public void recuperar(String nombreArchivo) {

        System.out.println("Descargando " + nombreArchivo + " de la nube.");

    }
}
