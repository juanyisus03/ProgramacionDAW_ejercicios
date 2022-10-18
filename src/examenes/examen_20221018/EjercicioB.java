package examenes.examen_20221018;

import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int limiteInferior = 1;
		int limiteSuperior = -1;
		
		//Pido al usuario un limite inferior y un limite superior
		while(limiteInferior > 0 || limiteSuperior < 0) {
			System.out.print("Introduzca limite inferior, debe ser negativo: ");
			limiteInferior = sc.nextInt();
			System.out.print("Introduzca limite superior, debe ser positivo: ");
			limiteSuperior = sc.nextInt();
			
			//Si los datos no son válidos, muestra este mensaje
			if(limiteInferior > 0 || limiteSuperior < 0) {
				System.out.println("\n \nDatos inválidos \n \n");
				
			}
		}
		
		//Inicializo las 10 variables 
		for(int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random()*(limiteSuperior - limiteInferior) + limiteInferior);
			System.out.print(num + ", ");
		} 

	}

}
