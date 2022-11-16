package capitulo04.juegos;

import javax.swing.JOptionPane;

public class JuegoDeLosBarquitos {
	public static void main(String[] args) {
		String tablero[][] = new String[10][10];
		inicializaTablero(tablero);
		pedirBarquitos(tablero);
		
		do {
			
			pedirPosicionYComprobar(tablero);
			
		}
		while(!esPartidaAcabada(tablero));
		
		
	}


	public static void inicializaTablero(String[][] tablero) {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = "-";
			}
		}
	}

	public static void pedirBarquitos(String[][] tablero) {
		int posX, posY;
		int tam = 4;
		int num = 0;
		for(int i = tam; i > 0; i--) {
			num++;
			for(int j = 0; j < num; j++) {
				do {
					//posY equivale a la posicion de la i en la matriz, la posX equivale a la posicion j
					posY = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En que fila quiere colocar el barco de " + i + "?")) -1;
					posX = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En que columna lo quiere colocar")) -1;
				}while((esPosicionInvalida(posX, posY, i, tablero)));
				
				
				imprimirTablero(tablero);
				
			}
		}
		
		
	}

	public static boolean esPosicionInvalida(int posX, int posY, int tam, String[][] tablero) {
		int direccion;
		if(posX >= 10 || posY >= 10 || posY <= -1 || posX <= -1) return true;
		
		direccion = Integer.parseInt(JOptionPane.showInputDialog(null, " 1. Hacia la derecha \n 2. Hacia arriba \n 3. Hacia abajo \n 4. Hacia izquierda \n Cualquier otro número para cancelar"));
		
		if(direccion == 1) {
			
//		Recorro la matriz para ver si se puede poner el barco
			
			if(tam+posX < tablero[posY].length) {
				for(int i = posY - 1; i < posY+1; i ++) {
					if(i > -1 && i < 10) {
						for(int j = posX -1; j < tam + 1 ; j++) {
							if(j > -1 && j < 10) {
								
//								Si me encuentro con un trozo de barco se sale
								
								if(tablero[i][j] == "x") {
									JOptionPane.showMessageDialog(null, "Posición Inválida");
									return true;
								}
							}
						}
					}
				}
//				Coloco el barquito
				for(int j = posX; j < tam ; j++) {
					tablero[posY][j] = "x";
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Posición Inválida");
				return true;
			}
		}
		else if(direccion == 2){
			
//			Recorro la matriz para ver si se puede poner el barco
			
			if(posY-tam >= 0) {
				for(int i = posY - tam -1; i < posY+1; i ++) {
					if(i > -1 && i < 10) {
						for(int j = posX -1; j < posX + 1 ; j++) {
							if(j > -1 && j < 10) {
								
//								Si me encuentro con un trozo de barco se sale
								
								if(tablero[i][j] == "x") {
									JOptionPane.showMessageDialog(null, "Posición Inválida");
									return true;
								}
							}
						}
					}
				}
//				Coloco el barquito
				for(int i = posY - tam ; i < posY ; i++) {
						tablero[i+1][posX] = "x";
				
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Posición Inválida");
				return true;
			}
		}
		
		else if(direccion == 3){
			
//			Recorro la matriz para ver si se puede poner el barco
			
			if(tam+posY < tablero.length) {
				for(int i = posY - 1; i < posY+1; i ++) {
					if(i > -1 && i < 10) {
						for(int j = posX -1; j < posX + 1 ; j++) {
							if(j > -1 && j < 10) {
								
//								Si me encuentro con un trozo de barco se sale
								
								if(tablero[i][j] == "x") {
									JOptionPane.showMessageDialog(null, "Posición Inválida");
									return true;
								}
							}
						}
					}
				}
//				Coloco el barquito
				for(int i = posY; i < tam ; i++) {
					tablero[i][posX] = "x";
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Posición Inválida");
				return true;
			}
		}
			
		else if(direccion == 4){
			
//			Recorro la matriz para ver si se puede poner el barco
			
			if(posX-tam >= 0) {
				for(int i = posY -1; i < posY +1 ; i++) {
					if(i > -1 && i < 10) {
						for(int j = posX - tam ; j < posX ; j++) {
							if(j > -1 && j < 10) {

//								Si me encuentro con un trozo de barco se sale
								
								if(tablero[i][j] == "x") {
									JOptionPane.showMessageDialog(null, "Posición Inválida");
									return true;
								}
							}
						}
					}
				}
//				Coloco el barquito
				for(int i = posY; i < tam ; i++) {
					tablero[i][posX] = "x";
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Posición Inválida");
				return true;
			}
		}
			
		else return true;
			
		
		return false;
	}
	
	public static void imprimirTablero(String[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("\n\n");
	}

	
	
	public static void pedirPosicionYComprobar(String[][] tablero) {
		int posY, posX;
		
		do {
			posY = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En que fila quiere comprobar si hay barco?")) -1;
			posX = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En que columna lo quiere comprobar")) -1;
		}
		while(!posicionValida(posY,posX));
		
		if(tablero[posY][posX] == "-") JOptionPane.showMessageDialog(null, "Agua");
		else if(tablero[posY][posX] == "x") {
			comprobarHundido(posY,posX,tablero);
		}
		
	}


	public static boolean posicionValida(int posY, int posX) {
		if((posY > -1 && posY < 10) && (posX > -1 && posX < 10)) return true;
		return false;
	}
	


	public static void comprobarHundido(int posY, int posX, String[][] tablero) {
		
		for(int i = posY-1; i < posY + 1; i++) {
			if(i > -1 && i < 10) {
				for(int j = posX - 1; j < posX + 1; j ++) {
					if(tablero[i][j] == "x") {
						JOptionPane.showMessageDialog(null, "Tocado");
						tablero[posY][posX] = "o";
						return;
					}			
				}
			}
		}
	}
	

	public static boolean esPartidaAcabada(String[][] tablero) {
		
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] == "x") return false;
			}
		}
		return true;
		
	}
	
}


