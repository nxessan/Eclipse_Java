package Ejercicio15;
import java.util.*;
public class Ejercicio015 {

	public static void main(String[] args) {

		/*	Este programa va a transformar la temperatura en grados Fahrenheit a
		 *	grados Celsius (Info: 0ºC==32F y c=(F-32)/1.8)
		 * 
		 *  Autora: Noelia Segovia Sánchez
		 *  
		 *  Fecha: 08/10/2022
		 *  
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		double fahrenheit, resultado;
		
		System.out.println("Introduzca la cantidad de grados en Fahrenheit: ");
		fahrenheit = teclado.nextDouble();
		
		resultado = fahrenheit - 32;
		resultado = resultado / 1.8;
		
		System.out.println(fahrenheit + " Fahrenheit son: " + resultado + " Celsius");
		
		teclado.close();	
	}

}
