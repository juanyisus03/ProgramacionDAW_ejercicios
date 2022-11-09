package capitulo04.bloque07;

/*
 *  Realiza un método llamado "addInteger", que reciba:
		- Un array de números enteros.
		- Un valor entero.
	Dentro del método debes:
		- Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
		- Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
		- Agregar el nuevo elemento al final del nuevo array.
		- El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola
 */

import javax.swing.JOptionPane;

public class Ejercicio03_addInteger {

	public static void main(String[] args) {
		int array[] = Utils.UtilsArrays.creaArrayNumerosAzar(5, 1, 20);
		int num;
		
		//Muestro array
		System.out.println("El array actual es: ");
		Utils.UtilsArrays.mostrarArray(array);
		System.out.println("");
		
		//Pido el número que agregare 
		num= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número desea añadir?"));
		array = addInteger(array, num);
		
		//Muestro el array nuevo
		System.out.println("El nuevo array es :");
		Utils.UtilsArrays.mostrarArray(array);

	}

	public static int[] addInteger(int[] array, int num) {
		int sustituto[] = new int[array.length+1];
		for(int i = 0; i < array.length; i++) {
			sustituto[i] = array[i];
		}
		sustituto[sustituto.length-1] = num;
		return sustituto;
		
	}

}
