package capitulo07.bloque02;

/*
 * Aproximar, con una precisión de 0.00001 décimas, el número PI. Para esto debes utilizar el método "Calcular el valor de PI utilizando series infinitas" (Método 2) del enlace https://es.wikihow.com/calcular-Pi
 */

public class AveriguarPi {
	
	public static void main(String[] args) {
		double pi = 0;
		int x = 1;
		int cont = 0;
		do {
			if(cont%2 == 0) pi += 4/(double) x;
			else pi += - 4/(double) x;
			x = x+2;
			System.out.println(pi);
			System.out.println(x);
			cont++;
			
		}while(Math.abs(pi-Math.PI) >= 0.0001);
		
		System.out.println(pi);
	}
	
}
