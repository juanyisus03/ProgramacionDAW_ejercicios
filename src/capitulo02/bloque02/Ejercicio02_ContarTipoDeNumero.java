package capitulo02.bloque02;
/*
 *  Realiza un ejercicio igual al anterior, pero con las dos siguientes diferencias:
 *  no existe la categoría de números negativos, por tanto si el usuario introduce 
 *  un negativo, el programa debe terminar; la otra diferencia es que, al acabar, 
 *  el programa no debe mostrar la suma de los números, sino cuantos han entrado
 *  en cada categoría. A esto se llema contadores, a diferencia del ejercicio anterior, 
 *  que reciben el nombre de acumuladores.
 */
import java.util.Scanner;

public class Ejercicio02_ContarTipoDeNumero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4,num5,contp,contm,contg;
		
		contp = 0;
		contm = 0;
		contg = 0;
		
		System.out.println("Introduzca un numero: ");
		num1 = sc.nextInt();
		if(num1<0) {
			
			return;
		}
		else {
			if(num1>=0 && num1 < 25) {
				contp = contp + 1;
			}
			else {
				if(num1>=25 && num1<250) {
					contm = contm + 1;
				}
				else {
					contg = contg + 1;
				}
				
			}
			
			
		}
		
		System.out.println("Introduzca un numero: ");
		num2 = sc.nextInt();
		if(num2<0) {
			
			return;
		}
		else {
			if(num2>=0 && num2 < 25) {
				contp = contp + 1;
			}
			else {
				if(num2>=25 && num2<250) {
					contm = contm + 1;
				}
				else {
					contg = contg + 1;
				}
				
			}
			
			
		}
		
		System.out.println("Introduzca un numero: ");
		num3 = sc.nextInt();
		if(num3<0) {
			
			return;
		}
		else {
			if(num3>=0 && num3 < 25) {
				contp = contp + 1;
			}
			else {
				if(num3>=25 && num3<250) {
					contm = contm + 1;
				}
				else {
					contg = contg + 1;
				}
				
			}
		}	
		
		
		System.out.println("Introduzca un numero: ");
		num4 = sc.nextInt();
		if(num4<0) {
			
			return;
		}
		else {
			if(num4>=0 && num4 < 25) {
				contp = contp + 1;
			}
			else {
				if(num4>=25 && num4<250) {
					contm = contm + 1;
				}
				else {
					contg = contg + 1;
				}
				
			}
			
		}	
		
		
		System.out.println("Introduzca un numero: ");
		num5 = sc.nextInt();
		if(num5<0) {
			
			return;
		}
		else {
			if(num5>=0 && num5 < 25) {
				contp = contp + 1;
			}
			else {
				if(num5>=25 && num5<250) {
					contm = contm + 1;
				}
				else {
					contg = contg + 1;
				}
				
			}
			
		}				
		
		System.out.println("Hay "+ contp + " numeros pequeños");
		System.out.println("Hay "+ contm + " numeros medianos");
		System.out.println("Hay "+ contg + " numeros grandes");
		
	}
	
}
