package Ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Este programa leerá un número positivo y calculará su factorial mostrandolo al usuario.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 17/10/2022
		 * 
		 */

		Scanner teclado = new Scanner(System.in);

		int factor = 1;
		double N;

		System.out.println("Introduce un número: ");
		N = teclado.nextDouble();

		for (double i = 2; i <= N; i++) {
			factor = (int) (factor * i);

		}
		System.out.println("El factorial del número " + N + " es " + factor);

		teclado.close();
	}
}