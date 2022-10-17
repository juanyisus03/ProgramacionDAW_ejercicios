package capitulo04.bloque01;

import java.nio.file.spi.FileSystemProvider;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Después de su inicialización debéis imprimir el array en orden inverso.
 */

public class Ejercicio03_ArrayImprimirOrdenInverso {
	public static void main(String[] args) {
		int array[] =  new int [150];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i]+ ", ");
		}
		
		System.out.println("");
		System.out.println("Imprimir inversamente");
		
		for(int i = 149; i > -1; i--) {
			System.out.print(array[i]+ ", ");
		}
	}
}
