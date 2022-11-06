package Ejercicio3;
import java.util.*;
/* En este programa voy a solicitar al usuario dos valores numéricos 
 * y cuando lo imprima por pantalla mostraré los resultados cambiados
 * creando otras dos variables para así almacenar  
 * 
 *   Fecha: 03/10/2022
 *   
 * Autora: Noelia Segovia Sánchez 
 *  */
public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int A, B, C;
		System.out.println("Introduzca el valor de a"); //pido el valor de A
		A = teclado.nextInt(); 
		
		System.out.println("Introduzca el valor de b"); //pido el valor de B
		B = teclado.nextInt();
				
		C = B; // aquí estoy guardando el valor de B en la variable C
		B = A; //aquí estoy guardando el valor de A en B ya que B la tengo guardada en C
		A = C;// aquí guardo el valor de C (antiguo B) en A
		System.out.println("El valor de a es " +A +" y el valor de B es " +B); //Resultado con los valores intercambiados
		
		teclado.close();
	}
}

