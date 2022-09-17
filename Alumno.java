package pruebas_ps;

public class Alumno {
	
	//atributos
	String nombre;
	int edad;
	float calificacion;
	
	//constructor que inicializa el nombre
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	
	//constructor que inicializa todos los atributos
	public Alumno(String nombre, int edad, float calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}

	//----- getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	//--- class methods
	
	//imprimir datos del alumno
	public void imprimirDatos() {
		System.out.println(" ---- Datos del alumno -----");
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Edad: " + this.getEdad());
		System.out.println("Calificación: " + this.getCalificacion());
	}
	
	//imprimir si es mayor de edad
	public void esMayorEdad() {
		if(this.getEdad() >= 18) {
			System.out.println("El alumno es mayor de edad");
		}else {
			System.out.println("El alumno no es mayor de edad");
		}
	}
	
	//mostrar mensaje de acuerdo a promedio
	public void mostrarCalificacion() {
		if(this.getCalificacion() < 8) {
			System.out.println("Reprobado");
			System.out.println("Calificación: " + getCalificacion());
		}
		else if(this.getCalificacion() >= 8 && this.getCalificacion() < 10){
			System.out.println("Aprobado");
			System.out.println("Calificación: " + getCalificacion());
		}
		else if(this.getCalificacion() == 10){
			System.out.println("Excelente!");
			System.out.println("Calificación: " + getCalificacion());
		}
	}
	

}
