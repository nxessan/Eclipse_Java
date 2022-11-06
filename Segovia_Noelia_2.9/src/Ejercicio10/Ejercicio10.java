package Ejercicio10;

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa Java que lee una secuencia de notas (con valores que van
		 * de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota
		 * con valor 10.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 23/10/2022
		 * 
		 */

		Scanner teclado = new Scanner(System.in);

		int i;
		double nota = 0;
		boolean diez = false;
		do {

			System.out.println("Introduce una nota (-1 para salir): ");
			nota = teclado.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Nota incorrecta");
			} else {
				if (nota == 10) {
					diez = true;
				}
			}

		} while (nota != -1);

		if (diez == true) {
			System.out.println("Se ha recogido alguna nota con valor 10");
		} else {
			System.out.println("El programa ha terminado.");
		}
		
		teclado.close();
	}

	
}
