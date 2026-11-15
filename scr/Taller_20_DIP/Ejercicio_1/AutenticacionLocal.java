package Taller_20_DIP.Ejercicio_1;

// Autentica con usuario y clave local.
public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public void autenticar(String usuario) {

        System.out.println("Autenticando a " + usuario + " con usuario y clave local.");

    }
}