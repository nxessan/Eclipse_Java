package Ejercicio3;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		/* 
		 * En este programa voy a solicitarle al usuario su nota e informarle de la correspondinete calificación
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * 	Fecha: 08/10/2022
		 */
		Scanner teclado = new Scanner(System.in);
		
		int nota;
		System.out.println("Introduzca su nota: ");
		nota = teclado.nextInt();
		
		switch (nota) {
			case 0, 1, 2, 3, 4: {
				System.out.println(nota + " (Insuficiente)");
				break;
			}	
			case 5: {
				System.out.println(nota + " (Aprobado)");
			}	break;
			case 6: {
				System.out.println(nota + " (Bien)");
			}	break;
			case 7, 8: {
				System.out.println(nota + " (Notable)");
				break;
			}
			case 9: {
				System.out.println(nota + " (Sobresaliente)");
				break;
			}	
			case 10: {
				System.out.println(nota + " (Matricula de honor)");
				break;
			}
			default: {
				System.out.println("La nota introducida es incorrecta");
				break;
			}
		}
		teclado.close();
	}
}
