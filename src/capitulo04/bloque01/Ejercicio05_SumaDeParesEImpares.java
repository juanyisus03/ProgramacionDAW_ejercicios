package capitulo04.bloque01;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes obtener la suma de los números pares y los impares en variables separadas.
 */

public class Ejercicio05_SumaDeParesEImpares {

	public static void main(String[] args) {
		int sumpar = 0, sumimp = 0;
		int array[] =  new int [150];
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i]+ ", ");
		}
		
		
		for(int i = 0; i < array.length; i++) {
			if((array[i] & 1) == 1) sumimp += array[i];
			else sumpar += array[i];
		}
		
		System.out.println("La suma de los números impares es: " + sumimp);
		System.out.println("La suma de los números pares es: " + sumpar);
	}
}
