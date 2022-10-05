package capitulo3.bloque03;

/*
 *  Realiza un ejercicio que pida números al usuario. 
 *  El programa debe detenerse cuando el usuario introduzca el número 0 (cero), 
 *  que no debe tenerse en cuenta para ninguna operación aritmética, 
 *  simplemente para salir de la aplicación. Cuando el programa haya terminado, 
 *  se debe sacar en pantalla el valor de la suma  y de la media de todos los números.
 */

import java.util.Scanner;

public class Ejercicio01_SumaMediaYSalirseConCero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int num = 1;
		int sum = 0;
	
		for(i = 0; num != 0; i++) {
			System.out.println("Introduzca un número (0 ---> Terminar)");
			num = sc.nextInt();
			if(num != 0);
				sum += num;
		}
		
		System.out.println("La suma de sus números es: " + sum);
		System.out.println("La media de sus números es: " + sum/(i-1));
	}
}
