package capitulo02.bloque03;

import java.util.Scanner;

/*
 * Escribe un programa que lea el importe de una compra y la cantidad 
 * recibida y calcule el cambio a devolver, teniendo en cuenta que el 
 * número de monedas que se devuelven debe ser mínimo. Suponer que 
 * el sistema monetario utilizado consta de monedas de 100, 50, 25, 5, y 1 unidad.
 * El precio viene dado en unidades monetarias enteras.
 */
public class Ejercicio04_CambioADelvolver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,cambio;
		
		System.out.println("Introduzca cuanto le costó: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca cuanto dio: ");
		num2 = sc.nextInt();
		
		cambio = num2 - num1;
		
		if (num1 > num2) {
			System.out.println("Usted no terminó de pagar su compra");
			return;
		}
		
		if(cambio/100 != 0) {
			System.out.println(cambio/100 + " monedas de 100 = " + cambio/100*100);
			cambio = cambio%100;
		}
		
		if(cambio/50 != 0) {
			System.out.println(cambio/50 + " monedas de 50 = " + cambio/50*50);
			cambio = cambio%50;
		}
		
		if(cambio/25 != 0) {
			System.out.println(cambio/25 + " monedas de 25 = " + cambio/25*25);
			cambio = cambio%25;
		}
		
		if(cambio/5 != 0) {
			System.out.println(cambio/5 + " monedas de 5 = " + cambio/5*5);
			cambio = cambio%5;
		}
		
			System.out.println(cambio +" monedas de 1 = "+ cambio);
		
		
		
		
		
		
	
	}
}
