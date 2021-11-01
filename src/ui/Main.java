package ui;

import model.Curso;
import model.Estudiante;

public class Main {
	
	public static Curso curso;
	public static void main(String[] args) {
		
		/*
		 * Descomentar a continuaci�n el m�todo a probar:
		 */
		
		pruebaA�adir1();
		//pruebaA�adir2();
		//pruebaEliminar();
	}
	
	//M�todo para probar el para a�adir estudiantes alaetoriamente.
	public static void pruebaA�adir1() {
		curso = new Curso("APO", 20);

		Estudiante est1 = new Estudiante("A00369478", "Jorge Jojoa");
		curso.addEstudiante(est1);

		Estudiante est2 = new Estudiante("A00369479", "Juan Erazo");
		curso.addEstudiante(est2);

		Estudiante est3 = new Estudiante("A00369480", "Diana Santacruz");
		curso.addEstudiante(est3);

		Estudiante est4 = new Estudiante("A00369481", "Esteban Montoya");
		curso.addEstudiante(est4);
		
		System.out.println("LISTA DE ESTUDIANTES: \n");
		curso.pintarEstudiantes();
		System.out.println("----------------------------------------------------------------");
		System.out.println("LISTA DE ESTUDIANTES DE ATR�S HACIA ADELANTE: \n");
		curso.pintarAtrasAdelanteEstudiantes();
		System.out.println("----------------------------------------------------------------");
	}
	
	//M�todo para probar el a�adir estudiantes ordenadamente.
	public static void pruebaA�adir2() {
		curso = new Curso("APO", 20);

		Estudiante est1 = new Estudiante("A00369478", "Jorge Jojoa");
		curso.addEstudianteOrdenadamente(est1);

		Estudiante est2 = new Estudiante("A00369479", "Juan Erazo");
		curso.addEstudianteOrdenadamente(est2);

		Estudiante est3 = new Estudiante("A00369480", "Diana Santacruz");
		curso.addEstudianteOrdenadamente(est3);

		Estudiante est4 = new Estudiante("A00369481", "Esteban Montoya");
		curso.addEstudianteOrdenadamente(est4);
		
		System.out.println("-------- ESTUDIANTES A�ADIDOS ORDENADAMENTE --------");
		curso.pintarEstudiantes();
		System.out.println("-----------------------------------------------------");
	}
	
	public static void pruebaEliminar() {
		System.out.println("*******************************************");
		System.out.println("Prueba de eliminar estudiantes:");
		
		curso = new Curso("APO", 20);

		Estudiante est1 = new Estudiante("A00369478", "Jorge Jojoa");
		curso.addEstudiante(est1);

		Estudiante est2 = new Estudiante("A00369479", "Juan Erazo");
		curso.addEstudiante(est2);

		Estudiante est3 = new Estudiante("A00369480", "Diana Santacruz");
		curso.addEstudiante(est3);

		Estudiante est4 = new Estudiante("A00369481", "Esteban Montoya");
		curso.addEstudiante(est4);
		
		curso.eliminarEstudiante("Jorge Jojoa");
		curso.eliminarEstudiante("Diana Santacruz");
		
		System.out.println("Total de estudiantes eliminados: "+curso.getEstudiantesEliminados());
		System.out.println("Estudiantes que a�n siguen en el curso: \n");
		curso.pintarEstudiantes();
	}

}
