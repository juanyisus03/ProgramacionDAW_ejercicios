package capitulo3.bloque02;

/*
 * Ejercicio que obtenga todos los múltiplos de un número introducido por el usuario. 
 * Se imprimirán todos los múltiplos menores de 100, este será el límite
 */

import java.util.Scanner;

public class Ejercicio03_Multiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		
		System.out.println("¿De qué número quieres ver los múltiplos?");
		num = sc.nextInt();
	
		for(i = num; i < (100); i+= num) {
		
			System.out.println(i);
		}
	}
}
