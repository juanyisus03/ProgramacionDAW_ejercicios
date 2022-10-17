package capitulo04.bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiplicarPorNumeroDeterminado {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] =  new int [150];
		int num;
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i] + ", ");
			
		}
		System.out.println("");
		System.out.println("Introduzca número por cual quiera multiplicar");
		num = sc.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = array[i]*num;
			System.out.print(array[i] + ", ");
		
			
		}
		
	}	
}
