package model;

public class Curso {
	private String nombre;
	private int numEstudiantes;
	
	private Estudiante primerEstudiante;
	private Estudiante ultimoEstudiante;
	private Estudiante head;
	
	public Curso(String nombre, int numEstudiantes) {
		this.nombre = nombre;
		this.numEstudiantes = numEstudiantes;
	}
	
	public Curso(String nombre, int numEstudiantes, Estudiante estudiante) {
		this.nombre = nombre;
		this.numEstudiantes = numEstudiantes;
		this.primerEstudiante = estudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEstudiantes() {
		return numEstudiantes;
	}

	public void setNumEstudiantes(int numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}

	public Estudiante getPrimerEstudiante() {
		return primerEstudiante;
	}

	public void setPrimerEstudiante(Estudiante primerEstudiante) {
		this.primerEstudiante = primerEstudiante;
	}
	
	public Estudiante getUltimoEstudiante() {
		return ultimoEstudiante;
	}

	public void setUltimoEstudiante(Estudiante ultimoEstudiante) {
		this.ultimoEstudiante = ultimoEstudiante;
	}
	
	
	
	public Estudiante getHead() {
		return head;
	}

	public void setHead(Estudiante head) {
		this.head = head;
	}

	public void addEstudiante(Estudiante estudiante) {
		if(primerEstudiante==null) {
			primerEstudiante = estudiante;
			primerEstudiante.setSiguiente(primerEstudiante);
			primerEstudiante.setAnterior(primerEstudiante);
			ultimoEstudiante = primerEstudiante;
			head = primerEstudiante;
		}else if(primerEstudiante.getSiguiente() == primerEstudiante) {
			primerEstudiante.setSiguiente(estudiante);
			primerEstudiante.setAnterior(estudiante);
			
			estudiante.setSiguiente(primerEstudiante);
			estudiante.setAnterior(primerEstudiante);
			ultimoEstudiante = estudiante;
		}else {
			primerEstudiante.getAnterior().setSiguiente(estudiante);
			estudiante.setAnterior(primerEstudiante.getAnterior());
			primerEstudiante.setAnterior(estudiante);
			estudiante.setSiguiente(primerEstudiante);
			ultimoEstudiante = estudiante;
		}
	}
	
	// El método ordenará a los estudiantes con respecto a su nombre
	public void addEstudianteOrdenadamente(Estudiante estudiante) {
		if (primerEstudiante == null) {
			primerEstudiante = estudiante;
			primerEstudiante.setSiguiente(primerEstudiante);
			primerEstudiante.setAnterior(primerEstudiante);
			ultimoEstudiante = primerEstudiante;
			head = primerEstudiante;
		} else {
			if ((primerEstudiante.getNombre().compareTo(estudiante.getNombre()) >= 0)) { //El nuevo elemento va en la cabeza
				Estudiante aux = primerEstudiante;
				primerEstudiante = estudiante;
				primerEstudiante.setSiguiente(aux);
				aux.setAnterior(primerEstudiante);
				head = primerEstudiante;
			} else {// El nuevo elemento no va en la cabeza
				Estudiante actual = primerEstudiante;
				while (actual != null) {
					if (actual.getSiguiente() == null) {
						actual.setSiguiente(estudiante);
					} else if (actual.getSiguiente().getNombre().compareTo(estudiante.getNombre()) >= 0) {
						estudiante.setSiguiente(actual.getSiguiente());
						actual.setSiguiente(estudiante);
					}
					actual = actual.getSiguiente();
				}
			}
		}
	}
	
	
	public Estudiante eliminarEstudiante(String nombre) {
		Estudiante eliminar = null;
		if(primerEstudiante!=null) {
			if(primerEstudiante.getNombre().equalsIgnoreCase(nombre)) {
				eliminar=primerEstudiante;
				primerEstudiante = primerEstudiante.getSiguiente();
				eliminar.setSiguiente(null);
			}else {
				Estudiante anterior = primerEstudiante;
				Estudiante actual = anterior.getSiguiente();
				boolean stop = false;
				while(actual!=null && !stop) {
					if(actual.getNombre().equalsIgnoreCase(nombre)) {
						eliminar = actual;
						anterior.setSiguiente(eliminar.getSiguiente());
						eliminar.setSiguiente(null);
						stop = true;
					}else {
						anterior = actual;
						actual = actual.getSiguiente();
					}
				}
			}
		}
		 return eliminar;
	}
	
	
	public void pintarEstudiantes() {
		
	}
	
	public void pintarAtrasAdelanteEstudiantes() {
		
	}
	
	public void pintarGeneral() {
		
	}
	
	public void pintarEstudiantesRecursivo(Estudiante estudiante) {
		
	}
	
}