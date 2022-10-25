package capitulo04.bloque03;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
 * Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Selección", 
 * con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace 
 * http://lwh.free.fr/pages/algo/tri/tri_selection_es.html
 */

public class Ejercicio04_OrdenarConSeleccion {

	public static void main(String[] args) {
		int array[] =  new int [150];
		int menor, j, posicionMenor;
		
		for(int i = 0; i < array.length; i ++){
			array[i] = (int) Math.round(Math.random()*1000);
			System.out.print(array[i] + ", ");
		}
		
		System.out.println("");
		
		
		for(int i = 0; i < array.length; i ++){
			
			menor = array[i];
			posicionMenor = i;
			for(j = i; j < array.length; j++) {
				
				if(array[j] < menor) {
					menor = array[j];
					posicionMenor = j;
				}
				
			}
			array[posicionMenor] = array[i];
			array[i] = menor;
			
		}
		
		for(int i = 0; i < array.length; i ++){
			System.out.print(array[i] + ", ");
		}
		
		
	}

}
