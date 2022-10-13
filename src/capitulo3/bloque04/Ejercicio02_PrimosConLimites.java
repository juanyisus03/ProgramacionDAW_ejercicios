package capitulo3.bloque04;

/*
 * Crea un programa que compruebe si son primos o compuestos todos los números entre un límite inferior 
 * y uno superior que debes pedir al usuario. Tienes prohibido el uso del bucle "for". 
 */

import java.util.Scanner;

public class Ejercicio02_PrimosConLimites {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limiteInferior,limiteSuperior;
		int i = 2;
		boolean esPrimo = true;

		System.out.println("Introduzca limite inferior: ");
		limiteInferior = sc.nextInt();
		System.out.println("Introduzca limite superior: ");
		limiteSuperior = sc.nextInt();
		
		while(limiteInferior < limiteSuperior + 1 ){
			i = 2;
			esPrimo = true;
			
			while (i < limiteInferior){
				
				if(limiteInferior % i == 0)esPrimo = false;
				i++;
			}
			
			if(esPrimo == true){
				
				System.out.println(limiteInferior + " es primo");
				
			}
			else {
				
				System.out.println(limiteInferior + " es compuesto");
				
			}
			
			limiteInferior++;	
		}
	}
}
