package capitulo04.bloque02;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100. 
 * Debes conseguir que todos los números pares del array cambien de signo, 
 * los positivos deben pasar a negativos y viceversa.
 */

public class Ejercicio01_CambiarSignoNumerosPares {

	public static void main(String[] args) {
		int array[] =  new int [150];
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*(100+100)-100);
			System.out.print(array[i] + ", ");
		}
		
		System.out.println("");
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = -array[i];
			
			if((array[i] & 1) != 1) array[i] = -array[i]; 
			
			System.out.print(array[i] + ", ");
			
		}

	}

}
