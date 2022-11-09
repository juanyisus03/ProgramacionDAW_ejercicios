package capitulo04.bloque07;

/*
 *	 Un método llamado "findAndReplace", que reciba:
		- Un array de números enteros.
		- Un valor entero que debe buscarse en el array.
		- Un valor entero que debe servir para reemplazar.
	El método buscará todas las ocasiones en las que el segundo parámetro aparezca dentro del array y reemplazará ese valor con el valor del tercer parámetro.
	El método main debe crear un array, imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir el array en consola.
 */

import javax.swing.JOptionPane;

public class Ejercicio02_finAndReplace {
	public static void main(String[] args) {
		int array[] = Utils.UtilsArrays.creaArrayNumerosAzar(10, 1, 10);
		int numBuscado, numReemplazo;
		
		//Muestro array
		System.out.println("El array actual es: ");
		Utils.UtilsArrays.mostrarArray(array);
		System.out.println("");
		
		//Pido el número buscado y el por cuál se reemplazará
		numBuscado =  Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que número desea reemplazar?"));
		numReemplazo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Por cuál número lo reemplazará?"));
		finAndReplace(array, numBuscado, numReemplazo);
		
		//Muestro el array nuevo
		System.out.println("El nuevo array es :");
		Utils.UtilsArrays.mostrarArray(array);
		
		
		
		
	}

	public static void finAndReplace(int[] array, int numBuscado, int numReemplazo) {
		
		//Recooro el array y si es igual al número buscado lo reemplazo
		for(int i = 0; i < array.length; i++) {
			if(array[i] == numBuscado) {
				array[i] = numReemplazo;
			}
			
		}
		
	}
}
