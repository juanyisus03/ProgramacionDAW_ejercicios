package capitulo04.bloque03;

/*
 *  Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
 *  Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Shell", 
 *  con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace 
 *  http://lwh.free.fr/pages/algo/tri/tri_shell_es.html
 */

public class Ejercicio03_OrdenarConShell {

	public static void main(String[] args) {
	
		int array[] =  new int [150];
		int intervalos[] = new int[] {75, 37, 18, 9, 4, 2, 1};
		int actual;
		int a;
		
		for(int i = 0; i < array.length; i ++){
			array[i] = (int) Math.round(Math.random()*1000);
			System.out.print(array[i] + ", ");
		}
		
		System.out.println("");
		
		for(int ngap = 0; ngap < intervalos.length; ngap++){
			
			for(int i = 0; i < intervalos[ngap]; i ++){
				
				for(int j = i + intervalos[ngap]; j < array.length; j += intervalos[ngap]){
					
					actual = array[j];
					
					for(a = j; a >= intervalos[ngap] && array[a - intervalos[ngap]] > actual; a -= intervalos[ngap]){
						
						array[a] = array[a - intervalos[ngap]];
					}
					
					array[a] = actual;					
				}
				
				
			}
		}
		
		for(int i = 0; i < array.length; i ++){
			System.out.print(array[i] + ", ");
		}
	
	}
}
