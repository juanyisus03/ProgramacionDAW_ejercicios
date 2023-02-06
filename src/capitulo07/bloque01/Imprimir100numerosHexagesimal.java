package capitulo07.bloque01;

/*
 * - Realizar un programa que imprima los 100 primeros números enteros en código hexadecimal.
 */

public class Imprimir100numerosHexagesimal {

	public static void main(String[] args) {
		System.out.println("Decimal   Hexagesimal");
		System.out.println("---------------------");
		for (int i = 0; i < 101; i++) {
			System.out.println("  " + i + "          " + Integer.toHexString(i) );
		}

	}

}
