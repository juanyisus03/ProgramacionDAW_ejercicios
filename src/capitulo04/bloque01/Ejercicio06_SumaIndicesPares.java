package capitulo04.bloque01;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
 */

public class Ejercicio06_SumaIndicesPares {

	public static void main(String[] args) {
		
		int array[] =  new int [150];
		int sum = 0;
		
		
		for(int i = 0; i < array.length; i++) {	
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i]+ ", ");
		}
		
		for(int i = 0; i < array.length; i += 2) {
			sum += array[i];
		}
		
		System.out.println("La suma de los índices pares son: " + sum);
	}

}
