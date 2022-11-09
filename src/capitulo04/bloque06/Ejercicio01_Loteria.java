package capitulo04.bloque06;

/*
 * Realiza un programa que genere una apuesta aleatoria de la lotería primitiva. Consiste en generar seis números y otro complementario 
 * entre 1 y 49 que no se repitan. Ejemplo: Combinación: 2 14 20 37 39 41 complementario: 13. Utiliza un array, en el ejemplo expuesto 
 * sería un array de 7 posiciones correspondiendo la séptima posición al "complementario" de la loteria.
 */

import javax.swing.JOptionPane;

import Utils.UtilsArrays;

public class Ejercicio01_Loteria {
	public static void main(String[] args) {
		int boleto[];
		int resultado[];
		int contador = 0;
		
		//Si no quieren el boleto le van creando boletos hasta que desee el usuario
		do {
			boleto = crearLoteriaValida();
			mostrarBoleto(boleto);
			System.out.println("\n \n");
			
		}while(JOptionPane.showConfirmDialog(null, "¿Desea jugar con este boleto?", null, 0) != 0);
		
		resultado = crearLoteriaValida();
		System.out.println("La combinacion ganadora es...");
		mostrarBoleto(resultado);
		
		for(int i = 0; i < boleto.length; i++){
			
			for(int j = 0; j < resultado.length; j++) {
				
				if(boleto[i] == resultado[j]) {
					contador++;
					break;
				}
			}
		}
		System.out.println("Coinciden " + contador+ " números");
		
		
		
		
	}

	public static void mostrarBoleto(int[] array) {
		
		System.out.print("Combinación: ");
		for(int i = 0; i < array.length-1; i++){
			System.out.print(array[i]+", ");
		}
		System.out.print("Complementario: " + array[array.length-1] + "\n");
		
	}

	public static int[] crearLoteriaValida() {
		int array[] = UtilsArrays.creaArrayNumerosAzar(7, 1, 49);
		boolean cambio = true;
		
		while(cambio == true) {
			
			cambio = false;
			
			for (int i = 0; i < array.length; i++) { 
					
				for(int j = 0; j < array.length; j++) {
			
					if(array[i] == array[j] && (j != i)){ 
						cambio = true;
						array[j] = (int) Math.round(Math.random()*(49-1)+1);
					}
					
				}
				
			}
		}
		return array;
		
	}
}
