package examenes.examen_20230209;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		double e = 1;
		
		for(int denominador = 1; denominador < 10; denominador++) {
			
			e += 1f/hallarFactorial(denominador);
		}
		
		//Imprimo e
		System.out.println(e);
	}

		
	//Hallo el factorial del denominador
	private static long hallarFactorial(int denominador) {
		
		long factorial = 1;
		
		while(denominador > 1) {
			factorial *= denominador;
			denominador--;
		}
		return factorial;
	}

}
