package Ejercicio4;
import java.util.*;
/* En este programa voy a solicitar al usuario dos valores numéricos 
 * y cuando lo imprima por pantalla mostraré los resultados cambiados
 * creando otras dos variables para así almacenar  
 * 
 *   Fecha: 03/10/2022
 *   
 * Autora: Noelia Segovia Sánchez 
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		double a;
		System.out.println("Introduzca un valor numérico decimal"); //Solicito el número
		a = teclado.nextDouble();
		
		System.out.println("El valor introducido con la función ceil es: " + Math.ceil(a)); //Le devuelvo el número redondeado hacia el más grande
		
		System.out.println("El valor introducido con la función floor es: " + Math.floor(a)); //Le devuelvo el número redondeado hacia el más pequeño
		
		System.out.println("El valor introducido con la función round es:" + Math.round(a)); /*Le devuelvo el número redondeado, según si el decimal es
																							   mayor o menor que 5, se redondea hacia el más alto o más bajo y sin decimales*/
		teclado.close();
	}

}
