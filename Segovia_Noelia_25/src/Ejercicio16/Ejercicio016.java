package Ejercicio16;
import java.util.*;
public class Ejercicio016 {

	public static void main(String[] args) {

		/*	Este programa va a calcular la superficie y el volumen de una esfera a partir del valor del radio (positivo)
		 * 3
		 *  Autora: Noelia Segovia Sánchez
		 *  
		 *  Fecha: 08/10/2022
		 *  
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		double radio,altura,volumen,superficie;
		
		System.out.println("Introduzca el radio de la esfera (en positivo): ");
		radio = teclado.nextDouble();
				
		System.out.println("Introduzca la altura de la esfera (en cm): ");
		altura = teclado.nextDouble();
		
		volumen = Math.PI * (radio * 2) * altura *2;
		superficie = Math.PI * (radio * 2) * altura;
		
		System.out.println("La superficie de la esfera es " + superficie + " y el volumen " + volumen);
				
		teclado.close();			
	}
}