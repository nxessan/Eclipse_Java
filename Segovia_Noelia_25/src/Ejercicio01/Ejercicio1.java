package Ejercicio01;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		/* Este programa va a preguntar al usuario cómo se llama y va a imprimir 
		por pantalla una respuesta contestándole llamándole por su nombre.
		*
		*	Autora: Noelia Segovia Sánchez
		*
		* 	Fecha: 05/10/2022
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;

		System.out.println("¿Cómo te llamas?"); //solicita el nombre
		nombre = teclado.next();	

		System.out.println("Hola " +nombre);	//contestación
		
		teclado.close();
		
	}

}
