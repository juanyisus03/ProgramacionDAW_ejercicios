package examenes.examen_20221018;

import java.util.Scanner;

public class EjercicioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digito = -1;
		int num;
		
		//Pido al usuario el dígito
		while(digito > 9 || digito < 0) {
			System.out.print("Introduzca un dígito: ");
			digito = sc.nextInt();
		}
			
		//Inicializo la variable
		for(int i = 0; i < 100; i++) {
			num = (int) Math.round(Math.random()*(100));
			
			//Para saber si el número termina en el dígito averiguo el módulo del número entre 10 
			if((num % 10) == digito) {
				System.out.println(num + " termina en " + digito);
			}
			else {
				System.out.println(num);
			}
			
		}

	}

}
