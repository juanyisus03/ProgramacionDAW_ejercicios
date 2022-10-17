package capitulo04.bloque04;

/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. 
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9). 
 * Seguidamente el programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. 
 * Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9. 
 * El programa deberá desplazar todos los elementos del array a la derecha una posición, 
 * pero dejando intacto el intervalo interior. Al final se debe mostrar el array resultante.
 */

import java.util.Scanner;

public class Ejercicio02_DesplazarExceptoIntervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int ini = 1;
		int fin = 0;
		int cambio;
		
		//Inicializo el array
		for(int i = 0; i < array.length; i++) {
			
			System.out.print("Introduzca un número entero: ");
			array[i] = sc.nextInt();
			
		}
		
		//Imprimo el índice conjunto su valor correspondiente
		for(int i = 0; i < array.length; i++) {
		
			System.out.println("Indice " + i + " : " + array[i]);

		}
		
		System.out.println("");
		
		//Con este while hago repetir que me introduzca el inicial y el final sin los datos son inválidos
		while(ini > fin || ini < 0 || fin > 9) {
			
			System.out.print("Introduzca un indice inicial: ");
			ini = sc.nextInt();
			System.out.print("Introduzca un indice final: ");
			fin = sc.nextInt();
			
			if (ini > fin || ini < 0 || fin > 9) {
				System.out.println("");
				System.out.println("Datos no válidos");
				System.out.println("");
			}
		}
		
		//Primero muevo a la derecha todo el array 
		for(int i = (array.length - 1); i > 0 ; i--) {
			
			cambio = array[i];
			array[i] = array[i-1];
			array[i-1] = cambio;
			
		}
		
		//Muevo hacia la izquierda el intervalo de inicial y el final
		for(int i = ini; i <= fin; i++) {	
			cambio = array[i];
			array[i] = array[i+1];
			array[i+1] = cambio;
		}
	
	
		//Imprimo el array para que se vean los cambios
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ", ");

		}
		
		
	}
}
