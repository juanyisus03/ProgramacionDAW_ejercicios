package capitulo04.bloque01;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
 * A continuación pedirás al usuario un valor y buscarás dicho valor en el array.
 * Si lo encuentras, debes indicar al usuario la posición del array en que se encuentra. 
 * En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.
 */

import java.util.Scanner;

public class Ejercicio04_BuscarPosicion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] =  new int [150];
		int num;
		boolean noEncontrado = true;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i]+ ", ");
		}
		System.out.println("");
		System.out.println("Introduzca un número entero del 1-100: ");
		num = sc.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			
			if(num == array[i]) {
				System.out.println("Su número está en el índice: " + i);
				noEncontrado = false;
			}

		}
		
		if(noEncontrado) {
			
			System.out.println("Su número no está");
			
		}
	}
}
