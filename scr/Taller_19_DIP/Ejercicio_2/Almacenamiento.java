package Taller_19_DIP.Ejercicio_2;

// Contrato para guardar y recuperar archivos.
public interface Almacenamiento {

    void guardar(String nombreArchivo);
    void recuperar(String nombreArchivo);

}
