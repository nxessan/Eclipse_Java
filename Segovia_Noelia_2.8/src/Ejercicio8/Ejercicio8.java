package Ejercicio8;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * En este programa voy a pedir al usuario una serie de datos referentes a rutas
		 * de senderismo y luego calculará una media, la distancia más larga de todas
		 * las que introduzca, así como la ciudad a la que pertenece dicha distancia.
		 * 
		 * Autora : Noelia Segovia Sánchez
		 * 
		 * Fecha: 15/10/2022
		 */

		Scanner teclado = new Scanner(System.in);

		String nom, ape, ciudad = null, ciudadRutLarga= " ";
		int edad, rutas, partic, i, cont = 0;
		double distUltRuta, distancia, sumaDist = 0, mayorDist = 0, media;

		System.out.println("Introduzca su nombre: ");
		nom = teclado.nextLine();

		System.out.println("Introduzca sus apellidos: ");
		ape = teclado.nextLine();

		System.out.println("Introduzca su edad: ");
		edad = teclado.nextInt();

		while (edad < 17 || edad > 45) {   //Bucle while para que la edad que introduzca no supere los límites
			System.out.println("La edad introducida es incorrecta, por favor, introduzca una edad válida: ");
			edad = teclado.nextInt();
		}

		System.out.println("¿Cuántas rutas ha realizado?");
		rutas = teclado.nextInt();

		System.out.println("¿Cuál fue la distancia recorrida en la última ruta realizada?");
		distUltRuta = teclado.nextDouble();

		for (i = 1; i <= 5; i++) {		//Bucle for para solicitar los datos de ruta un número de 5 veces

			System.out.println("Introduzca la distancia de la ruta " + i);
			distancia = teclado.nextDouble();
			sumaDist = sumaDist + distancia;	//Sumatorio para luego hacer la media

			System.out.println("Introduzca el número de participantes en la ruta " + i);
			partic = teclado.nextInt();

			teclado.nextLine(); // Reiniciar el Scanner

			System.out.println("¿En qué ciudad se encuentra la ruta " + i + " ?");
			ciudad = teclado.nextLine();

			if (distancia > mayorDist) {	//Bucle if para que guarde la distancia de la última ruta introducida, si ésta es mayor a la distancia de la ruta anterior
				mayorDist = distancia;
				ciudadRutLarga = ciudad;
			}
		}

		System.out.println("----------------------------------------");
		System.out.println("Nombre: " + nom);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + rutas);

		System.out.println();

		System.out.println("Distancia media: " + (media = sumaDist / 5));
		System.out.println("Distancia más larga de las últimas 5 rutas: " + mayorDist);
		System.out.println("Ciudad de la ruta más larga: " + ciudad);
		System.out.println("----------------------------------------");

		teclado.close();

	}
}
