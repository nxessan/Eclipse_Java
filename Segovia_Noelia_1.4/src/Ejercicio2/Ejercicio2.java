package Ejercicio2;
import java.util.*;

public class Ejercicio2 {
	/* En este programa voy a realizar un conversor de euros a pesetas y viceversa. 
	 * Teniendo el valor de una peseta, lo que haré será multiplicar la cantidad de euros por ese valor.
	 * Luego, mostrare los resultados por pantalla.
	 * 
	 *   Fecha: 03/10/2022
	 *   
	 * Autora: Noelia Segovia Sánchez 
	 *  */
	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		double euros;
		System.out.println("Introduzca la cantidad en euros"); //solicitar la cantidad en euros
		euros = teclado.nextDouble();
		
		double pesetas = euros * 166.386; // hago la convesion
		System.out.println( + euros +" euro/s son " + pesetas +" pesetas"); //resultado en pesetas
		
		
		System.out.println("Introduzca la cantidad en pesetas"); //solicitar la cantidad en pesetas
		pesetas = teclado.nextDouble();
		System.out.println( + pesetas +" peseta/s son " + euros +" euros"); //resultado en euros
		
		teclado.close();
	}
}
