package Ejercicio07;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa Java que lea 100 números no nulos y luego muestre un
		 * mensaje indicando cuántos son positivos y cuantos negativos.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 17/10/2022
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
			if (num != 0) {
				i = i + 1;
			}

		} while (i < 100);

		System.out.println("Positivos: " + contPos);
		System.out.println("Negativos: " + contNeg);

		teclado.close();
	}
}