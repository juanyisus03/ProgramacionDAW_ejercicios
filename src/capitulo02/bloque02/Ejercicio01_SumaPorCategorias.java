package capitulo02.bloque02;
/*
 * Realiza un ejercicio que acumule cinco números introducidos por el usuario,
 * es decir, que sume las cantidades introducidas, pero realizando cuatro 
 * categorías: números negativos, números bajos (entre 0 y 25, ambos inclusive),
 * números medios (entre 26 y 250, ambos inclusie) y números grandes (mayores de 250).
 * Al finalizar el programa, se debe mostrar el total de las sumas de los 
 * números introducidos en cada una de las categorías.
 */
import java.util.Scanner;

public class Ejercicio01_SumaPorCategorias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4,num5,sumn,sump,summ,sumg;
		
		sumn = 0;
		sump = 0;
		summ = 0;
		sumg = 0;
		
		System.out.println("Introduzca un numero: ");
		num1 = sc.nextInt();
		if(num1<0) {
			
			sumn = sumn + num1;
		}
		else {
			if(num1>=0 && num1 < 25) {
				sump = sump + num1;
			}
			else {
				if(num1 >= 25 && num1 < 250) {
					summ = summ + num1;
				}
				else {
					sumg = sumg + num1;
				}
				
			}
			
			
		}
		
		System.out.println("Introduzca otro numero: ");
		num2 = sc.nextInt();
		if(num2 < 0) {
			
			sumn = sumn + num2;
		}
		else {
			if(num2 >= 0 && num2 < 25) {
				sump = sump + num2;
			}
			else {
				if(num2 >= 25 && num2 < 250) {
					summ = summ + num2;
				}
				else {
					sumg = sumg + num2;
				}
				
			}
			
			
		}
		
		System.out.println("Introduzca otro numero: ");
		num3 = sc.nextInt();
		if(num3 < 0) {
			
			sumn = sumn + num3;
		}
		else {
			if(num3 >= 0 && num3 < 25) {
				sump = sump + num3;
			}
			else {
				if(num3 >= 25 && num3 < 250) {
					summ = summ + num3;
				}
				else {
					sumg = sumg + num3;
				}
				
			}
			
			
		}
		
		
		System.out.println("Introduzca otro numero: ");
		num4 = sc.nextInt();
		if(num4 < 0) {
			
			sumn = sumn + num4;
		}
		else {
			if(num4 >= 0 && num4 < 25) {
				sump = sump + num4;
			}
			else {
				if(num4 >= 25 && num4 < 250) {
					summ = summ + num4;
				}
				else {
					sumg = sumg + num4;
				}
				
			}
			
			
		}
		
		System.out.println("Introduzca otro numero: ");
		num5 = sc.nextInt();
		if(num5 < 0) {
			
			sumn = sumn + num5;
		}
		else {
			if(num5 >= 0 && num5 < 25) {
				sump = sump + num5;
			}
			else {
				if(num5 >= 25 && num5 < 250) {
					summ = summ + num5; 
				}
				else {
					sumg = sumg + num5;
				}
				
			}
			
			
		}
		System.out.println("Suma de numeros negativos: " + sumn );
		System.out.println("Suma de numeros pequeños: " + sump );
		System.out.println("Suma de numeros medianos: " + summ );
		System.out.println("Suma de numeros grandes: " + sumg );
		
		
		
	}

}
