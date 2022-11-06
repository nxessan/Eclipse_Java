package Ejercicio3;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		/* Objetivo: En este programa voy a solicitar la edad al usuario, si es menor de edad le informaré que no cumple con la edad requerida, sin embargo, 
		 * si cumple con la edad le pediré más datos y le mostraré la ficha recopilando todos los datos junto con la conclusiónn de que es admitido.
		 * 
		 * Fecha: 05/10/2022 
		 * 
		 * Autora: Noelia Segovia Sánchez */

		Scanner teclado = new Scanner (System.in);
		
		String nombre, apellidos;					//declaro las variables
		int edad,fecha;
		
		System.out.println("Introduzca su edad: ");	//solicito la edad
		edad = teclado.nextInt();
		
		if (edad < 18) {	//si es menor de 18 que muestre el siguiente mensaje:
			System.out.println("No tiene la edad requerida para realizar estos estudios");			
		} else {			//si no es menor de edad que introduzca los siguientes datos:				
			teclado.nextLine();
			
			System.out.println("Introduzca su nombre");
			nombre = teclado.nextLine();
			
			System.out.println("Introduzca sus apellidos");
			apellidos = teclado.nextLine();
			
			System.out.println("Introduzca su fecha de nacimiento (dd MM YYYY)");
			fecha = teclado.nextInt();

			System.out.println("Nombre: " + nombre);	//muestro la ficha con los datos introducidos
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			
			
			System.out.println("Usted ha sido admitido");	//le indico que ha sido admitido
		}
	teclado.close();
	}

}
