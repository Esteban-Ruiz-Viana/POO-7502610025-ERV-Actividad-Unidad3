package Taller_18_ISP.Ejercicio_1;

// Solo repara.
public class Tecnico implements Reparable {

    @Override
    public void reparar() {

        System.out.println( "\nEl tecnico esta reparando el equipo." );

    }
}