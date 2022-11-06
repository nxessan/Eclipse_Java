package Ejercicio03;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*
		 * Este programa muestra los números pares entre el 1 y el 200. Utilizaré un
		 * contador sumando de 1 en 1.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 17/10/2022
		 */
		int i;

		for (i = 1; i <= 200; i = i + 1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
