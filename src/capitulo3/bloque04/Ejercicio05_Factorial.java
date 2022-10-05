package capitulo3.bloque04;

import java.util.Scanner;

public class Ejercicio05_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		long factorial = 1;
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		while(num > 1) {
			factorial *= num;
			num--;
		}
		System.out.println("Su factorial es " + factorial);
		
		
	}
}