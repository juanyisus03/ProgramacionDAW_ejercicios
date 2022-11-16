package capitulo04.bloque07;

/*
 * 	Realiza un método llamado "removeInteger", que reciba:
		- Un array de números enteros.
		- Un valor entero.
	Si el valor entero recibido como segundo parámetro existe dentro del array recibido como primer parámetro,
 	debes conseguir que ese valor desaparezca del array. Puedes seguir la siguiente guía:
		- Utiliza el método del ejercicio 4 para saber cuántas veces aparece el valor entero (segundo parámetro) dentro del array (primer parámetro).
		- Crea un nuevo array, que tenga la dimensión del array recibido como primer parámetro menos la cantidad de 
		  veces que el valor entero del segundo parámetro aparezca en dicho array.
		- Copia todos los elementos del array recibido como primer parámetro, dentro del nuevo array creado por ti en el método. 
		  Lógicamente no debes copiar en el array los valores del primer array que coincidan con el valor introducido como segundo parámetro.
		- Devuelve el nuevo array.
	El método debe devolver "int[]". El método main debe recoger el nuevo array creado e imprimirlo en consola
 */

import javax.swing.JOptionPane;

public class Ejercicio05_removeInteger {
	public static void main(String[] args) {
		int array[] = Utils.UtilsArrays.creaArrayNumerosAzar(20, 1, 20);

		int num, cont;
		
		//Muestro array
		System.out.println("El array es: ");
		Utils.UtilsArrays.mostrarArray(array);
		
		//Pido el número que borrare 
		num= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número desea borrar?"));
		cont = Ejercicio04_countOccurrences.countOccurrences(array, num);
		
		//Si el número está en el array lo elimino
		if(cont != 0) {
			for(int i = 0; i < cont; i++) {
				array = removeInteger(array, num);
			}
		}
		//Imprimo el array resultante
		System.out.println("El array se quedo en: ");
		Utils.UtilsArrays.mostrarArray(array);
	}

	public static int[] removeInteger(int[] array, int num) {
		int sustituto[] = new int[array.length-1];
		int i;
		// Recorro el array hasta que encuentre el número a borrar
		for( i = 0; i < array.length; i++) {
			if(array[i] != num) {
				sustituto[i] = array[i];
			}
			else break;
		}
		// Recorro desde donde me encontre el número hasta el final
		for( ; i < array.length-1; i++) {
			sustituto[i] = array[i+1];
		}	
		return sustituto;
	}
}
