package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/* En este programa voy a solicitar unos datos al usuario y luego realizar varias 
		 * condicionales para el proceso de selección de un equipo de recursos humanos 
		 * que va a informar al trabajador de cuánto va a cobrar anualmente.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * 	Fecha: 08/10/2022
		 * 
		 */

		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos;
		int edad, experiencia, proyectos;
		double salario;
		
		System.out.println("Introduzca su nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Introduzca sus apellidos: ");
		apellidos = teclado.nextLine();
		
		System.out.println("Introduzca su edad: ");
		edad = teclado.nextInt();

		System.out.println("Introduzca su salario deseado: ");
		salario = teclado.nextDouble();
		
		if (salario > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		} else {
			System.out.println("Introduzca sus años de experiencia: ");
			experiencia = teclado.nextInt();
			
			System.out.println("Introduzca el número de proyectos trabajados hasta ahora: ");
			proyectos = teclado.nextInt();
			
			if (experiencia >= 2 && proyectos >= 3) {
					System.out.println("Enhorabuena. Ha sido contratado");
					if  (experiencia >= 5 ||  proyectos >= 5) {
						System.out.println("Su salario anual será de 30.000 euros");
					}	 else {
							System.out.println("Su salario anual será de 25.000 euros");
					}	
			}	 		
		}
		teclado.close();		
	}
}