package Ejercicio18;
import java.util.*;
public class Ejercicio018 {

	public static void main(String[] args) {
		
		/*	En este programa voy a calcular el nuevo horario de llegada, salida y la duración de un viaje teniendo en cuenta los nuevos vehículos
		 * 	que ahorran un 15% de tiempo.
		 * 
		 *  Autora: Noelia Segovia Sánchez
		 *  
		 *  Fecha: 08/10/2022
		 *  
		 *  */
		
		Scanner teclado = new Scanner (System.in);
		
		int salida, llegada,duracion,llegadaNuevo,duracionNuevo,conversion;
		
		System.out.println("Introduce el horario de salida (hhmm) ");
		salida = teclado.nextInt();
		System.out.println("Introduce el horario de llegada ");
		llegada = teclado.nextInt();
		
		duracion = llegada - salida;				
		
		duracionNuevo = (int) (duracion * 0.15); 			//calculo la duración nueva haciendole el 15% a la duración antigua 

		conversion = (int) (0.15*60);
		
		llegadaNuevo = llegada - duracionNuevo;  	//calculo la hora de llegada sumandole la duracion nueva a la hora de salida
		
		System.out.println("Nueva hora de salida: " + salida+  " horas");
		System.out.println("Nueva hora de llegada: " + llegadaNuevo + " horas");
		System.out.println("Nueva  duración del viaje: " + conversion + " minutos");
		
		teclado.close();	
	}

}
