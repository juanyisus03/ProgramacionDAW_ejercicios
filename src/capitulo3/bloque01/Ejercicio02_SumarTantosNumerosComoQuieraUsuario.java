package capitulo3.bloque01;

import java.util.Scanner;

/*
 * Modifica el ejercicio anterior de manera que, en lugar de que el 
 * programa siempre pida cuatro números, sea el usuario el 
 * que decida cuantos números se van a pedir.
 */

public class Ejercicio02_SumarTantosNumerosComoQuieraUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numi, i;
		int sum = 0;
		
		System.out.println("¿Cuántos números quiere introducir?");
		numi = sc.nextInt();
		
		for(i = 0; i< numi; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if(num > 10){
				sum += num;
			}
		}
		System.out.println("La suma es " + sum);
	}

}
