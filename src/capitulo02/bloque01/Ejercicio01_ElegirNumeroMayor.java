package capitulo02.bloque01;
/*
 * Realiza un ejercicio que pida dos variables al usuario, tras lo cual,
 *  muestre en pantalla el número mayor de los dos introducidos
 * 
 */
import java.util.Scanner;

public class Ejercicio01_ElegirNumeroMayor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float num1,num2;
		
		System.out.println("Introduzca un numero: ");
		num1 = sc.nextFloat();
		
		System.out.println("Introduzca otro numero: ");
		num2 = sc.nextFloat();
		
		if(num1>num2) {
			System.out.println(num1+ " es el mayor");
		}
		else {
			if(num2>num1) {
			System.out.println(num2+ "es el mayor");
			}
			else {
				System.out.println("Los numeros son iguales");
			}
		}
		
		
	
}
}