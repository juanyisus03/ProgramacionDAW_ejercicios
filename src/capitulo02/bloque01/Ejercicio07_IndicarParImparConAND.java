package capitulo02.bloque01;
/*
 * Utiliza la operación AND y el operador "if", para tratar de averiguar
 * si un número introducido por el usuario es par o impar. 
 * Sería recomendable que estudiases el código de la clase 
 * "OperadoresANivelDeBits" del capítulo 1 de este tutorial.
 */
import java.util.Scanner;

public class Ejercicio07_IndicarParImparConAND {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		if((num & 1) == 1) {
			
			System.out.println("El numero es impar");
			
		}
		else {
			
			System.out.println("El numero es par");
		
		}
	}
}
