package Ejercicio08;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa Java que lea una secuencia de números no nulos hasta que
		 * se introduzca un 0, y luego muestre si ha leído algún número negativo,
		 * cuantos positivos y cuantos negativos.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 20/10/2022
		 */

		int i = 0, num, contNeg = 0, contPos=0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduce un número.");
			num = teclado.nextInt();
			if (num < 0) {
				contNeg = contNeg + 1;
			} else {
				if(num>0) {
					contPos = contPos +1;
				}
			}

		} while (num != 0);

		if (contNeg == 0) {
			System.out.println("No se ha leído ningún número negativo");
		} else {
			if (contNeg > 0) {
				System.out.println("Se han registrado números negativos.");
			}
		}

		System.out.println("Positivos: " + contPos);
		System.out.println("Negativos: " + contNeg);

		teclado.close();
	}
}
