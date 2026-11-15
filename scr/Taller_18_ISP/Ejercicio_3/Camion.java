package Taller_18_ISP.Ejercicio_3;

// Se conduce y carga mercancia.
public class Camion implements Conducible, Transportable {

    @Override
    public void conducir() {

        System.out.println("El camion esta siendo conducido.");

    }

    @Override
    public void cargarMercancia() {

        System.out.println("El camion esta cargando mercancia.");

    }
}