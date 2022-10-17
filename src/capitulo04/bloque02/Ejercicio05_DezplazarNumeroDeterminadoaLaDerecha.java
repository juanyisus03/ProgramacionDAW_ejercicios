package capitulo04.bloque02;

/*
 * Realiza un ejercicio igual al anterior, pero en el que el usuario 
 * pueda indicar la cantidad de posiciones que deseamos desplazar.
 */

import java.util.Scanner;

public class Ejercicio05_DezplazarNumeroDeterminadoaLaDerecha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] =  new int [150];
		int saltos, cambio;
		
		System.out.println("Indique cuantos saltos desea dar: ");
		saltos = sc.nextInt();
			
		for(int i = 0; i < array.length; i++) {
		
			array[i] = (int) Math.round(Math.random()*100); 
			System.out.print(array[i] + ",");
			
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Moviendo a la derecha " + saltos + " veces...");
		System.out.println("");
		
		for(int i1 = 0; i1 < saltos; i1++) {
			for(int i2 = (array.length - 1); i2 > 0 ; i2--) {
				
				cambio = array[i2];
				array[i2] = array[i2-1];
				array[i2-1] = cambio;
				
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ",");
		}
	}

}
