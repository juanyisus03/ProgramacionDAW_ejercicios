package capitulo3.bloque03;

/*
 *  Realiza un ejercicio que pida números al usuario hasta que este introduzca el 0 (cero). 
 *  Al finalizar el ejercicio se debe imprimir en pantalla el valor mayor y el menor introducido. 
 *  El valor 0 (cero) no debe tenerse en cuenta.
 */

import java.util.Scanner;

public class Ejercicio02_MayorYMenorSalirseConCero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int mayor = 0, menor = 0;
		
		for(int i = 0; num != 0; i++) {
			if (i == 0) {
				System.out.println("Introduzca un número: ");
				num = sc.nextInt();
				mayor = num;
				menor = num;
			}
			
			else {
				if(num != 0 )
				System.out.println("Introduzca un número: ");
				num = sc.nextInt();
				if (num > mayor) mayor = num;
				if (num < menor) menor = num;
					
			}
			
			
		}
			
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
	}
}