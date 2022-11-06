package Ejercicio2;

import java.util.*;
		
	public class Ejercicio2 {

		public static void main(String[] args) {
			/* En este programa vamos a solicitar los datos de un equipo de futbol.
			 * Para ello he a importado el Scanner y voy a crear 3 variables de tipo 
			 * String y 1 de tipo int. Tras introducir todos los datos, el usuario verá el 
			 * resultado que será un texto donde se definen los datos acompañados de un texto.
			 */
			
				
				Scanner input = new Scanner(System.in);
				
				String equipo;
				System.out.println("Escriba el nombre del Equipo");
				equipo = input.nextLine();

				String estadio;
				System.out.println("Escriba el nombre del Estadio");
				estadio = input.nextLine();

				String capitán;
				System.out.println("Escriba el nombre del Capitán");
				capitán = input.nextLine();
				
				int año;
				System.out.println("Año de fundación");
				año = input.nextInt();
				
				System.out.println("**************************************************************************************");
				System.out.println("******* Nombre del Equipo: " +equipo +"***********************************************");
				System.out.println("******* Estadio: " +estadio +"*************************************************************** ");
				System.out.println("****** Capitán: " +capitán + "****************************************************************");
				System.out.println(" ******* Fundado en: " +año +"************************************************************* ");


				
			}

}
