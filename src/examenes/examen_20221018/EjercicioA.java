package examenes.examen_20221018;

public class EjercicioA {

	public static void main(String[] args) {
		int num;
		int sumMultiplos = 0;
		int contador = 0;
		int sumImpares = 0;
		
		//Inicializo las 10 variables enteras 
		for(int i = 0; i < 10; i ++) {
			
			num = (int) Math.round(Math.random()*100);
			System.out.print(num + ", ");
			
			//Hallo los numeros múltiplos de 5
			if(num % 5 == 0) {
				sumMultiplos += num;
			}
			
			//Hago que si el número es impar se sume para hallar más tarde la media
			if((num & 1) == 1) {
				sumImpares += num;
				contador ++;
			}
		}
		//Imprimo la suma de los múltiplos de 5 e imprimo la media de los números impares
		System.out.println("\n \nLa suma de los múltiplos de 5 es: " + sumMultiplos);
		System.out.println("La media de los números impares es: " + sumImpares/ (float) contador);
	}

}
