package capitulo04.bloque04;

/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. 
 * El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array 
 * (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
 */

public class Ejercicio01_PrioridadAParesArray {

	public static void main(String[] args) {
		int array[] = new int[20];
		int cambio;
		
		for(int i = 0; i < array.length; i++){
			array[i] = (int) Math.round(Math.random()*100);
			
		}
		
		for(int i = 0; i < array.length; i ++){
			
			for(int j = i; j < array.length; j++) {
				
				if(array[j]%2 == 0 && array[i]%2 != 0) {
					cambio = array[j];
					array[j] = array[i];
					array[i] = cambio;
					
				}
				
			}
		}
		
		for(int i = 0; i < array.length; i++){
	
			System.out.print(array[i] + ", ");
		}
	}

}
