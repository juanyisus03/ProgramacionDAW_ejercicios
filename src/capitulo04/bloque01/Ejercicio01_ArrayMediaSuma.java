package capitulo04.bloque01;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes mostrar el array en pantalla y obtener la suma, la media, 
 * el menor y el mayor de todos los números que aparecen en el array.
 */

public class Ejercicio01_ArrayMediaSuma {
	public static void main(String[] args) {
		int array[] =  new int [150];
		int mayor = -1, menor = -1, sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i] + ", ");
		}
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				mayor = array[i];
				menor = array[i];
			}
			else {
				if (array[i] > mayor) mayor = array[i];
				if (array[i] < menor) menor = array[i];
			}
		}
		System.out.println("");
		System.out.println("El mayor número del array es: " + mayor);
		System.out.println("El menor número del array es: " + menor);
		System.out.println("La media es: "+ (float) sum/array.length);
		
		
	}
}
