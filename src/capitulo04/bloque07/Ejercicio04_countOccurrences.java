package capitulo04.bloque07;

/*
 * Realiza un método llamado "countOccurrences", que reciba:
		- Un array de números enteros.
		- Un valor entero.
	El método debe devolver un valor entero, que corresponda con el número de veces que el valor
	 entero recibido como segundo parámetro exista dentro del array recibido como primer parámetro.
 */

import javax.swing.JOptionPane;

public class Ejercicio04_countOccurrences {
	public static void main(String[] args) {
		int array[] = Utils.UtilsArrays.creaArrayNumerosAzar(20, 1, 20);
		int num, cont;
		
		//Muestro array
		System.out.println("El array es: ");
		Utils.UtilsArrays.mostrarArray(array);
		
		//Pido el número que agregare 
		num= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número desea buscar?"));
		cont = countOccurrences(array, num);
		
		if(cont == 0) {
			System.out.println("El número " + num + " no ha aparecido ninguna vez");
		}
		else {
			System.out.println("El número " + num + " aparecio " + cont + " veces");
		}
		
	}
	
	public static int countOccurrences(int[] array, int num) {
		int cont = 0;
		
		for(int i = 0; i < array.length; i ++) {
			
			if(array[i] == num) cont++;
		}
		
		return cont;
		
		
		
	}
}
