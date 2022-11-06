package Ejercicio2;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int dia = 0, mes;

		System.out.println("Introduce un dia: ");
		dia = teclado.nextInt();

		System.out.println("Introduce un mes: ");
		mes = teclado.nextInt();

		if (dia > 0 && dia <= 31) {
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("Es correcta");
		} else {
			if (dia > 0 && dia <= 30) {
				if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					System.out.println("Es correcta");
				} else {
					if (dia > 0 || dia <= 28) {
						if (mes == 2) {
							System.out.println("Es incorrecta");
						} else {
							System.out.println("Es incorrecta");
						}
					}
					}
				}
			}
		}
	}
}
