package capitulo3.bloque02;

/*
 * Mayor y menor de una cantidad de números dada por el usuario. 
 * El usuario introducirá una cantidad de números, 
 * tras lo cual se le deben pedir tantos como este haya indicado. 
 * Al final se debe imprimir el mayor y el menor de todos los introducidos.
 */


import java.util.Scanner;

public class Ejercicio02_MayorYMenorConFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numi, i;
		int mayor = 0, menor = 0;
		
		
		System.out.println("¿Cuántos números quiere introducir?");
		numi = sc.nextInt();		
	
		
		for(i = 0; i < (numi); i++) {
			if (i == 0) {
				System.out.println("Introduzca un número: ");
				num = sc.nextInt();
				mayor = num;
				menor = num;
			}
			
			else {
				
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > mayor) mayor = num;
			else if(num < menor) menor = num;
				
			}
			
			
		}
			
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
	}
}