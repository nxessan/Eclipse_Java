package Ejercicio1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		/* En este programa voy a solicitar unos datos al usuario y luego realizar varias 
		 * condicionales para el proceso de selección de un equipo de recursos humanos
		 * va a indicar al usuario si está contratado o si de lo contrario, no cumple con los requisitos.s
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
			} else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
				
			}
		}
		
		teclado.close();		
	}

}
