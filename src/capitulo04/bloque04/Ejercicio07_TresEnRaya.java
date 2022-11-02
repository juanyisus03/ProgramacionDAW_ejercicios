package capitulo04.bloque04;

/*
 * Programa el juego de las tres en raya.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Ejercicio07_TresEnRaya {
	public static void main(String[] args) {
		String tablero[][] = new String[3][3];
		int turnos = 0;
		int fin = 0;
		
		inicializarTablero(tablero);
		imprimirTablero(tablero);
		while(turnos != 9) {
			
			ponerPieza(tablero, turnos);
			imprimirTablero(tablero);
			fin = partidaAcabada(tablero);
			if( fin != 0) {
				break;
			}
			turnos++;
			
		}
		
		if(fin == 1) System.out.println("El jugador 1 ha ganado");
		else System.out.println("El jugador 2 ha ganado");
		
		
		
	}
	
	public static void ponerPieza(String[][] tablero, int turno) {
		String pos;
		int posletra;
		String letras[] = new String[] {"a", "b", "c"};
		int num;

		do {
			pos = pedirString();
			posletra = posicionletra(pos,letras);
			num = Integer.parseInt(pos.substring(1, 2)) - 1;
		}
		while(tablero[num][posletra] != "-");
		
		if(turno%2 == 0) tablero[num][posletra] = "x";
		else tablero[num][posletra] = "o";
		
	

		
	}
	public static String pedirString() {
		//Hago que me den una posición
		String posicion;
		while(true) {
			posicion = JOptionPane.showInputDialog("Introduzca posición(una letra y un número seguidos)");
			if(esPosicion(posicion)) {
				return posicion;
			}
			else {
				posicion = JOptionPane.showInputDialog("Introduzca posición(una letra y un número seguidos)");
				
			}
		}	
	}
	public static int posicionletra(String pos, String[] letras) {
		int i = 0;
		pos = pos.substring(0, 1);
		for(i = 0; i < letras.length; i ++) {
			if(pos.toLowerCase().equals(letras[i].toLowerCase())) {
				break;
			}
		}
		return i;
		
		
	}
	
	public static boolean esPosicion(String palabra) {
		if(palabra.length()==2) {
			Pattern patron = Pattern.compile("([a-c]|[A-C]){1,1}+[1-3]{1,1}");
			Matcher comparar = patron.matcher(palabra);
			return comparar.find();
		}
		else {
			
			return false;
		}
		
	}

	public static void inicializarTablero(String[][] matriz) {
		//Le pongo los guiones al inicio de la matriz
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				
				matriz[i][j] = "-";
			}
			
			
		}
		
	}

	public static void imprimirTablero(String[][] matriz) {
		//Imprimo la matriz
		System.out.println(" A B C ");
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				
				System.out.print("|" + matriz[i][j]);
			}
			System.out.print("| "+ (i+1) +"\n"); 
		}
		System.out.println("\n \n \n \n");
		
	}
	
	public static int partidaAcabada(String [][] matriz){
		
		for(int i = 0; i < matriz.length; i ++) {
			//Compruebo las filas
			if(matriz[i][0] == matriz[i][1] && matriz[i][2] == matriz[i][0] && matriz[i][0] != "-") {
				
				if(matriz[i][0] == "x") {
					return 1;
				}
				else return 2;
			}
			//Compruebo las columnas
			else if(matriz[0][i] == matriz[1][i] && matriz[2][i] == matriz[0][i] && matriz[0][i] != "-") {
				
				if(matriz[0][i] == "x") {
					return 1;
				}
				else return 2;
			}
			//Compruebo una diagonal
			else if(matriz[0][0] == matriz[1][1] && matriz[2][2] == matriz[0][0] && matriz[0][0] != "-") {
				
				if(matriz[0][0] == "x") {
					return 1;
				}
				else return 2;
				
			}
			//Compruebo la otra diagonal
			else if(matriz[0][2] == matriz[1][1] && matriz[2][0] == matriz[1][1] && matriz[1][1] != "-") {
				
				if(matriz[2][0] == "x") {
					return 1;
				}
				else return 2;
				
			}
		}
		return 0;
		
	}
	
	
	
}

 