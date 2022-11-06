package Ejercicio1;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Objetivo: En este ejercicio voy a solicitar unos datos al usuario 
		  con el objetivo de calcular su salario neto aplicandole un 15% de IRPF.
		  Por último, calcularé un aumento en el sueldo de un 1% según los años que haya trabajado.
		
		 Fecha: 03/10/2022
		 
		 Autora: Noelia Segovia Sánchez */
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Introduzca su nombre");
		nombre = teclado.nextLine();

		String apellidos;
		System.out.println("Introduzca sus apellidos");
		apellidos = teclado.nextLine();
		
		String fecha;
		System.out.println("Introduzca su fecha de nacimiento");
		fecha = teclado.nextLine();
		
		double salarioBruto;
		System.out.println("Introduzca su salario bruto");
		salarioBruto = teclado.nextDouble();
		
		int añosTrabajados;
		System.out.println("¿Cuántos años ha trabajado en la empresa?");
		añosTrabajados = teclado.nextInt();
		
		double salarioNeto = (salarioBruto - 0.15 * salarioBruto);
		System.out.println("el salario neto es "+salarioNeto);
		
		System.out.println("Estimad@ " +nombre +apellidos +", su salario bruto es " +salarioBruto +", teniendo en cuenta un IRPF del 15% su salario neto es " +salarioNeto);

		double aumento = (añosTrabajados * 0.01 * salarioBruto);
		double salarioTotal = (salarioBruto + aumento);
		
		
		System.out.println("Debido a sus " + añosTrabajados +" años trabajando en la empresa su salario se incrementará en un 1% por cada año. El aumento es de " +aumento +" y el salario total es " +salarioTotal);

		teclado.close();
	}

}
