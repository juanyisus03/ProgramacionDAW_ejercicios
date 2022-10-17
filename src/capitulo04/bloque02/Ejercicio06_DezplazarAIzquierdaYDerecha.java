package capitulo04.bloque02;

/*
 *  Realiza un ejercicio igual al anterior, en el que el usuario también 
 *  pueda determinar la dirección del movimiento.
 */

import java.util.Scanner;

public class Ejercicio06_DezplazarAIzquierdaYDerecha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] =  new int [150];
		int cambio,saltos,movi;
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i] + ",");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("1. Mover a la derecha");
		System.out.println("2. Mover a la izquierda");
		System.out.println("");
		System.out.println("¿Qué opción desea realizar?");
		movi = sc.nextInt();
		
		System.out.println("¿Cuántos saltos hacia dicho lado?");
		saltos = sc.nextInt();
		
		if(movi == 1) {
			
			for(int i1 = 0; i1 < saltos; i1++) {
				for(int i2 = (array.length - 1); i2 > 0; i2--) {
					
					cambio = array[i2];
					array[i2] = array[i2-1];
					array[i2-1] = cambio;
					
				}
			}
		}
		else if(movi == 2) {
			
			for(int i1 = 0; i1 < saltos; i1++) {
				for(int i2 = 0; i2 < array.length-1; i2++) {
					
					cambio = array[i2];
					array[i2] = array[i2+1];
					array[i2+1] = cambio;
					
				}
			}
			
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ",");
		}
		
		
		
		
	}

}
