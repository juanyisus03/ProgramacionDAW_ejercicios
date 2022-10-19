package capitulo04.bloque02;

/*
 * Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100. 
 * Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el desplazamiento sea circular, 
 * si un número sale por la derecha volverá a entrar por la izquierda. 
 * Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
 */

public class Ejercicio04_DezplazarALaDerecha {
	public static void main(String[] args) {
		
		int array[] =  new int [5];
		int cambio;
		
		for(int i = 0; i < array.length; i++) {
						
			array[i]= (int) Math.round(Math.random()*100);
			System.out.print(array[i] + ",");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Moviendo a la derecha...");
		System.out.println("");
		
		
		for(int i = (array.length - 1); i > 0 ; i--) {
			
			cambio = array[i];
			array[i] = array[i-1];
			array[i-1] = cambio;
			
		}
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ",");
		}
	}
}
