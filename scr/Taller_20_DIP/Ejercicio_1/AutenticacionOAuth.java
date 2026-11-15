package Taller_20_DIP.Ejercicio_1;

// Autentica con OAuth.
public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public void autenticar(String usuario) {

        System.out.println("Autenticando a " + usuario + " con OAuth.");

    }
}