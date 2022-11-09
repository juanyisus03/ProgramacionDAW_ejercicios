package capitulo04.bloque06;

/*
 *  Realizar un programa que cree una matriz de tipo char, con 20 filas y 10 columnas. Los elementos que constituyen el borde de la matriz 
 *  se deben rellenar, mediant bucles, con un asterisco. En el interior de la matriz, no en los bordes, debes crear un caracter '0' 
 *  en una posición aleatoria. El resto de la matriz debe tener espacios en blanco. Muestra la matriz por consola.
 */

public class Ejercicio04_MarquitoYO {
	public static void main(String[] args) {
		char matriz[][] = new char[20][10];
		
		inicializarMatriz(matriz);
		imprimirMatriz(matriz);
	}

	public static void inicializarMatriz(char[][] matriz) {
		//Hallo la posición del 0
		int posx = (int) Math.round(Math.random()*((matriz[0].length-2)-1)+1);
		int posy = (int) Math.round(Math.random()*((matriz.length-2)-1)+1);
		char var = '*';
		
		//Hago que en los bordes haya * y que en la posición hallada anteriormente este 0
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == 0 || i == matriz.length-1 || j == 0 || j == matriz[i].length-1) {
					matriz[i][j] = var; 
				}
				else {
					matriz[i][j] = ' ';
				}
				if(i == posy && j == posx) {
					matriz[i][j] = '0';
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
