package capitulo3.bloque01;

/*
 * Realiza un ejercicio que pida números al usuario, tantos como indique el usuario. 
 * Al final debe aparecer cuantos números positivos y negativos se han introducido.
 */

import java.util.Scanner;

public class Ejercicio03_NegativosYPositivos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numi, i;
		int negativos = 0;
		int positivos = 0;
		int ceros = 0;
		
		System.out.println("¿Cuántos números quiere introducir?");
		numi = sc.nextInt();
	
		for(i = 0; i < numi; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if(num > 0) positivos ++;
			else if(num < 0) negativos ++;
		
			
		}
		
		
		
		System.out.println("Contador de negativos: " + negativos);
		System.out.println("Contador de positivos: " + positivos);
	
		
		
		
	}
}
