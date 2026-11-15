package Taller_19_DIP.Ejercicio_2;

// Maneja archivos usando cualquier tipo de almacenamiento.
public class GestorArchivos {

    private Almacenamiento almacenamiento;

    // Recibe el almacenamiento por el constructor.
    public GestorArchivos(Almacenamiento almacenamiento) {

        this.almacenamiento = almacenamiento;

    }


    public void guardarArchivo(String nombreArchivo) {

        almacenamiento.guardar(nombreArchivo);

    }

    public void recuperarArchivo(String nombreArchivo) {

        almacenamiento.recuperar(nombreArchivo);

    }
}
