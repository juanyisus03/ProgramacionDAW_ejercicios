package capitulo02.bloque01;
/*
 * Realizar un ejercicio en Java que pida un número al usuario e 
 * indique en pantalla si se trata de un número par o impar.
 * Recuerda que un número par es aquel cuyo resto de su división entre dos 
 * sea siempre cero, y recuerda que un número impar es aquel cuyo 
 * resto de su división entre dos sea siempre uno. 
 */
import java.util.Scanner;

public class Ejercicio06_IndicarSiEsParOImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		if(num%2== 0) {
			
			System.out.println("El numero es par");
			
		}
		else {
			
			System.out.println("El numero es impar");
		
		}
	}
}
