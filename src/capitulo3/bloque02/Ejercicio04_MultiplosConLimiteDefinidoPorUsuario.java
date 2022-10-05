package capitulo3.bloque02;

/*
 *Reforma el ejercicio anterior, para que el límite sea también introducido por el usuario.
 */

import java.util.Scanner;

public class Ejercicio04_MultiplosConLimiteDefinidoPorUsuario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, limite;
		
		System.out.println("¿De qué número quieres ver los múltiplos?");
		num = sc.nextInt();
		
		System.out.println("¿Hasta qué número quieres ver los múltiplos?");
		limite = sc.nextInt();
		
		System.out.println("Múltiplos de " + num + " hasta " + limite);
		System.out.println("");
		
		for(i = num; i < limite; i += num) {
		
			System.out.println(i);
		}
	}
}
