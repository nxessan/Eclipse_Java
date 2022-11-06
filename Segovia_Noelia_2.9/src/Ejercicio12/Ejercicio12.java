package Ejercicio12;

import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Este programa calcula el valor A elevado a B (A^B) sin hacer
		 * uso del operador de potencia (^), siendo A y B valores introducidos por
		 * teclado, y luego monstrará el resultado por pantalla.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 23/10/2022
		 * 
		 */

		Scanner teclado = new Scanner(System.in);

		double a, b, valor = 0, acum;
		int i;

		System.out.println("Introduce el valor de A: ");
		a = teclado.nextDouble();

		System.out.println("Introduce el valor de B");
		b = teclado.nextInt();

		for (i = 1; i <= b; i++) {
			acum = a * b;
			valor = acum * a;
		}

		System.out.println(valor);
		
		teclado.close();
	}
}
