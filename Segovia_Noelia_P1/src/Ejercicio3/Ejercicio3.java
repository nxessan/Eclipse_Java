package Ejercicio3;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Este programa va a calcular los múltiplos de 5 o 7
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 18/10/2022
		 */
		Scanner teclado = new Scanner(System.in);

		int num, i;

		System.out.println("Introduce 5 o 7: ");
		num = teclado.nextInt();

		if (num == 5) {
			for (i = 500; i <= 700; i = i + 5) {
				System.out.println(i + " es multiplo de 5");
			}
		} else {
			if (num == 7) {
				for (i = 500; i <= 700; i = i+ 7) {
					System.out.println(i + " es multiplo de 7");
				}
			}
		}
		teclado.close();
	}
}