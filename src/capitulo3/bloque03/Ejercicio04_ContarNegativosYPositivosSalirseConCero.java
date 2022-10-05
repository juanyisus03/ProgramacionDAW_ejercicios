package capitulo3.bloque03;

/*
 *Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). 
 *Al finalizar se debe imprimir en pantalla cuantos son positivos y cuantos negativos. 
 *No debes tener en cuenta el 0 (cero). 
 */

import java.util.Scanner;

public class Ejercicio04_ContarNegativosYPositivosSalirseConCero {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int negativos = 0, positivos = 0;
		
		for(int i = 0; num != 0; i++) {
			System.out.println("Introduzca un número (0----> Terminar)");
			num = sc.nextInt();
			if (num != 0) {
				
				if(num >= 1)  positivos ++;
				else negativos ++;
					
			}
		}
		
		System.out.println("Has introducido " + negativos + " números negativos");
		System.out.println("Has introducido " + positivos + " números positivos");
		
	}
	
}


