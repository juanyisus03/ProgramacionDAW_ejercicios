package capitulo01.bloque01;
/*
 * Realiza un programa en Java que pida dos variables al usuario, 
 * intercambie los valores de las dos variables y las muestre en pantalla 
 * ANTES y DESPUÉS del intercambio de valores.
 */
import java.util.Scanner;

public class Ejercicio5_CambioDeDosVariables {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Introduzca segundo numero: ");
		double num2 = sc.nextDouble();
		System.out.println("Su primer numero era: " +num1);
		System.out.println("Su segundo numero era: " +num2);
		
		
		double cambio = num1;
		num1 = num2;
		num2= cambio;
		
		System.out.println("Su primer numero ahora es: " +num1);
		System.out.println("Su segundo numero ahora es: " +num2);
					
		
	
}
}
