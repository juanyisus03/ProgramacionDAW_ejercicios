package examenes.examen_20221018;

public class EjercicioD {

	public static void main(String[] args) {
		int num;
		
		//Inicializo las variables
		for(int i = 0; i < 11; i++) {
			num = (int) Math.round(Math.random()*100);
			System.out.println(" Divisores de " + num);
			System.out.println("----------------- \n");
			
			//Hallo el modulo del número con todos los números anteriores para saber si es divisor
			for(int j = 1; j <= num; j ++) {
				
				if(num%j == 0) {
					System.out.println("-" + j + " es divisor de " + num );	
				}
			}
			
			//Para que no se quede tan junto hago dos saltos de líneas
			System.out.println("\n \n");
		}

	}

}
