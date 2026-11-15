package Taller_19_DIP.Ejercicio_3;

// Crea reportes usando cualquier generador.
public class GestorReportes {

    private GeneradorReporte generadorReporte;

    // Recibe el generador por el constructor.
    public GestorReportes(GeneradorReporte generadorReporte) {

        this.generadorReporte = generadorReporte;

    }

    public void crearReporte() {

        generadorReporte.generarReporte();

    }
}
