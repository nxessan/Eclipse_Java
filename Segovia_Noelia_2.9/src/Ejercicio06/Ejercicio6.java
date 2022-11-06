package Ejercicio06;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa Java que lea 100 números no nulos y luego muestre un
		 * mensaje de si ha leído algún número negativo o no.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 17/10/2022
		 * 
		 */

		int i = 0, num, contNeg = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduce un número.");
			num = teclado.nextInt();
			if (num < 0) {
				contNeg = contNeg + 1;
			}
			if (num != 0) {
				i = i + 1;
			}

		} while (i < 100);

		if (contNeg == 0) {
			System.out.println("No se ha leído ningún número negativo");
		} else {
			if (contNeg > 0) {
				System.out.println("Se han registrado números negativos.");
			}
		}

		teclado.close();
	}
}
