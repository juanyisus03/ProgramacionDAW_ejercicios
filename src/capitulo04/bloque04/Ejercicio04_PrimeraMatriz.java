package capitulo04.bloque04;


public class Ejercicio04_PrimeraMatriz {
	public static void main(String[] args) {
		int matriz[][] = new int[6][10];
		boolean cambio = true;
		int mayor = 0, menor = 0;
		
		//Inicializo la matriz
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
					matriz[i][j] = (int) Math.round(Math.random()*1000);
				
			}
		}
		//Recorro la matriz y compruebo si el número está 
		while(cambio == true) {
			
			cambio = false;
			
			for (int i = 0; i < matriz.length; i++) { 
				
				for (int j = 0; j < matriz[i].length; j++) {
					
					for(int k = 0; k < matriz.length; k++) {
					
						for(int l = 0; l < matriz[k].length; l++) {
							
							if(matriz[i][j] == matriz[k][l] && (k != i || l != j)) { // Si el valor el primer puntero coincide con el segundo
								cambio = true;
								matriz[k][l] = (int) Math.round(Math.random()*1000);
							}
						}
					}
				}
			}
		}
		
		
		
		
		//Imprimo la matriz
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j] + "\t"); 
			}
			System.out.println(); 
		}
		//Hallo el mayor y el menor
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == 0 && j == 0) {
					mayor = matriz[i][j];
					menor = matriz[i][j];
				}
				else {
					if (matriz[i][j] > mayor) mayor = matriz[i][j];
					if (matriz[i][j] < menor) menor = matriz[i][j];
				}
			}
		}
		
		//Hayo la posicion del mayor y del menor
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
			
				if(mayor == matriz[i][j]) System.out.println("El mayor número es " + mayor + " en la posicion (" + i + ", " + j + ")"); ;
				if(menor == matriz[i][j]) System.out.println("El menor número es " + menor + " en la posicion (" + i + ", " + j + ")"); ;
				
			}
		
		}
		
		
	}
}
