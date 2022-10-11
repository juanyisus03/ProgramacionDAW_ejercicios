package capitulo3.bloque04;

/*
 * Crea un programa que compruebe si un número es primo o no. Debes pedir al usuario un número 
 * y después informar de si se trata de un número primo o compuesto. 
 * Tienes prohibido el uso del bucle "for".
 */

import java.util.Scanner;

public class Ejercicio01_PrimosSinFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 1;
		boolean esPrimo = true;
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		while (i < num){
			
			if(num % i == 0 && i != 1) {
				esPrimo = false;
			}
			
			i++;
		}
		
		if(esPrimo == true) System.out.println(num + " es primo");
		else System.out.println(num + " es compuesto");
		
	}
}