package examenes.examen_20221123;

public class Ejercicio2 {

	public static void main(String[] args) {
		int array[] = new int[5];
		int sustituto[] = new int[array.length];
		
		//Inicializo y muestro el primer array
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i] + ", ");
		}
		System.out.println("\n\nTranspasando de manera aleatoria....\n");
		
		//Llamo al método que transpasa el array aleatoriamente
		mezclar(array,sustituto);
		
		//Imprimo el segundo array
		for(int i = 0; i < sustituto.length; i++) {
			System.out.print(sustituto[i] + ", ");
		}
		
	}
	public static void mezclar(int array[], int sustituto[]) {
		int pos1 = (int) Math.round(Math.random()*4);
		int pos2 = (int) Math.round(Math.random()*4);
		int posiciones1[] = new int[] {1,2,3,4,0};
		int posiciones2[] = new int[] {1,2,3,4,0};
		
		for(int i = 0; i < array.length; i++) {
			//Hago que la posicion del primer array este dentro de las posiciones
			while(!estaEn(posiciones1,pos1)) {
				pos1 = (int) Math.round(Math.random()*4);
			}
			//Hago que la posicion del segundo array este dentro de las posiciones
			while(!estaEn(posiciones2,pos2)) {
				pos2 = (int) Math.round(Math.random()*4);
			}
			//Asigno el valor del array primero a la posicion del segundo
			sustituto[pos2] = array[pos1];
			
		}
	}
	public static boolean estaEn(int posiciones[], int pos) {
		//Recorro el array
		for(int i = 0; i < posiciones.length; i++) {
			//Si el número está dentro del array, la cambio en el array y devuelvo true
			if(posiciones[i] == pos) {
				posiciones[i] = 5;
				return true;
			}
			
		}
		return false;
	}
	
	
}
