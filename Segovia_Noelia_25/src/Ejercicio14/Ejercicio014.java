package Ejercicio14;

import java.util.Scanner;

public class Ejercicio014 {

	public static void main(String[] args) {

		/*	Este programa va a ser un conversor de Kb a mb
		 * 
		 *  Autora: Noelia Segovia Sánchez
		 *  
		 *  Fecha: 08/10/2022
		 *  
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		double kb;
		
		System.out.println("Introduce una cantidad de Kb");
		kb = teclado.nextDouble();
		
		System.out.println(kb + " kb son " + Math.round(kb/1000) + " Mb");
		
		teclado.close();		
	}

}