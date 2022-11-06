package Ejercicio4;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * En este programa voy a pedir al usuario que introduzca valores positivos,
		 * almacenaré la suma de todos los valores y la cantidad de números
		 * introducidos. El programa parará cuando el usuario introduzca un 0. Luego,
		 * imprimiré por pantalla la cantidad de números mayores a 0 ha introducido el
		 * usuario así como la media de los mismos.
		 * 
		 * Autora: Noelia Segovia Sanchez
		 * 
		 * Fecha: 15/10/2022
		 */

		Scanner teclado = new Scanner(System.in);

		int introducidos = 0;

		double media = 0, num = 1, suma = 0;

		while (num != 0) {	//Como no sabemos en qué vuelta del bucle el usuario introducirá un 0, uso un while
			System.out.println("Introduce un número positivo: (0 para salir) ");
			num = teclado.nextDouble();

			suma = num + suma;

			introducidos = introducidos + 1;

		}

		introducidos = introducidos - 1; //Le resto uno para que no cuente el 0 para la media
		media = suma / introducidos;

		System.out.println("La cantidad de números mayores de 0 introducidos ha sido: " + introducidos + " y la media es: " + media);

		teclado.close();
	}
}