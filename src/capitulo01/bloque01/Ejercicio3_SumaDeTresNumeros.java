package capitulo01.bloque01;
/*
 *  Realiza un programa que pida al usuario tres números 
 *  y calcule y muestre en pantalla la suma de los tres. 
 */
import java.util.Scanner;

public class Ejercicio3_SumaDeTresNumeros {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer numero: ");
		double Sum1 = sc.nextDouble();
		System.out.println("Introduzca segundo numero: ");
		double Sum2 = sc.nextDouble();
		System.out.println("Introduzca tercer numero: ");
		double Sum3 = sc.nextDouble();
		
		double Suma = Sum1+Sum2+Sum3;
 		
		System.out.println("La suma de todos los numeros son: " + Suma);
		
		
		
		
		
		
		
	}
}
