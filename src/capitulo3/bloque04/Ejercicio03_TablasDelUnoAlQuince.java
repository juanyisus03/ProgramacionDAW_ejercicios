package capitulo3.bloque04;

/*
 * Crea un ejercicio que imprima en pantalla todas las tablas de multiplicar desde el 1 hasta el 15. 
 * Debes utilizar únicamente bucles de tipo "do...while".
 */

public class Ejercicio03_TablasDelUnoAlQuince {

	public static void main(String[] args) {
		int i = 1;
		
		do {
			int num = 0;
			System.out.println(" Tabla del número " + i);
			System.out.println("--------------------");
			do {
				
				System.out.println(" " + i + " * " + num + " = " + i*num);
				num++;
				
			} while(num<11);
			
			System.out.println("");
			i++;
			
		} while(i < 16);
		
		
		
	}

}
