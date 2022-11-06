package Ejercicio6;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		/*Objetivo: Este programa solicitará unos datos al usuario, entre ellos la nota, según la nota devolverá un mensaje u otro.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha:05/10/2022
		 * */

		Scanner teclado = new Scanner (System.in);
		
		String nombre, apellidos, ciclo;
		int nota;
		
		
		System.out.println("Nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.println("Ciclo Formativo: ");
		ciclo = teclado.nextLine();

		System.out.println("Nota (entero): ");
		nota = teclado.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		
		System.out.println("Ciclo Formativo: " + ciclo);
		
		if (nota >= 0 && nota < 5) {		
			System.out.println("Nota académica: " + nota + "(Insuficiente)");
			} else if (nota == 5) {
				System.out.println("Nota académica: " + nota + "(Aprobado)");
				} else if (nota == 6) {
					System.out.println("Nota académica: " + nota + "(Bien)");
				 	}	else if (nota >=7 && nota <= 8) {
				 			System.out.println("Nota académica: " + nota + "(Notable)");
					 	}	else if (nota == 9) {
					 			System.out.println("Nota académica: " + nota + "(Sobresaliente)");
					 		}	else if (nota == 10) {
					 			System.out.println("Nota académica: " + nota + "(Matrícula de honor)");
					 			} else {
					 				System.out.println("La nota introducida es incorrecta");

					 			}
		teclado.close();
	}
}