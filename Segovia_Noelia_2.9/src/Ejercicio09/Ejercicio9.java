package Ejercicio09;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa Java que calcula y escribe la suma y el producto de los
		 * 10 primeros números naturales.
		 * 
		 * Autora: Noelia Segovia Sánchez
		 * 
		 * Fecha: 20/10/2022
		 */

		int suma = 0, producto = 1, j = 1;

		System.out.println("Suma:");

		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
			System.out.println(suma + " + " + i + " = " + suma);
		}

		System.out.println();
		System.out.println("Producto:");
		while (j <= 10) {
			producto = producto * j;
			System.out.println(producto + " * " + j + " = " + producto);
			j = j + 1;
		}
	}
}
