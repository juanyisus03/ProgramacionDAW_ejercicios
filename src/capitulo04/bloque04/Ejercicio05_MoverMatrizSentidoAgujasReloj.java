package capitulo04.bloque04;

/*
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una posición en el sentido de las agujas del reloj. 
 * La matriz debe tener 12 filas por 12 columnas y debe contener números generados al azar entre 0 y 100.
 * Se debe mostrar tanto la matriz original como la matriz resultado, ambas con los números convenientemente alineados.
 */


public class Ejercicio05_MoverMatrizSentidoAgujasReloj {
	public static void main(String[] args) {
		int matriz[][] = new int[12][12];
		int aux = 0, cambio = 0, cont = 0;
		
		//Inicializo la matriz
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j++) {
		
					matriz[i][j] = (int) Math.round(Math.random()*100);
	
			}
		}
		//Imprimo la matriz
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j] + "\t"); 
			}
			System.out.println(); 
		}
		System.out.println(); 
		
		//Con la variable contador hago que los limites se hagan mas pequeños hasta alcanzar la zona más pequeña
		while(cont != (matriz.length/2)){
			
			//Muevo la primera fila y la primera columna
			for(int i = cont; i < (matriz.length-cont); i++) {
				
				if(i == cont) {
					aux = matriz[i][matriz[i].length-(1+ cont)];
					for(int j = matriz[i].length - (2 + cont); j >= cont ;j--) {
						
						matriz[i][j+1] = matriz[i][j];
					}
					
				
				}
				else {
					matriz[i-1][cont] = matriz[i][cont];
			
				}
			}
			//Muevo la última fila y la útima columna
			for(int i = matriz.length-(1 + cont); i >= cont;i--) {
				
				if(i == matriz.length-(1 + cont)) {
					
					for(int j = 1 + cont; j < matriz[i].length-cont  ;j++) {	
						matriz[i][j-1] = matriz[i][j];
					}
				}
				else if(i == cont) {
					
					matriz[i+1][matriz[i].length-(1+cont)] = aux;
				}
				else {
					
					matriz[i+1][matriz[i].length-(1+cont)] = matriz[i][matriz[i].length-(1+cont)];
					
				}
				
			}
			cont++;
		}
		
		
		
		//Imprimo la matriz
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j] + "\t"); 
			}
			System.out.println(); 
		}
		
		
	}
}
