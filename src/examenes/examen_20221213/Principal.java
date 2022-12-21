package examenes.examen_20221213;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		Juego juego;
		
		do {
			
			juego = new Juego();
			juego.jugar();
			juego.mostrarPrimerYUltimoDestruido();
			juego.mostrarOrdenDestruido();
			
			System.out.println("\n\n\n ¿Quiere jugar de nuevo?");
			System.out.println("1. Sí");
			System.out.println("2. No \n");
			opt = sc.nextInt();
			
		}while(opt == 1);
	}

}
