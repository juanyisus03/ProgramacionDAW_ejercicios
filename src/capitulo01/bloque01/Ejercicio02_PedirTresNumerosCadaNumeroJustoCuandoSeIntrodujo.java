package capitulo01.bloque01;
/*
* Realiza un programa igual al anterior, con la particularidad de que 
* ahora se debe mostrar cada número justo a continuación del momento en que 
* ha sido introducido.
*/

import java.util.Scanner;

public class Ejercicio02_PedirTresNumerosCadaNumeroJustoCuandoSeIntrodujo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero entero: ");
		int numEntero = sc.nextInt();
	
		System.out.println("Introduzca numero flotante: ");
		float numFlotante = sc.nextFloat();
		
	
		System.out.println("Introduzca numero doublEnteroe: ");
		double numDouble = sc.nextDouble(); 
	
		
		System.out.println("El numero entero es " + numEntero);
		System.out.println("El numero flotante es " + numFlotante);
		System.out.println("El numero double es " + numDouble);
	}
	
	
}
