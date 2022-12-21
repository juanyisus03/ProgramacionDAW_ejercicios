package examenes.examen_20221123;

public class Ejercicio1 {
	public static void main(String[] args) {
		int matriz[][] = new int[][]   {{1, 	2, 		3, 		4},
										{5, 	6, 		7, 		8},
										{9, 	10, 	11,		12},
										{13, 	14, 	15, 	16}};
						
		if(esMatrizOrdenada(matriz)) {
			
			System.out.println("La matriz está ordenada");
		}	
		else {
			
			System.out.println("La matriz no está ordenada");
		}							
	}

	
	
	public static boolean esMatrizOrdenada(int matriz[][]) {
		int anterior= 0;
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				//Hago que el primer elemento de la matriz sea anterior
				if(j == 0 && i == 0) {
					anterior = matriz[i][j];
				}
				else {
					//Comparo el número anterior con el del array y si es menor devuelvo false
					if(matriz[i][j] < anterior) return false;
					
					anterior = matriz[i][j];
					
				}
					

				
				
			}
			
		}
		return true;
	}
	
}
