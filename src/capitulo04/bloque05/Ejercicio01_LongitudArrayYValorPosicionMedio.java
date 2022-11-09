package capitulo04.bloque05;


/*
 * Crea un programa que reciba un array de números enteros creados al azar entre 0 y 100. Se debe examinar la longitud del array,
 * comprobar que la longitud es un valor impar y devolver el valor que se encuentre en la posición media. 
 * En caso de que la longitud del array sea un número par se debe devolver un valor -1.
 */

public class Ejercicio01_LongitudArrayYValorPosicionMedio {

	public static void main(String[] args) {
		int array[] = Utils.UtilsArrays.creaArrayNumerosAzar((int) Math.round(Math.random()*100), 0, 100);
		
		System.out.println("El valor del medio es " + comprobarMedio(array));

	}

	public static int comprobarMedio(int[] array) {
		//Averiguo si el array tiene una longitud par o impar
		if (array.length % 2 == 0) {
			//Si es par devuelvo -1 
			return -1;
		}
		//Si es impar devuelvo el valor medio
		else {return array[(array.length/2)];}
	}

}
