package Taller_19_DIP.Ejercicio_3;

//Ejercicio 3: Sistema de Reportes
//1. Define una interfaz GeneradorReporte con un método para generar reportes.
//2. Implementa clases ReportePDF y ReporteExcel que implementen la interfaz.
//3. Crea una clase GestorReportes que dependa de GeneradorReporte.

public class Ejercicio_3 {

    public static void main(String[] args) {

        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestor = new GestorReportes(pdf);
        gestor.crearReporte();

        GeneradorReporte excel = new ReporteExcel();
        gestor = new GestorReportes(excel);
        gestor.crearReporte();

    }
}
