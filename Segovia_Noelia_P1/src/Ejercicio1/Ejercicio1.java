package Ejercicio1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Este programa va a calcular la nota de la evaluación de un alumno. ésta se
		 * redondeará al alza, de ella las actividades valdrán un 40% y las pruebas un
		 * 60%. El alumno ha realizado 3 actividades y 2 pruebas
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 18/10/2022
		 */

		Scanner teclado = new Scanner(System.in);
		double act1, act2, act3, prueba1, prueba2, mediaAct, mediaPrueba, notaEv;

		System.out.println("Introduzca la nota de la 1ª actividad: ");
		act1 = teclado.nextDouble();

		System.out.println("Introduzca la nota de la 2ª actividad: ");
		act2 = teclado.nextDouble();

		System.out.println("Introduzca la nota de la 3ª actividad: ");
		act3 = teclado.nextDouble();

		System.out.println("Introduzca la nota de la 1ª prueba: ");
		prueba1 = teclado.nextDouble();

		System.out.println("Introduzca la nota de la 2ª prueba: ");
		prueba2 = teclado.nextDouble();

		mediaAct = (act1 + act2 + act3) / 3;

		mediaPrueba = (prueba1 + prueba2) / 2;

		notaEv = (mediaAct * 0.4 + mediaPrueba * 0.6);

		System.out.println("La nota de la evaluación es: " + Math.ceil(notaEv));
		
		teclado.close();

	}
}
