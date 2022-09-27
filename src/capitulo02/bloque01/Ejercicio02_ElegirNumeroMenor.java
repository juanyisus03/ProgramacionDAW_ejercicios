package capitulo02.bloque01;
/*
 * Repetir el ejercicio anterior para mostrar 
 * el número menor de los dos introducidos 
 */
import java.util.Scanner;

public class Ejercicio02_ElegirNumeroMenor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1,num2;
		
		
		System.out.println("Introduzca un numero: ");
		num1 = sc.nextFloat();
		
		System.out.println("Introduzca otro numero: ");
		num2 = sc.nextFloat();
		
		if(num1<num2) {
			System.out.println(num1+ " es el menor");
		}
		else {
			if(num2<num1) {
			System.out.println(num2+ "es el menor");
			}
			else {
				System.out.println("Los numeros son iguales");
			}
		}
		
	
}
}
