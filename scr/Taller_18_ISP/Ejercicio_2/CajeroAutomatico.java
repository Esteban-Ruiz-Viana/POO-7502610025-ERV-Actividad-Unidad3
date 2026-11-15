package Taller_18_ISP.Ejercicio_2;

// Solo permite retirar.
public class CajeroAutomatico implements Retiro {

    @Override
    public void retirar(double monto) {

        System.out.println( "El cajero entrego: $" + monto );

    }
}