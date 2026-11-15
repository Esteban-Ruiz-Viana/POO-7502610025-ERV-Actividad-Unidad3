package Taller_19_ISP.Ejercicio_2;

//1. Define una interfaz OperacionBancaria que incluya métodos para transferencias, retiros, y pagos de facturas.
//2. Divide la interfaz en varias interfaces más específicas y refactoriza las clases que las implementan.

public class Ejercicio_2 {

    public static void main(String[] args) {

            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.transferir(200.00);
            cuenta.retirar(100.00);
            cuenta.pagarFactura(150.00);

            Retiro cajero = new CajeroAutomatico();
            cajero.retirar(50.00);

        }
}
