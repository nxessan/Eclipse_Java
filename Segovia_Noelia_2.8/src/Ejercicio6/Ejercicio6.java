package Ejercicio6;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Este programa va a solicitar un número al usuario y va a mostrar su cuadrado
		 * hasta que introduzca un valor negativo
		 *
		 * Autora: Noelia Segovia Sánchez
		 *
		 * Fecha: 15/10/2022
		 */

		Scanner teclado = new Scanner(System.in);

		double num = 0;

		do {	//Bucle do para que haga la potencia del número introducido
			System.out.println("Introduzca un número");
			num = teclado.nextDouble();

			System.out.println("El cuadrado de " + num + " es " + Math.pow(num, 2));

		} while (num > 0);	//Bucle while para que haga el do mientras el número introducido sea mayor a 0
		{

		}
		System.out.println("Usted introdujo un número negativo, el programa ha terminado.");

		teclado.close();
	}

}
