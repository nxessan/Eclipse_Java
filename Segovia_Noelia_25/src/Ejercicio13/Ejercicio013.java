package Ejercicio13;
import java.util.*;
public class Ejercicio013 {

	public static void main(String[] args) {

		/*	Este programa va a ser un conversor de Mb a Kb
		 * 
		 *  Autora: Noelia Segovia Sánchez
		 *  
		 *  Fecha: 08/10/2022
		 *  
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		double mb;
		
		System.out.println("Introduce una cantidad de Mb");
		mb = teclado.nextDouble();
		
		System.out.println(mb + " Mb son " + Math.round(mb*1000) + " Kb");
		
		teclado.close();		
	}

}
