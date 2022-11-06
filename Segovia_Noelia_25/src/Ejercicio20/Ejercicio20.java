package Ejercicio20;
import java.util.*;
public class Ejercicio20 {

	public static void main(String[] args) {
		/* En este programa vamos a indicar el numero minimo de billetes y las monedas
		 *  que sobran de un importe en euros para tener dicha cantidad 
		 *  
		 * Autora: Noelia Segovia Sánchez
		 *
		 * Fecha: 08/10/2022
		 *
		 */

		Scanner teclado = new Scanner(System.in);
		
		int quinientos, doscientos, cien, cincuenta, veinte, diez, cinco, dos, uno, cincuentaCent, veinteCent, diezCent, cincoCent, dosCent, unCent;
		double importe, sobrante;
		
		System.out.println("Introduce el importe en euros: ");
		importe=teclado.nextDouble();
		
				
			quinientos=(int) (importe/500);
			sobrante=importe%500;
						
			doscientos=(int) (sobrante/200);
			sobrante=sobrante%200;
				
			cien=(int) (sobrante/100);
			sobrante=sobrante%100;
				
			cincuenta=(int) (sobrante/50);
			sobrante=sobrante%50;
				
			veinte=(int) (sobrante/20);
			sobrante=sobrante%20;
				
			diez=(int) (sobrante/10);
			sobrante=sobrante%10;
				
			cinco=(int) (sobrante/5);
			sobrante=sobrante%5;
			
			dos=(int) (sobrante/2);
			sobrante=sobrante%2;
				
			uno=(int) (sobrante/1);
			sobrante=sobrante%1;
		
			cincuentaCent=(int) (sobrante/0.5);
			sobrante=sobrante%0.5;
			
			veinteCent=(int) (sobrante/0.2);
			sobrante=sobrante%0.2;
			
			diezCent=(int) (sobrante/0.1);
			sobrante=sobrante%0.1;
			
			cincoCent=(int) (sobrante/0.05);
			sobrante=sobrante%0.05;
			
			dosCent=(int) (sobrante/0.02);
			sobrante=sobrante%0.02;
			
			unCent=(int) (sobrante/0.01);
			sobrante=sobrante%0.001;
				
			System.out.println(quinientos + " billete de 500 euros");
			System.out.println(doscientos+ " billetes de 200 euros");
			System.out.println(cien+ " billetes de 100 euros");
			System.out.println(cincuenta+ " billetes de 50 euros");
			System.out.println(veinte+ " billetes de 20 euros");
			System.out.println(diez+ " billetes de 10 euros");
			System.out.println(cinco+ " billetes de 5 euros");
			System.out.println(dos + " monedas de 2 euros");
			System.out.println(uno + " monedas de 1 euros");
			System.out.println(cincuentaCent + " monedas de 50 centimos");				
			System.out.println(veinteCent + " monedas de 20 centimos");				
			System.out.println(diezCent + " monedas de 10 centimos");				
			System.out.println(cincoCent + " monedas de 5 centimos");
			System.out.println(dosCent + " monedas de 2 centimos");				
			System.out.println(unCent + " monedas de 1 centimos");		
			
			teclado.close();
	}
}		