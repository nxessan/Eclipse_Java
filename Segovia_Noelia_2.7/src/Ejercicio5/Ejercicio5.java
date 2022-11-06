package Ejercicio5;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		/* 
		 * Este programa va a ser una calculadora donde se solicitarán dos valores al usuario
		 * después, este seleccionará la operaión a realizará la operación indicada y la mostrará los datos al usuario
		 *
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 09/10/2022
		 * 
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		double num1, num2;
		int operacion;
		
		System.out.println("Introduzca el valor 1: ");
		num1 = teclado.nextDouble();
		
		System.out.println("Introduzca el valor 2: ");
		num2 = teclado.nextDouble();
		
		System.out.println("Introduzca la operación que quiere realizar (Inserte un número del 1 al 4)");	
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		operacion = teclado.nextInt();

		System.out.println("-------------------");
		
		switch (operacion) {
				case 1: {
					System.out.println("Resultado: " + (num1 + num2)); break;
				}
				case 2: { 
					System.out.println("Resultado: " + (num1 - num2)); break;
				}
				case 3: { 
					System.out.println("Resultado: " + (num1 * num2)); break;
				}
				case 4 :{
					System.out.println("Resultado: " + (num1 / num2)); break;
				}
		}	
	teclado.close();
	}
}