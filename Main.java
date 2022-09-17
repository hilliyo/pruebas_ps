package pruebas_ps;

import java.util.Scanner;

public class Main {
	
	//objeto scanner para leer entrada del usuario
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			limpiarConsola();
			System.out.println("Opciones");
			System.out.println("1. Determinar mayor y menor de 3 números");
			System.out.println("2. Analizar triángulo");
			System.out.println("3. Probar clase Alumno");
			System.out.println("0. Salir");
			System.out.print("Ingrese opción: ");
			String opcion = scan.nextLine();
			
			if(opcion.equals("0")) {
				break;
			}
			else if(opcion.equals("1")) {
				compararNumeros();
			}
			else if(opcion.equals("2")) {
				analizarTriangulo();
			}
			else if(opcion.equals("3")) {
				testClaseAlumno();
			}else {
				System.out.println("Opcion inválida");
				break;
			}
		}
	}
	
	private static void limpiarConsola() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
		System.out.println("Presione Enter para continuar...");
		scan.nextLine();
	}
	private static void compararNumeros() {
		//metodo para comparar numeros usando la clase ComparadorNumeros
		ComparadorNumeros comparador = new ComparadorNumeros();
		System.out.print("Ingresa el primero número: ");
		float numero1 = Float.parseFloat(scan.nextLine());
		comparador.setNumero1(numero1);
		System.out.println();
		
		System.out.print("Ingresa el segundo número: ");
		float numero2 = Float.parseFloat(scan.nextLine());
		comparador.setNumero2(numero2);
		System.out.println();
		
		System.out.print("Ingresa el tercer número: ");
		float numero3 = Float.parseFloat(scan.nextLine());
		comparador.setNumero3(numero3);
		System.out.println();
				
		System.out.println("El mayor es: " + comparador.CalcularMayor());
		System.out.println("El menor es: " + comparador.CalcularMenor());
	}
	
	private static void analizarTriangulo() {
		//metodo para comparar numeros usando la clase ComparadorNumeros
		
		Triangulo triangulo = new Triangulo();
		
		System.out.print("Ingresa el primer lado del triángulo: ");
		float ladoA = Float.parseFloat(scan.nextLine());
		triangulo.setLadoA(ladoA); 
		System.out.println();
		
		System.out.print("Ingresa el segundo lado del triángulo: ");
		float ladoB = Float.parseFloat(scan.nextLine());
		triangulo.setLadoB(ladoB); 
		System.out.println();
		
		System.out.print("Ingresa el tercer lado del triángulo: ");
		float ladoC = Float.parseFloat(scan.nextLine());
		triangulo.setLadoC(ladoC); 
		System.out.println();
		
		System.out.println("El lado mayor mide: " + triangulo.obtenerLadoMayor());;

		//comprobar si es equilatero o no
		if(triangulo.esEquilatero()) {
			System.out.println("Es un triángulo equilátero");
		}else {
			System.out.println("No es un triángulo equilátero");
		}
		
		
	}
	
	private static void testClaseAlumno() {
		System.out.println("Programa que modifica información de dos alumnos:");
		
		//ingresar datos del primer alumno
		System.out.println("Creando primer alumno...");
		System.out.print("Ingrese nombre: ");
		String nombre = scan.nextLine();
		System.out.print("Ingrese edad: ");
		int edad = Integer.parseInt(scan.nextLine());
		System.out.print("Ingrese calificacion: ");
		float calificacion = Float.parseFloat(scan.nextLine());
		
		//inicializar alumno con primer constructor y setters
		Alumno alumno1 = new Alumno(nombre);
		alumno1.setEdad(edad);
		alumno1.setCalificacion(calificacion);
		
		//ingresar datos del segundo alumno
		System.out.println();
		System.out.println("Creando segundo alumno...");
		System.out.print("Ingrese nombre: ");
		nombre = scan.nextLine();
		System.out.print("Ingrese edad: ");
		edad = Integer.parseInt(scan.nextLine());
		System.out.print("Ingrese calificacion: ");
		calificacion = Float.parseFloat(scan.nextLine());
		
		//inicializar alumno con el segundo constructor
		Alumno alumno2 = new Alumno(nombre, edad, calificacion);
		
		//imprimir datos del alumno
		System.out.println("--- Datos de alumnos ---");
		System.out.println("Alumno 1");
		alumno1.imprimirDatos();
		System.out.println();
		System.out.println("Alumno 2");
		alumno2.imprimirDatos();
		System.out.println();
		
		//verificar mayoria de edad
		System.out.println("--- Edad de alumnos ---");
		System.out.println("Alumno 1");
		alumno1.esMayorEdad();
		System.out.println();
		System.out.println("Alumno 2");
		alumno2.esMayorEdad();
		System.out.println();
		
		//mostrar promedio
		System.out.println("--- Calificación de alumnos ---");
		System.out.println("Alumno 1");
		alumno1.mostrarCalificacion();
		System.out.println();
		System.out.println("Alumno 2");
		alumno2.mostrarCalificacion();
		System.out.println();
	}
				
}
