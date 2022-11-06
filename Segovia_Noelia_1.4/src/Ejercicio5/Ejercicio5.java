package Ejercicio5;
import java.util.*;
/* /*El objetivo de este programa es que solicite dos números al usuarios y haga distintos cálculos de la 
		 *clase Math mostrando el resultado por pantalla, estos estarán especificados en su línea correspondiente
 * 
 *   Fecha: 03/10/2022
 *   
 * Autora: Noelia Segovia Sánchez 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double num1, num2,num3;
		System.out.println("Introduzca el primer número"); //Solicito el primer número
		num1 = teclado.nextInt();
		
		System.out.println("Introduzca el segundo número"); //Solicito el segundo número
		num2 = teclado.nextInt(); 
			
		System.out.println("El número menor es: " + Math.min(num1, num2)); //Analiza qué número es el menor
		System.out.println("El resultado del primer número elevado al segundo es: " + Math.pow(num1, num2)); //Potencia del primer número elevado al segundo
		System.out.println("La raíz cuadrada del primer número es: " + Math.sqrt(num1)); //Raíz cuadrada del primer número
		
		num3 = num2 + Math.random(); //creamos una variable donde sumamos el número 2 más un número random (entre 0 y1)
		System.out.println("El valor random del segúndo numero es: " + num3); //Valor random del segundo número
		teclado.close();
	}
}
