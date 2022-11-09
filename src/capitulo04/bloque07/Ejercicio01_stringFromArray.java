package capitulo04.bloque07;

/*
 *  Un método llamado "stringFromArray", que reciba un array de números enteros y devuelva una cadena de caracteres. 
 *  El método debe recorrer el array, de la misma forma en la que harías para mostrarlo en consola, pero en lugar de imprimir en 
 *  consola debes construir un objeto String. Finalmente debes devolver el String e imprimirlo en el método "main".
 */

public class Ejercicio01_stringFromArray {
	public static void main(String[] args) {
		int array[] = Utils.UtilsArrays.creaArrayNumerosAzar(5, 65, 90);
		String palabra = stringFromArray(array);
		
		System.out.println(palabra);
		
		
		
	}

	public static String stringFromArray(int[] array) {
		String str = "";
		
		for(int i = 0; i < array.length; i++) {
			str += (char) array[i];	
			
		}
		return str;
	}
	

}
