package capitulo04.bloque04;

/*
 * Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo. 
 * Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, 
 * el resultado debe estar entre 0 y 22. Haz un método donde según el resultado de la anterior 
 * formula busque en un array de caracteres la posición que corresponda a la letra. 
 * El orden de los caracteres del array es: T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E.
 * Por ejemplo, si introduzco 70588387, el resultado sera de 7 que corresponde a ‘F’.
 */

import java.util.Scanner;

public class Ejercicio03_DNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dni;
		
		//Pido el DNI al usuario
		System.out.print("Introduzca su DNI sin la letra: ");
		dni = sc.nextInt();
		
		//Le mando al método "hallarLetra" el resto y el dni
		hallarLetra(dni%23, dni);
		
		
	}
	
	public static void hallarLetra(int resto, int dni) {
		String letras[] = new String [] { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		//Imprimo el DNI con la letra
		System.out.println("Su DNI completo es: " + dni + letras[resto]);
		
	}
	

}
