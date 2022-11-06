package Ejercicio1;

import java.util.*;
		
	public class Ejercicio1 {
		
		public static void main(String[] args) {
			/* En este ejercicio se le van a solicitar al usuario su nombre, apellidos, dirección, edad, altura y peso.
				Para ello, hemos importado previamente la utilidad de Java de Scanner que es la que nos va a permitir la funcionalidad de que el usuario pueda escribir.
				Posteriormente se va a imprimir por pantalla tras cada dato el texto acompañando al dato*/
	
			
				Scanner entradaTeclado = new Scanner(System.in);
				
				String nombre;
				System.out.println("Nombre");
				nombre = entradaTeclado.nextLine();
				System.out.println("Tu nombre es: " +nombre);
				
				String apellidos;
				System.out.println("Apellidos");
				apellidos = entradaTeclado.nextLine();
				System.out.println("Tus apellidos son: " +apellidos);

				String dirección;
				System.out.println("Dirección");
				dirección = entradaTeclado.nextLine();
				System.out.println("Tu dirección es: " +dirección);
				
				int edad;
				System.out.println("Edad");
				edad = entradaTeclado.nextInt();
				System.out.println("Tu edad es: " +edad);
				
				double altura;
				System.out.println("Altura");
				altura = entradaTeclado.nextDouble();
				System.out.println("Tu altura es: " +altura);
				
				double peso;
				System.out.println("Peso");
				peso = entradaTeclado.nextDouble();
				System.out.println("Tu peso es: " +peso);
			}

}
