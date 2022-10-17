package capitulo04.bloque03;

/*
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
 * Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Burbuja", 
 * con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace 
 * http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
 */

public class Ejercicio01_OrdenarConBurbuja {

	public static void main(String[] args) {
		int array[] =  new int [150];
		int cambio;
		boolean permutacion = true;
		
		for(int i = 0; i < array.length; i ++){
			array[i] = (int) Math.round(Math.random()*1000);;
			System.out.print(array[i] + ", ");
		}
		
		while(permutacion == true){
			permutacion = false;
			
			for(int i = 0; i < array.length-1; i ++){
				
				if(array[i]> array[i+1]){
					
					permutacion = true;
					cambio = array[i];
					array[i] = array[i+1];
					array[i+1] = cambio;	
				}	
			}
		}
		System.out.println("");
		for(int i = 0; i < array.length; i ++){
			System.out.print(array[i] + ", ");
		}
		
	}
}
