package capitulo04.bloque02;

/*
 * Realiza un ejercicio que inicialice  arrays de 150 elementos enteros al azar entre 0 y 100. 
 * Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar 
 * del tercer array debes copiar los elementos de índice impar del primer array; 
 * en los elementos de índice par del tercer array debes copiar los elementos de 
 * índice par del segundo array.
 */

public class Ejercicio02_MezclarValoresDeDosArrays {
	public static void main(String[] args) {
		
		int array1[] =  new int [150];
		int array2[] =  new int [150];
		int array3[] =  new int [150];
		
		
		System.out.println("Primer Array \n");
		
		for(int i = 0; i < array1.length; i++) {
			
			array1[i] = (int) Math.round(Math.random()*(100+100)-100);
			System.out.print(array1[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("\nSegundo Array \n");
		
		for(int i = 0; i < array2.length; i++) {
			
			array2[i] = (int) Math.round(Math.random()*(100+100)-100);
			System.out.print(array2[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("\nTercer Array \n");
		
		for(int i = 0; i < array3.length; i++) {
			
			if((i & 1) == 1) array3[i] = array1[i];
			else array3[i] = array2[i];
			System.out.print(array3[i] + ", ");
		}
		

	}

}
