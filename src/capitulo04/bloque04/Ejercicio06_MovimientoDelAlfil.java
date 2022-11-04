package capitulo04.bloque04;

/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición.
 *  Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas. 
 *  Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio06_MovimientoDelAlfil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String matriz[][] = new String[8][8];
		String letras[] = new String [] {"a","b","c","d","e","f","g","h"};
		String pos;
		int posletra;
		int num;
		
		System.out.print("Introduzca posición del alfil(una letra y un número seguidos): ");
		inicializarTablero(matriz);
		pos=pedirString(sc);
		posletra = posicionletra(pos,letras);
		num = Integer.parseInt(pos.substring(1, 2)) - 1;
		
		//Muestro las posiciones que va hacia arriba y la izquierda
		for(int cont = 0; (num - cont) != 0 && (posletra - cont) != 0 ;cont++) {
			
			matriz[num - cont -1][posletra - cont -1] = "x";
			System.out.println("Se podria dezplazar a la casilla: " + letras[(posletra - cont -1)] + "," + (num - cont));
			
		}
		
		//Muestro las posiciones que va hacia abajo y la derecha
		for(int cont = 0; (num + cont) != 8 && (posletra + cont) != 8 ;cont++) {
			if(((posletra + cont) < 8) && ((num + cont) < 8)) {
				matriz[num + cont][posletra + cont] = "x";
				System.out.println("Se podria dezplazar a la casilla: " + letras[(posletra + cont)] + "," + (num + (cont + 1) ));
			}
		}
		
		//Muestro las posiciones que va hacia abajo y la izquierda
		for(int cont = 0; (num - cont) != 0 && (posletra + cont) != 8 ;cont++) {
			if(((posletra + cont +1) < 8) && ((num - cont ) >= 0)) {
				matriz[num - cont -1][posletra + cont +1] = "x"; 
				System.out.println("Se podria dezplazar a la casilla: " + letras[(posletra + cont + 1)] + "," + (num - cont ));
			}
		}
		
		//Muestro las posiciones que va hacia arriba y la derecha
		for(int cont = 0; (num + cont) != 8 && (posletra - cont) != 0 ;cont++) {
			if(((posletra - cont -1) >= 0) && ((num + cont +1) < 8)) {
				matriz[num + cont + 1][posletra - cont -1] = "x"; 
				System.out.println("Se podria dezplazar a la casilla: " + letras[(posletra - cont -1)] + "," + (num + cont +2));
			}
		}
		
		imprimirTablero(matriz);
		
	
	}
	
	public static String pedirString(Scanner sc) {
		String posicion;
		while(true) {
			posicion = sc.next();
			if(esPosicion(posicion)) {
				return posicion;
			}
			else {
				System.out.print("Introduzca posición del alfil(una letra y un número): ");
				
			}
		}	
	}
	
	public static boolean esPosicion(String palabra) {
		if(palabra.length()==2) {
			Pattern patron = Pattern.compile("([a-h]|[A-H]){1,1}+[1-8]{1,1}");
			Matcher comparar = patron.matcher(palabra);
			return comparar.find();
		}
		else {
			
			return false;
		}
		
	}

	public static int posicionletra(String pos, String[] letras) {
		int i = 0;
		pos = pos.substring(0, 1);
		for(i = 0; i < letras.length; i ++) {
			if(pos.toLowerCase().equals(letras[i])) {
				break;
			}
		}
		return i;
	}
	public static void inicializarTablero(String[][] matriz) {

		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				
				matriz[i][j] = "-";
			}
			
			
		}
		
	}
	public static void imprimirTablero(String[][] matriz) {
		
		System.out.println(" a b c d e f g h ");
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				
				System.out.print("|" + matriz[i][j]);
			}
			System.out.print("| "+ (i + 1) +"\n"); 
		}
		System.out.println("\n \n \n \n");
		
	}
}
