package capitulo04.bloque06;

/*
 * Modifica el programa anterior para que el recuadro se rellene por completo con "0" y "1" de forma aleatoria. 
 */

public class Ejercicio05_MarquitoYUnosYCeros {
	public static void main(String[] args) {
		char matriz[][] = new char[20][10];
		
		inicializarMatriz(matriz);
		imprimirMatriz(matriz);
	}

	public static void inicializarMatriz(char[][] matriz) {
		int numrandom;
		char var = '*';
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
				numrandom = (int) Math.round(Math.random()*100);
				if(i == 0 || i == matriz.length-1 || j == 0 || j == matriz[i].length-1) {
					matriz[i][j] = var; 
				}
				
				else if(numrandom % 2 == 0) {
					matriz[i][j] = '0';
				}
				else{
					matriz[i][j] = '1';
				}
				
			}
		}
		
		
	}
	
	public static void imprimirMatriz(char[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}

}
