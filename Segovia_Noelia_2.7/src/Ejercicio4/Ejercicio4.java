package Ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		/* En este programa voy a solicitar al usuario 4 notas de asignaturas, calcularé la media 
		 * y se la mostraré luego le mostraré la nota media redondeada hacia arriba y luego la nota 
		 * media redondeada hacia abajo. Luego le informaré mediante una condicional si puede o no acceder a estudios superiores
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 09/10/2022
		*/
		
		Scanner teclado = new Scanner (System.in);
		
		double PRO, ED, BD, LM, media;
		
		System.out.println("Introduzca su nota media en Programación");
		PRO = teclado.nextDouble();
		
		System.out.println("Introduzca su nota media en Entorno de Desarrollo");
		ED = teclado.nextDouble();
		
		System.out.println("Introduzca su nota media en Base de Datos");
		BD = teclado.nextDouble();
		
		System.out.println("Introduzca su nota media en Lenguaje de Marcas");
		LM = teclado.nextDouble();
		
		media = PRO + ED + BD + LM / 4;
		
		System.out.println("El redondeo se su nota hacia arriba es: " + Math.ceil(media));
		System.out.println("El redondeo se su nota hacia abajo es: " + Math.floor(media));
		
		if (media >=8) {
			System.out.println("Usted puede acceder a estudios superiores");
		}	else {
			System.out.println("La nota obtenida no es suficiente para acceder a los estudios que deseaba");
			}	
		
		teclado.close();
	}

}
