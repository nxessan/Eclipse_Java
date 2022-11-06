package Ejercicio02;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		/* En este programa se va a solicitar unos datos al usuario, almacenarlos y luego se va a imprimir una ficha por pantalla
		*
		*	Autora: Noelia Segovia Sánchez
		*
		* 	Fecha: 05/10/2022
		*/
		Scanner teclado = new Scanner(System.in);
		
		String nom, dir;
		int tlf;
		
		System.out.println("¿Cuál es su nombre?");
		nom = teclado.nextLine();
		
		System.out.println("¿Cuál es su dirección?");
		dir = teclado.nextLine();

		System.out.println("¿Cuál es su teléfono?");
		tlf = teclado.nextInt();

		
		System.out.println("Nombre: " + nom);		
		System.out.println("Dirección: " + dir);
		System.out.println("Ciclo Formativo: " + tlf);
		
		teclado.close();		
	}

}
