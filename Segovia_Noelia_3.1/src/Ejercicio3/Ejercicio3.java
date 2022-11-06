package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
		 * pantalla.
		 * 
		 * 
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 25/10/2022
		 */

		int num [] = new int [10];
		int suma=0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Introduce un número: ");
			num [i] = teclado.nextInt();
			suma = suma + num[i];
		}
		
		System.out.println("El número mayor es: ");
	}
}
