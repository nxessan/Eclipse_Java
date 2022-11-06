package Ejercicio21;
import java.util.*;
public class Ejercicio21 {

	public static void main(String[] args) {
		/* En este ejercicio voy a calcular la nota necesaria del segundo examen de Programacion para tener la media deseada.
		*	la nota dle primer examen cuenta el 40% y la del segundo el 60%
		*
		*Autora: Noelia Segovia Sánchez
		*
		*Fecha: 08/10/2022
		*/
		
		Scanner teclado = new Scanner(System.in);
				
		double notaDeseada, notaPrimerEx,notaSegundoEx, notafinalSegundo;
		System.out.println("Introduzca la nota deseada: ");
		notaDeseada = teclado.nextDouble();
		
		System.out.println("Introduzca la nota del primer examen: ");
		notaPrimerEx = teclado.nextDouble();
		
		notaSegundoEx = (notaDeseada - 0.4*notaPrimerEx) /0.6;
		
		System.out.println("Tendrías que sacar un " + notaSegundoEx + " para tener la media deseada");
		
		teclado.close();
	}
}
