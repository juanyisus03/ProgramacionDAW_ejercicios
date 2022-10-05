package capitulo3.bloque03;

/*
 * Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). 
 * Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, 
 * desde el 0 (cero) hasta el 10.
 */

import java.util.Scanner;

public class Ejercicio03_TablasDeMultiplicar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		for(int i = 0; num != 0; i++) {
			System.out.println("Introduzca número para hacer tabla");
			System.out.println("Pulse 0 para terminar el programa");
			num = sc.nextInt();
			if (num != 0) {
				
				for( int a = 0; a < 11; a++) {
					System.out.println(a + " * " + num + " = " + a*num);
					
				}
			}
			
		}
	
	}
}
