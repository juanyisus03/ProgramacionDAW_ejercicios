package capitulo04.bloque06;

/*
 *Realiza un programa que dibuje en la pantalla una onda aleatoria de asteriscos. Para resolver este problema utilizarás matrices de tipo char. 
 *En un tipo char guardas un carácter. Por ejemplo, la línea "char variable = 'p';" crea una variable de tipo char y le asigna la letra 'p' minúscula. 
 *Crea una matriz de 10 filas y 30 posiciones por fila, de tipo char, a continuación genera en cada fila un número aleatorio de asteriscos, 
 *cuando acabes en cada fila de introducir asteriscos, rellena el resto de la fila con espacios en blanco. Finalmente muestra la matriz en consola. 
 */

public class Ejercicio02_OndaConAsteriscos {
	public static void main(String[] args) {
		char matriz[][] = new char[10][30];
		
		
		inicializarMatriz(matriz);
		imprimirMatriz(matriz);
		
		
	}

	public static void imprimirMatriz(char[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}

	public static void inicializarMatriz(char[][] matriz) {
		char var = '*';
		int numrandom;
		
		for(int i = 0; i < matriz.length; i++) {
			
			numrandom = (int) Math.round(Math.random()*29);
			for(int j = 0; j < matriz[i].length; j++) {
				if(j <= numrandom) {
					matriz[i][j] = var;
				}
				else {
					matriz[i][j] = ' ';
				}
				
			}
		}
		
	}

}
