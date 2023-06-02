package buscaminas;
import java.text.ParseException;

import javax.swing.JOptionPane;

public class Experimentos {
	
	/*
	 * Intento arcaico de buscaminas por obsesion
	 * 
	 * TO DO
	 * Solucionar el hecho de revelar casillas con cero y alrededor
	 */
	
	private static Casilla[][] m = new Casilla[5][5];
	private static boolean juegoTerminado = false;
	
	public static void main(String[] args) {
		buscaminas();
	}

	private static void buscaminas() {
		
		inicializarMatriz();
		revelarCasillasSinBombas();
		imprimirMatriz();
		do {
			
			pedirCasilla();
			imprimirMatriz();
		
		}while(!juegoTerminado);
		imprimirSolucion();
	}	
		

	private static void pedirCasilla() {
		int posX = -1, posY = -1;
		do {
			try {//posY equivale a la posicion de la i en la matriz, la posX equivale a la posicion j
				posY = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En que fila está la casilla a mirar? No conteste para salir")) -1;
				posX = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En que columna está la casilla a mirar? No conteste para salir")) -1;
			}catch(NumberFormatException ex) {
				if(ex.getCause() != null) JOptionPane.showMessageDialog(null,"Debe poner un número del 1 al 5" );
				else { 
					JOptionPane.showMessageDialog(null, "Adiós ;-)");
					System.exit(0);
				}
			}
			
			
		}while((esPosicionInvalida(posX, posY)));
		
		revelarCasilla(posX,posY);
	}

	private static void revelarCasilla(int posX, int posY) {
		m[posY][posX].setRevelado();
		if(m[posY][posX].esBomba()) {
			juegoTerminado = true;
			JOptionPane.showMessageDialog(null, "Booom");
		}
		
	}

	private static boolean esPosicionInvalida(int posX, int posY) {
		if(posX > 4 || posX < 0 || posY > 4 || posY < 0) {
			JOptionPane.showMessageDialog(null,"Debe poner un número del 1 al 5" );
			return true;
		}
		return false;
	}

	private static void imprimirSolucion() {
		System.out.println("   1 2 3 4 5 ");
		for(int i = 0; i < m.length; i++) {
			System.out.print((i+1)+"  ");
			for(int j = 0; j < m[i].length; j++) {
				m[i][j].setRevelado();
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("\n\n\n");
		
	}

	private static void revelarCasillasSinBombas() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j].getSinBombasCerca()) m[i][j].setRevelado();				
			}
		}
		
	}

	private static void inicializarMatriz() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = new Casilla();				
			}
		}
		contarX();
	}

	private static void imprimirMatriz() {
		System.out.println("   1 2 3 4 5 ");
		for(int i = 0; i < m.length; i++) {
			System.out.print((i+1)+"  ");
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("\n\n\n");

	}

	private static void contarX() {
		int cont;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(!m[i][j].esBomba()) {
					//Casos Limites
					
					// Primera Fila
					if(i == 0) {
						cont = primeraFila(0,i, j);
					}
					// Última Fila
					
					else if(i == (m.length-1)){
						cont = ultimaFila(0, i, j);
					}
					
					// Los demás casos
					else {
						
						cont = restoDeFilas(0, i, j);
					}
					m[i][j].setNumBombas(cont); 
					cont = 0;
				}
			}
		}
	}

	private static int restoDeFilas(int cont, int i, int j) {
		//Primera columna
		if(j == 0) {
			if(m[i-1][j].esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].esBomba()) {
				cont++;
			}
			if(m[i][j+1].esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].esBomba()) {
				cont++;
			}
			if(m[i+1][j].esBomba()) {
				cont++;
			}
		}
		//Última columna
		else if(j == m[i].length-1) {
			if(m[i-1][j].esBomba()) {
				cont++;
			}
			if(m[i-1][j-1].esBomba()) {
				cont++;
			}
			if(m[i][j-1].esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].esBomba()) {
				cont++;
			}
			if(m[i+1][j].esBomba()) {
				cont++;
			}
		}
		
		//Resto de columnas de la última fila
		else {
			if(m[i-1][j].esBomba()) {
				cont++;
			}
			if(m[i-1][j-1].esBomba()) {
				cont++;
			}
			if(m[i][j-1].esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].esBomba()) {
				cont++;
			}
			if(m[i+1][j].esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].esBomba()) {
				cont++;
			}
			if(m[i][j+1].esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].esBomba()) {
				cont++;
			}
		}
		return cont;
	}

	private static int ultimaFila(int cont, int i, int j) {
		//Primera columna
		if(j == 0) {
			if(m[i][j+1].esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].esBomba()) {
				cont++;
			}
			if(m[i-1][j].esBomba()) {
				cont++;
			}
		}
		//Última columna
		else if(j == m[i].length-1) {
			if(m[i][j-1].esBomba()) {
				cont++;
			}
			if(m[i-1][j-1].esBomba()) {
				cont++;
			}
			if(m[i-1][j].esBomba()) {
				cont++;
			}
		}
		
		//Resto de columnas de la última fila
		else {
			if(m[i][j+1].esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].esBomba()) {
				cont++;
			}
			if(m[i-1][j].esBomba()) {
				cont++;
			}
			
			if(m[i-1][j-1].esBomba()) {
				cont++;
			}
			if(m[i][j-1].esBomba()) {
				cont++;
			}
		}
		return cont;
	}

	private static int primeraFila(int cont,  int i, int j) {
		//Primera columna
		if(j == 0) {
			if(m[i][j+1].esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].esBomba()) {
				cont++;
			}
			if(m[i+1][j].esBomba()) {
				cont++;
			}
		}
		//Última columna
		else if(j == m[i].length-1) {
			if(m[i][j-1].esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].esBomba()) {
				cont++;
			}
			if(m[i+1][j].esBomba()) {
				cont++;
			}
		}
		
		//Resto de columnas de la primera fila
		else {
			if(m[i][j+1].esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].esBomba()) {
				cont++;
			}
			if(m[i+1][j].esBomba()) {
				cont++;
			}
			
			if(m[i][j-1].esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].esBomba()) {
				cont++;
			}
		}
		return cont;
	}
}
