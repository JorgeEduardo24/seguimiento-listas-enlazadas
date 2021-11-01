package ui;

import model.Curso;
import model.Estudiante;

public class Main {
	
	public static Curso curso;
	public static void main(String[] args) {
		
		/*
		 * Descomentar a continuación el método a probar:
		 */
		
		pruebaAñadir1();
		//pruebaAñadir2();
		//pruebaEliminar();
	}
	
	//Método para probar el para añadir estudiantes alaetoriamente.
	public static void pruebaAñadir1() {
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
		System.out.println("LISTA DE ESTUDIANTES DE ATRÁS HACIA ADELANTE: \n");
		curso.pintarAtrasAdelanteEstudiantes();
		System.out.println("----------------------------------------------------------------");
	}
	
	//Método para probar el añadir estudiantes ordenadamente.
	public static void pruebaAñadir2() {
		curso = new Curso("APO", 20);

		Estudiante est1 = new Estudiante("A00369478", "Jorge Jojoa");
		curso.addEstudianteOrdenadamente(est1);

		Estudiante est2 = new Estudiante("A00369479", "Juan Erazo");
		curso.addEstudianteOrdenadamente(est2);

		Estudiante est3 = new Estudiante("A00369480", "Diana Santacruz");
		curso.addEstudianteOrdenadamente(est3);

		Estudiante est4 = new Estudiante("A00369481", "Esteban Montoya");
		curso.addEstudianteOrdenadamente(est4);
		
		System.out.println("-------- ESTUDIANTES AÑADIDOS ORDENADAMENTE --------");
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
		System.out.println("Estudiantes que aún siguen en el curso: \n");
		curso.pintarEstudiantes();
	}

}
