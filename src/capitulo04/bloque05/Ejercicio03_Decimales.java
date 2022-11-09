package capitulo04.bloque05;

/*
 * Crea un array de 20 números decimales creados al azar entre 0 y 100. 
 * Para crear el número decimal debes generar al azar la parte entera y la parte decimal 
 * por separado para después unir las dos partes. A continuación debes examinar la 
 * cantidad de números cuya parte decimal está comprendida entre .00 y .49
 */

public class Ejercicio03_Decimales {
	public static void main(String[] args) {
		float array[] = new float[20];
		int contador;
		contador = inicializarYContarArray(array);
		Utils.UtilsArrays.mostrarArray(array);
		System.out.println("\n Hay " + contador + " números cuya parte decimal está comprendida entre .00 y .49");
	}
	
	public static int inicializarYContarArray(float[] array) {
		float decimal, entera;
		int cont = 0;
		
		//Inicializo el array y cuento las partes decimales del array
		for(int i = 0; i < array.length; i++) {
			
			decimal = (float) Math.random();
			if(decimal <= 0.49) cont ++;
			
			entera =  Math.round(Math.random()*100);
			
			array[i] = decimal + entera;
		}
		return cont;
	}

}
