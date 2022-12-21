package capitulo04.bloque06;

/*
 *Realizar un programa que genere números aleatorios entre 1 y 1000 hasta que el valor medio de los números generados se aproxime a 500 
 *con un margen de error de 0,5. El programa deberá decir cuantos números aleatorios han sido generados cuando finalice.
 */
public class Ejercicio03_MediaConError {
	public static void main(String[] args) {
		int num = (int) Math.round(Math.random()*(1000-1)+1);
		float cont = 1;
		
		System.out.println("Generando números hasta que la media sea de 500 con 0,5 de error... \n");
		
		while(num/cont <= 499.5 || num/cont >= 500.5) {
			num += (int) Math.round(Math.random()*(1000-1)+1);
			cont++;
		}
		
		System.out.println("Se han generado " + (int) cont + " números aleatorios");
		
		
		
		
	}
}
