package Taller_18_ISP.Ejercicio_2;

// Hace las tres operaciones.
public class CuentaBancaria implements Transferencia, Retiro, PagoFactura {

    @Override
    public void transferir(double monto) {

        System.out.println( "Transferencia realizada por: $" + monto );

    }

    @Override
    public void retirar(double monto) {

        System.out.println( "Retiro realizado por: $" + monto );

    }

    @Override
    public void pagarFactura(double monto) {

        System.out.println( "Factura pagada por: $" + monto );

    }
}