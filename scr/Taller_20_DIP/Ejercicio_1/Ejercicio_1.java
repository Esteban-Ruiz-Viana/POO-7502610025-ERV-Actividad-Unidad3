package Taller_20_DIP.Ejercicio_1;

//1. Define una interfaz ServicioAutenticacion con un método para autenticar usuarios.
//2. Implementa clases AutenticacionLocal y AutenticacionOAuth que implementen la interfaz.
//3. Crea una clase GestorAutenticacion que dependa de ServicioAutenticacion.

public class Ejercicio_1 {

    public static void main(String[] args) {

        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(local);
        gestor.iniciarSesion("Juan");

        ServicioAutenticacion oauth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(oauth);
        gestor.iniciarSesion("Maria");

    }
}