package capitulo04.bloque03;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
 * Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Inserción directa",
 * con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace 
 * http://lwh.free.fr/pages/algo/tri/tri_insertion_es.html
 */

public class Ejercicio02_OrdenarConInserccionDirecta {

	public static void main(String[] args) {
		int array[] =  new int [150];
		int cambio, j;
		
		for(int i = 0; i < array.length; i ++){
			array[i] = (int) Math.round(Math.random()*1000);;
			System.out.print(array[i] + ", ");
		}
		
		for(int i = 1; i < array.length; i ++){
			
			cambio = array[i];
			
			for(j = i; j > 0 && array[j-1] > cambio; j--){
				
				array[j] = array[j-1];
			}
			
			array[j] = cambio;					
		}
		
		System.out.println("");
		
		for(int i = 0; i < array.length; i ++){
			System.out.print(array[i] + ", ");
		}

	}

}