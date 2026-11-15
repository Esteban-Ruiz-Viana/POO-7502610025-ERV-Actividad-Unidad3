package Taller_19_DIP.Ejercicio_1;

// Autentica con OAuth.
public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public void autenticar(String usuario) {

        System.out.println("Autenticando a " + usuario + " con OAuth.");

    }
}