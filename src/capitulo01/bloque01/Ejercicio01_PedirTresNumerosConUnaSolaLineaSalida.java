package capitulo01.bloque01;
/*
 * 1.- Realiza un programa que pida al usuario tres números:
 *  uno de tipo entero, otro de tipo flotante y otro de tipo doble.
 *   A continuación se tienen que mostrar en pantalla los tres números 
 *   en una sola fila de la consola de salida.
 */

import java.util.Scanner;

public class Ejercicio01_PedirTresNumerosConUnaSolaLineaSalida {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero entero: ");
		int numEntero = sc.nextInt();
	
		System.out.println("Introduzca numero flotante: ");
		float numFlotante = sc.nextFloat();
		
	
		System.out.println("Introduzca numero double: ");
		double numDouble = sc.nextDouble();
	
		System.out.println("El numero entero es " + numEntero +". El numero flotante es " + numFlotante + ". El numero double es " + numDouble );

	    }
		
}
