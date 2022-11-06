package Ejercicio7;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Este programa va a consistir en que el usuario adivine un número, le pedirá
		 * un número y le irá dando pistas hasta que acierte
		 * 
		 * Autora: Noelia Segovia Sanchez
		 * 
		 * Fecha:15/10/2022
		 */

		Scanner teclado = new Scanner(System.in);

		double n, acierto = 13;

		System.out.println("Introduzca un número: ");
		n = teclado.nextDouble();

		do {

			if (n > 13) {
				System.out.println("Introduce un número menor: ");
				n = teclado.nextDouble();
			} else {
			}
			if (n < 13) {
				System.out.println("Introduce un número mayor");
				n = teclado.nextDouble();
			}

		} while (n != acierto);
		{
			System.out.println("¡Enhorabuena! Has acertado el número.");
		}
		teclado.close();
	}
}
