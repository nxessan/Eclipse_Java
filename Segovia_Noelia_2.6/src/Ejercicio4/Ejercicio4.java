package Ejercicio4;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		/*	Objetivo: En este programa solicitaré al usuario tanto datos personales, como el importe de 4 compras que haya realizado, luego, le informaré si puede beneficiarse 
		 * 	de un descuento de 50 eruos según si ha gastado más o menos de 300 euros.
		 * 
		 *  Fecha: 05/10/2022 
		 *  
 		 * 	Autora: Noelia Segovia Sánchez 
		 */
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos;		//Declaro las variables
		double imp1,imp2,imp3,imp4, impTotal, media;
		
		System.out.println("Introduzca su nombre: ");	//solicito los datos
		nombre = teclado.nextLine();
		
		System.out.println("Introduzca sus apellidos: ");
		apellidos = teclado.nextLine();

		System.out.println("Introduzca su primer desembolso: ");
		imp1 = teclado.nextDouble();

		System.out.println("Introduzca su segundo desembolso: ");
		imp2 = teclado.nextDouble();

		System.out.println("Introduzca su tercer desembolso: ");
		imp3 = teclado.nextDouble();

		System.out.println("Introduzca su cuarto desembolso: ");
		imp4 = teclado.nextDouble();

		impTotal = imp1+imp2+imp3+imp4;			//realizo la suma de las compras
		media = impTotal / 4;					//realizo la media del importe total
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Importe Gastado1: " + Math.round(imp1) + " euros");
		System.out.println("Importe Gastado2: " + Math.round(imp2) + " euros");
		System.out.println("Importe Gastado3: " + Math.round(imp3) + " euros");
		System.out.println("Importe Gastado4: " + Math.round(imp4) + " euros");
		
		System.out.println("Importe Medio: " + Math.round(media) + " euros");
		
		if (impTotal >= 300) {					//si el importe es mayor o igual a 300 euros, informamos de que tiene descuento
			System.out.println("Usted tiene un descuento de 50 euros");
		} else {								//si no se cumple la condición anterior informamos que no tiene descuento le mostramos la ficha			
			
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");		
		}
		
		teclado.close();		
	}
}
