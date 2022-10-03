package capitulo02.bloque03;
/*
 * Realiza una calculadora avanzada, pero con la particularidad de que las 
 */
import java.util.Scanner;

public class Ejercicio02_Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,opcion;
		
		System.out.println("Menú:");
		System.out.println("1.- Raices");
		System.out.println("2.- Potencias");
		System.out.println("3.- Módulo de la división");
		System.out.println("");
		System.out.println("Elija una opción: ");
		opcion= sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Elija base de la raíz: ");
			num1 = sc.nextInt();
			System.out.println("Elija índice de la raíz: ");
			num2 = sc.nextInt();
			System.out.println("La solución es: "+ Math.pow(num1, 1f/num2));
			break;
		case 2: 
			System.out.println("Elija base de la potencia: ");
			num1 = sc.nextInt();
			System.out.println("Elija exponente de la potencia: ");
			num2 = sc.nextInt();
			System.out.println("La solución es: "+ (int) Math.pow(num1, num2));		
			break;
		case 3: 
			System.out.println("Elija dividendo: ");
			num1 = sc.nextInt();
			System.out.println("Elija divisor: ");
			num2 = sc.nextInt();
			System.out.println("El módulo es: "+ num1%num2);		
			break;
		default:
			System.out.println("Dicho número no corresponde con ninguna opción");
				
				
				
		}
	}
}
