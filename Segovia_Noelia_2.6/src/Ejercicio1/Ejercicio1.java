package Ejercicio1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		/* Objetivo: En este programa voy a solicitar dos números al usuario y a analizar 
		si el primero es mayor, menor o igual al segundo, luego, mostraré el resultado por pantalla
		*
		* Fecha: 05/10/2022
		*   
 		* Autora: Noelia Segovia Sánchez 
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		int a,b; //declaro las variables
		
		System.out.println("Introduce el número a"); //le solicito el primer número
		a=teclado.nextInt();
		System.out.println("Introduce el número b");	//le solicito otro número
		b=teclado.nextInt();
		
		if(a>b) {												//si a es mayor que b que muestre el siguiente mensaje:
			System.out.println("El número a es mayor que b");
		}	else {    											//si no es mayor que b es que es menor o igual, por lo tanto ahora preguntamos si es igual:
					if(a==b) {									//si es igual que muestre el siguiente mensaje
						System.out.println("a y b son iguales");
					}
						else {									//si no, es que es menor
							System.out.println("a es menor que b");
							}  
				 		}
		teclado.close();
				}
	}
