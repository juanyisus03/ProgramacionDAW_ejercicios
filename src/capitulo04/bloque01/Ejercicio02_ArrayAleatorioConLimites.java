package capitulo04.bloque01;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior y uno superior que debe especificar el usuario. 
 * Debes mostrar el array en pantalla para comprobar el funcionamiento 
 */

import java.util.Scanner;

public class Ejercicio02_ArrayAleatorioConLimites {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] =  new int [150];
		
		System.out.print("Introduzca limite inferior: ");
		int liminf = sc.nextInt();
		System.out.print("Introduzca limite superior: ");
		int limsup = sc.nextInt();	

		for(int i = 0; i < array.length; i++){
			
			array[i] = (int) Math.round(Math.random()*(limsup-liminf)+liminf);
			System.out.print(array[i] + ", ");
		}
		
		
	}

}
