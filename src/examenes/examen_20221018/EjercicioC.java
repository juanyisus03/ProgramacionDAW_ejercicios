package examenes.examen_20221018;


public class EjercicioC {
	public static void main(String[] args) {
		int num;
		
		//Inicializo las variables
		for(int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random()*(50 - 20) + 20);
			
			//Hago que se repita una y otra vez hasta que el numero sea par, este comprendido entre 20-30 o este comprendido entre 40-50
			while(((num%2 != 0) ||  num > 30) && ((num%2 != 0) || num < 40 )) {
				num = (int) Math.round(Math.random()*(50 - 20) + 20);
			}
			
			//Imprimo dichos numeros
			System.out.print(num + ", ");
		} 
		
		
	}
}
