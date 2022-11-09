package capitulo04.bloque05;

/*
 *  Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x 5 columnas. 
 *  Una vez hecho el array, realiza estos pasos:
    - Crea un método que rellena la matriz con valores creados al azar.
    - Crea un método que imprima la matriz en pantalla.
    - Crea un método que compruebe si la matriz es positiva. (Todos sus elementos mayores o iguales a cero)
    - Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no est´an en la diagonal principal son nulos).
    - Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
    - Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo)
    - Crea un método que construya un array unidimensional con todos los elementos de la matriz.
    - Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
    - Crea un método que realice la matriz traspuesta de la que recibe.
    - Crea un método que realice la matiz opuesta de la que recibe.
    - Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando el número de fila que el usuario ha especificado
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Utils.UtilsArrays;

public class Ejercicio04_MétodosConMatriz {
	
	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		int num = -1;
		String stringNum;
		
		inicializarMatriz(matriz);
		while(num != 0) {
			imprimirMatriz(matriz);
			menu();
			do {
				stringNum = JOptionPane.showInputDialog("Introduzca el número de la opción");
				Pattern patron = Pattern.compile("[0-9]");
				Matcher comparar = patron.matcher(stringNum);
				
				if(comparar.find()) num = Integer.parseInt(stringNum);
				else num = -1;
			}
			while(num < 0 || num > matriz.length); 
					
			
				 switch (num) {
					case 0:
						JOptionPane.showMessageDialog(null, "Adiós");
						return;
					case 1:
						esPositiva(matriz);
						break;
					case 2:
						esDiagonal(matriz);
						break; 
					case 3:
						esTriangularSuperior(matriz);
						break;
					case 4:
						esDispersa(matriz);
						break;
					case 5:
						deMatrizAArray(matriz);
						break;
					case 6:
						esSimetrica(matriz);
						break;
					case 7:
						matrizTranspuesta(matriz);
						break;
					case 8:
						matrizOpuesta(matriz);
						break;
					case 9:
						eliminarfila(matriz);
						break;
				
				}
				 
				System.out.println("\n \n \n \n \n \n \n \n \n \n");
				
			 
			
			 
		}
		 
		
		
		
		
		
		
		
		
		
	}


	public static void inicializarMatriz(int[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random()*100);
			}
		}
		
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				
				System.out.print("| " + matriz[i][j] + "   ");
			}
			System.out.print(" | \n"); 
		}
		System.out.println("\n \n \n");
		
	}
	
	public static void menu(){
		System.out.println("1. Comprobar si es positiva");
		System.out.println("2. Comprobar si es diagonal");
		System.out.println("3. Comprobar si es triangular superior");
		System.out.println("4. Comprobar si es dispersa");
		System.out.println("5. Crear e imprimir array equivalente");
		System.out.println("6. Comprobar si es simétrica");
		System.out.println("7. Hallar matriz transpuesta");
		System.out.println("8. Hallar matriz opuesta");
		System.out.println("9. Como se vería sin determinada fila");
		System.out.println("0. Salir");
	}
	
	public static void esPositiva(int[][] matriz){
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				if(matriz[i][j] < 0) {
					JOptionPane.showMessageDialog(null, "La matriz no es positiva");
					return;
				}
				
			}
		}
		JOptionPane.showMessageDialog(null, "La matriz es positiva");
	}
	
	public static void esDiagonal(int[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i != j && matriz[i][j] != 0) {
					JOptionPane.showMessageDialog(null, "La matriz no es diagonal");
					return;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "La matriz es diagonal");
	}
	
	
	public static void esTriangularSuperior(int[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = i; j > 0; j--) {
				if(i != j && matriz[i][j] != 0) {
					JOptionPane.showMessageDialog(null, "La matriz no es triangular superior");
					return;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "La matriz es triangular superior");
	}
	
	public static void esDispersa(int[][] matriz) {
		int contfila = 0;
		int contcolumnas = 0;

		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == 0) {
					contfila++;
					break;
				}
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[j][i] == 0) {
					contcolumnas++;
					break;
				}
			}
		}
		if(contcolumnas == matriz.length && contfila == matriz[0].length) {
			JOptionPane.showMessageDialog(null, "La matriz es dispersa");
		}
		else {
			JOptionPane.showMessageDialog(null, "La matriz no es dispersa");
		}
	}
	
	public static void deMatrizAArray(int[][] matriz) {
		int array[] = new int[contadorMatriz(matriz)];
		int cont = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
				array[cont] = matriz[i][j];
				cont++;
			}
		}
		UtilsArrays.mostrarArray(array);
		System.out.println("");
	}
	
	public static int contadorMatriz(int[][] matriz) {
		int cont = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				cont++;
			}
		}
		return cont;
		
	}
	
	public static void esSimetrica(int[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++){
				if(matriz[i][j] != matriz[j][i] || matriz.length != matriz[i].length) {
					JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
					return;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "La matriz es simétrica");
		
	}
	
	
	public static void matrizTranspuesta(int[][] matriz) {
		int transpuesta[][] = new int[matriz[0].length][matriz.length]; 
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++){
				transpuesta[i][j] = matriz[j][i];
			}
		}
		System.out.println("La matriz transpuesta \n\n");
		imprimirMatriz(transpuesta);
	}
	
	public static void matrizOpuesta(int[][] matriz) {
		int opuesta[][] = new int[matriz.length][matriz[0].length]; 
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++){
				opuesta[i][j] = - matriz[i][j];
			}
		}
		System.out.println("La matriz opuesta \n\n");
		imprimirMatriz(opuesta);
	}
	
	public static void eliminarfila(int[][] matriz) {
		int sinfila[][] = new int[matriz.length - 1][matriz[0].length];
		int num = -1;
		String stringNum;
		
		while(num < 0 || num > matriz.length) {
			stringNum = JOptionPane.showInputDialog("Introduzca un número del 1 al 5");
			Pattern patron = Pattern.compile("[1-5]");
			Matcher comparar = patron.matcher(stringNum);
			
			if(comparar.find()) num = Integer.parseInt(stringNum) -1;
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++){
				if(i == num) break;
				else if(i < num) sinfila[i][j] =  matriz[i][j];
				else if(i > num) sinfila[i-1][j] =  matriz[i][j];
			}
		}
		System.out.println("La matriz sin la fila "+ (num+1) +" \n\n");
		imprimirMatriz(sinfila);
	}
	
	
	
	
	
	
	
	
	

}
