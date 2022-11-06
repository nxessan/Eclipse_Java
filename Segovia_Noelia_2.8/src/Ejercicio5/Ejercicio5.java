package Ejercicio5;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Este programa va a solicitar 10 números, va a mostrar la media de los
		 * positivos, la media de los negativos y la cantidad de cero.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 15/10/2022
		 */

		Scanner teclado = new Scanner(System.in);

		double num, sumaPos = 0, sumaNeg = 0, medPos = 0, medNeg = 0;
		int ceros = 0, introducidosPos = 0, introducidosNeg = 0, i;

		for (i = 1; i <= 10; i++) { // Bucle for para solicitar un total de 10 números

			System.out.println("Introduce un número (entero o decimal): ");
			num = teclado.nextDouble();

			if (num > 0) {
				sumaPos = sumaPos + num;
				introducidosPos = introducidosPos + 1;
				medPos = sumaPos / introducidosPos;
			} else {
				if (num < 0) {
					sumaNeg = sumaNeg + num;
					introducidosNeg = introducidosNeg + 1;
					medNeg = sumaNeg / introducidosNeg;
				} else {
					if (num == 0) {
						ceros = ceros + 1;
					}
				}
			}
		}

		System.out.println("La media de los números positivos es: " + medPos);
		System.out.println("La media de los números negativos es: " + medNeg);
		System.out.println("La cantidad de ceros introducidos han sido: " + ceros);

		teclado.close();
	}
}
