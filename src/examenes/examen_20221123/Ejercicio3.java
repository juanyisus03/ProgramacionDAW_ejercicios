package examenes.examen_20221123;

public class Ejercicio3 {
	public static void main(String[] args) {
		float array[] = new float[] {1,1};
		
		//Hallo los diez primeros términos de la serie
		for(int i = 0; i < 8; i++) {
			array = serieDeRafanacci(array);
		}
		
		//Imprimo los diez primeros términos de la serie
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
	}
	
	public static float[] serieDeRafanacci(float array[]){
		float sustituto[] = new float[array.length+1];
		
		//Paso los valores del array al sustituto
		for (int i = 0; i < array.length; i ++) {
			sustituto[i] = array[i];
		}
		//Calculo el siguiente término de la serie
		sustituto[sustituto.length-1] =  (array[array.length-1]*array[array.length-2])+array[array.length-1]/2 ;
		
		//Devuelvo el sustituto
		return sustituto;
	}

}
