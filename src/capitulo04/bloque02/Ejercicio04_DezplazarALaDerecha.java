package capitulo04.bloque02;

/*
 *  Realiza un ejercicio igual al anterior, pero en el que el usuario pueda 
 *  indicar la cantidad de posiciones que deseamos desplazar.
 */

public class Ejercicio04_DezplazarALaDerecha {
	public static void main(String[] args) {
		
		int array[] =  new int [150];
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
