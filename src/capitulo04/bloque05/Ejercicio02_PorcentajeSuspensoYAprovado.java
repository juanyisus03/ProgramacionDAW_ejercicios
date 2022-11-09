package capitulo04.bloque05;

/*
 * Crea un array de 20 números enteros generados al azar entre 0 y 10. Analiza el array y calcula el porcentaje (con decimales) 
 * de notas aprobadas ( >= 5 ) y de notas suspensas
 */

public class Ejercicio02_PorcentajeSuspensoYAprovado {
	public static void main(String[] args) {
		int array[] = Utils.UtilsArrays.creaArrayNumerosAzar(20, 0, 10);
		
		porcentajes(array);

	}

	public static void porcentajes(int[] array) {
		int suspensos = 0;
		int aprobados = 0;
		
		//Recorro el array contando los suspensos y los aprobados
		for(int i = 0; i < array.length; i ++) {
			if(array[i] >= 5) aprobados ++;
			else suspensos ++;
		}
		//Imprimo sus porcentajes
		System.out.println("Han aprobado un " + aprobados/20f * 100 + "%");
		System.out.println("Han suspendido un " + suspensos/20f * 100 + "%");
	}
	
	

}
