package capitulo3.bloque01;

import java.util.Scanner;

/*
 * Realiza un programa que pida al usuario cuatro números enteros, 
 * y calcule la suma solo de aquellos números introducidos por el usuario,
 * que sean mayores de 10. Es decir, que si el usuario introduce el 5, el 15,
 * el 6 y el 25, el programa debe calcular la suma solo de 15 más 25, 
 * ya que 5 y 6 son menores de 10.
 */

public class Ejercicio01_SumaMayoresDeDiez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		int sum = 0;
		
		//Comprueba y suma los números pedidos
		
		for(i = 0; i < 4; i++){
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if(num > 10){
				sum += num;
			}
		}
		
		
		System.out.println("La suma es "+ sum);

	}

}
