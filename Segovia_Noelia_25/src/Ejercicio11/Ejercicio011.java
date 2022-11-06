package Ejercicio11;
import java.util.*;
public class Ejercicio011 {

	public static void main(String[] args) {
		
		/*	En este programa voy a calcular el total de una factura solicitando 
		 * 	previamente al usuario que introduzca el importe de la base imponible
		 * 
		 *  Autora: Noelia Segovia Sánchez
		 *  
		 *  Fecha: 08/10/2022
		 *  
		 *  */
		
		Scanner teclado = new Scanner (System.in);
		
		double base, total;
		
		System.out.println("Introduzca la base imponible: ");
		base = teclado.nextDouble();
		
		total=base*1.21;
		
		System.out.println("El total de la factura es " + total);	
		
		teclado.close();
	}

}
