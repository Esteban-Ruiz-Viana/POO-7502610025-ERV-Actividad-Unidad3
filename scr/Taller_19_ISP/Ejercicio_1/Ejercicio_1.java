package Taller_19_ISP.Ejercicio_1;

//1. Define una interfaz Mantenimiento que incluya métodos para reparaciones y limpieza.
//2. Refactoriza el sistema para separar estos métodos en interfaces específicas para cada tipo de tarea.

public class Ejercicio_1 {

    public static void main(String[] args) {

        Reparable tecnico = new Tecnico();
        tecnico.reparar();

        Limpiable limpieza = new PersonalLimpieza();
        limpieza.limpiar();

        EquipoMantenimiento equipo = new EquipoMantenimiento();
        equipo.reparar();
        equipo.limpiar();

    }
}