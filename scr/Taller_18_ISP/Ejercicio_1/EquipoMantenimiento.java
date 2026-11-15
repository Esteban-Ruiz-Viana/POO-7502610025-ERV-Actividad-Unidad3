package Taller_18_ISP.Ejercicio_1;

// Repara y limpia.
public class EquipoMantenimiento implements Reparable, Limpiable {

    @Override
    public void reparar() {

        System.out.println( "El equipo de mantenimiento esta reparando." );

    }

    @Override
    public void limpiar() {

        System.out.println( "El equipo de mantenimiento esta limpiando." );

    }
}
