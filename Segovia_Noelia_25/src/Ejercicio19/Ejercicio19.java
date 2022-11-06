package Ejercicio19;
import java.util.*;
public class Ejercicio19 {

	public static void main(String[] args) {
		
		/* En este programa voy a realizar la conversión de segundos a horas, minutos y segundos del valor de una variable 
		*
		*Autora: Noelia Segovia Sánchez
		*
		*Fecha: 08/10/2022
		*
		**/
		
		Scanner teclado = new Scanner (System.in);
		
		int tiempo,segundos, minutos, horas;
		
		System.out.println("Introduce el tiempo estimado en segundos");
		tiempo = teclado.nextInt();
		
		horas = tiempo / 3600;
		minutos = (tiempo -(3600 * horas)) / 60;
		segundos = tiempo - ((horas*3600)+(minutos*60));
		
		System.out.println(tiempo + " segundos son " + horas + " hora/s " + minutos + " minunto/s y " + segundos + " segundo/s");
		
		teclado.close();
	}
}
