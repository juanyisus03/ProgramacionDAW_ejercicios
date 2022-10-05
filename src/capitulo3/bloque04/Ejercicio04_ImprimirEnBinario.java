package capitulo3.bloque04;

/*
 * Crea un programa que pida al usuario un número e imprima ese número en binario. 
 * Tienes prohibido el uso del bucle "for".
 */

import java.util.Scanner;

public class Ejercicio04_ImprimirEnBinario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int bit = 128;
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		while(bit > 0) {
			
			if((num & bit) != 0){
				
				System.out.print("1");
				
			}
			else {
				System.out.print("0");
			}
			
			bit = bit >> 1;
			
		}
		
	}
}
