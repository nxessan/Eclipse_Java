package Ejercicio1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego muestre todos sus valores
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 25/10/2022
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int num [] = new int [10];
		
		for ( int i=0; i<10;i++) {
			System.out.println("Introduce un número " + i);
			num[i] = teclado.nextInt();
		}
		
		System.out.println("Los valores de las notas introducidas son: "); 
		for ( int i =0; i<num.length; i++) {
			System.out.print(num[i] + ", ");
		}
	}
}
