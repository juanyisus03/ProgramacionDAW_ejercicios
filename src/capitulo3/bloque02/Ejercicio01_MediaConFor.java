package capitulo3.bloque02;

/*
 *  Media de una cantidad de números introducidos por el usuario. 
 *  El usuario especificará una cantidad de números, 
 *  tras lo cual se le deben pedir tantos como este haya indicado. 
 *  Al final se debe imprimir la media.
 */

import java.util.Scanner;

public class Ejercicio01_MediaConFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numi, i;
		float sum = 0;
		
		System.out.println("¿Cuántos números quiere introducir?");
		numi = sc.nextInt();
	
		for(i = 0; i < numi; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			sum += num;
		}
		
		System.out.println("La media de tus números es: " + sum/numi);

	}
}


