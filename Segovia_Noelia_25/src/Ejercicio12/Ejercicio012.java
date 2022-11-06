package Ejercicio12;
import java.util.*;
public class Ejercicio012 {

	public static void main(String[] args) {

		/*	En este programa voy a calcular el salario semanal de un empleado en base a las horas
		 *	trabajadas, a razón de 12 euros la hora.
		 * 
		 *  Autora: Noelia Segovia Sánchez
		 *  
		 *  Fecha: 08/10/2022
		 *  
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		double horas, resultado;
		
		System.out.println("¿Cuántas horas en total ha trabajado?");
		horas = teclado.nextDouble();
		
		resultado = horas * 12;
		 
		System.out.println("El salario semanal del trabajador es: " + resultado + " euros");
		teclado.close();
	}

}
