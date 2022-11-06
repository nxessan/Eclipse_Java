package Ejercicio2;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		/* Objetivo:En este programa voy a solicitar al usuario la edad y la nota, 
		*	si cumple los dos requisitos (mayor de 18 y más de un 7) tendrá plaza, si no, no será admitido 
		*
		*  Fecha: 05/10/2022
		*  
		* 	Autora: Noelia Segovia Sánchez 
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		double nota;
		
		System.out.println("Introduzca su edad: ");				//solicito la edad
		edad = teclado.nextInt();
		System.out.println("Introduzca su nota academica: ");	//solicito la nota
		nota = teclado.nextDouble();
		
		if (edad >= 18 && nota >= 7) {							//si la edad es mayor o igual a 18 y la nota es mayor o igual a 7 que muestre que ha cumplido los requisitos
				System.out.println("Usted ha sido admitido en el curso, cumple las condiciones requeridas");
			} else {											//si no, que muestre que no ha cumplido los requisitos.
				System.out.println("Lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");			
		}
		teclado.close();
	}

}
