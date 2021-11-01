package ui;

import model.Curso;
import model.Estudiante;

public class Main {
	
	public static Curso curso;
	public static void main(String[] args) {
		prueba1();
		prueba2();
	}
	
	//Método para probar el para añadir estudiantes alaetoriamente.
	public static void prueba1() {
		curso = new Curso("APO", 20);

		Estudiante est1 = new Estudiante("A00369478", "Jorge Jojoa");
		curso.addEstudiante(est1);

		Estudiante est2 = new Estudiante("A00369479", "Juan Erazo");
		curso.addEstudiante(est2);

		Estudiante est3 = new Estudiante("A00369480", "Diana Santacruz");
		curso.addEstudiante(est3);

		Estudiante est4 = new Estudiante("A00369481", "Esteban Montoya");
		curso.addEstudiante(est4);
		
		System.out.println("-------- ESTUDIANTES AÑADIDOS ALAETORIAMENTE --------");
		imprimirEstudiantes();
		System.out.println("-----------------------------------------------------");
	}
	
	//Método para probar el añadir estudiantes ordenadamente.
	public static void prueba2() {
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
		imprimirEstudiantes();
		System.out.println("-----------------------------------------------------");
	}
	
	public static void imprimirEstudiantes() {
		Estudiante primerEstudiante = curso.getPrimerEstudiante();
		do {
			System.out.println(primerEstudiante.toString());
			primerEstudiante = primerEstudiante.getSiguiente();
		}while(primerEstudiante != curso.getHead());
	}
	
	public static void imprimirEstudiantes2() {
		Estudiante actual = curso.getPrimerEstudiante();
		while(actual!=null) {
			System.out.println(actual.toString());
			actual = actual.getSiguiente();
		}
	}
}
