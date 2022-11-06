package Ejercicio04;

import java.util.*;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*
		 * Este programa muestra los números desde el 1 hasta un número N que se
		 * introducirá por teclado.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 17/10/2022
		 * 
		 */

		Scanner teclado = new Scanner(System.in);

		int i, N;

		System.out.println("Introduce un número: ");
		N = teclado.nextInt();

		if (N > 0) { //Para que cuente hacia adelante si el número es positivo
			for (i = 1; i <= N; i = i + 1) {
				System.out.println(i);
			}
		} else {
			if (N < 0) {	//Para que cuente hacia atrás si el número es negativo
				for (i = 1; i >= N; i = i - 1) {
					System.out.println(i);
				}
			}
		}
		teclado.close();
	}
}
