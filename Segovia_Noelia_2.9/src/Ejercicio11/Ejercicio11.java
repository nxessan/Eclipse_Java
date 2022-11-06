package Ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa Java que suma independientemente los pares y los impares
		 * de los números comprendidos entre 100 y 200, y luego muestra por pantalla
		 * ambas sumas.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 23/10/2022
		 * 
		 */

		int pares = 0, impares = 0, i;

		for (i = 100; i <= 200; i = i + 1) {
			if (i % 2 == 0) {
				pares = pares + i;
			} else {
					impares = impares + i;
				
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
	}
}
