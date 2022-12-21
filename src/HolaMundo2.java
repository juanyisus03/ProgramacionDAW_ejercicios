import java.util.Scanner;

public class HolaMundo2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[] {0,1,2,3,4,5,6,7,8,9};
		int ini = 1;
		int fin = 0;
		int cambio;
		
		
		
		//Imprimo el índice conjunto su valor correspondiente
		for(int i = 0; i < array.length; i++) {
		
			System.out.println("Indice " + i + " : " + array[i]);

		}
		
		System.out.println("");
		
		//Con este while hago repetir que me introduzca el inicial y el final sin los datos son inválidos
		while(ini > fin || ini < 0 || fin > 9) {
			
			System.out.print("Introduzca un indice inicial: ");
			ini = sc.nextInt();
			System.out.print("Introduzca un indice final: ");
			fin = sc.nextInt();
			
			if (ini > fin || ini < 0 || fin > 9) {
				System.out.println("");
				System.out.println("Datos no válidos");
				System.out.println("");
			}
		}
		
		
		if(!(ini == 0 && fin == 9)) {
			//Caso límite 1
			if(ini == 0) {
				cambio = array[array.length -1];
				for(int i = array.length - 1; i > fin ;i --) {
					array[i] = array[i - 1]; 
				}
				array[fin + 1] = cambio; 
			}
			//Caso límite 2
			else if(fin == 9){
				cambio = array[ini-1];
				for(int i = ini - 1; i > 0;i --) {
					array[i] = array[i - 1]; 
				}
				array[0] = cambio;
			}
			//Si el inicial es diferente 0 
			else {
				cambio = array[array.length -1]; 
				for(int i = array.length - 1; i > fin ; i--) {
					array[i] = array[i - 1];
				}
				int aux = array[ini-1];
				for(int i = ini - 1; i > 0;i --) {
					array[i] = array[i - 1]; 
				}
				array[0] = cambio;
				array[fin +1] = aux;
			}
			
			
				
					
					
			
			}
	
		
			
		//Imprimo el array para que se vean los cambios
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ", ");

		}
		
	}
}



