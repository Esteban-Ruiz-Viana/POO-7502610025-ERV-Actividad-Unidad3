package Taller_19_DIP.Ejercicio_1;

// Inicia sesion usando cualquier servicio de autenticacion.
public class GestorAutenticacion {

    private ServicioAutenticacion servicioAutenticacion;

    // Recibe el servicio por el constructor.
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {

        this.servicioAutenticacion = servicioAutenticacion;

    }

    public void iniciarSesion(String usuario) {

        servicioAutenticacion.autenticar(usuario);

    }
}
