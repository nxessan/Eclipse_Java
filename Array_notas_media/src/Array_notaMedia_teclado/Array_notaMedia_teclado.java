package Array_notaMedia_teclado;

import java.util.*;

public class Array_notaMedia_teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int i, suma = 0, media;
		int notas[] = new int[7];

		for (i = 0; i < notas.length; i = i + 1) {
			System.out.println("Introduce un número");
			notas[i] = teclado.nextInt();
		}

		for (i = 0; i < notas.length; i = i + 1)
			;
		suma = suma + notas[i];

		System.out.println("Las notas introducidas son: ");

		for (i = 0; i < notas.length; i = i + 1)
			;
		{
			System.out.print(notas[i] + " ");
		}
		System.out.println();
		System.out.println("La media es: " + (suma / notas.length));
	}
}
