package capitulo02.bloque01;
/*
 * Pedir al usuario cinco números, e imprimir posteriormente 
 * el mayor valor introducido y el menor valor introducido.
 */
import java.util.Scanner;

public class Ejercicio05_ElegirMayorYMenorCincoNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1,num2,num3,num4,num5;
		
		
		System.out.println("Introduzca un numero: ");
		num1 = sc.nextFloat();
		System.out.println("Introduzca otro numero: ");
		num2 = sc.nextFloat();
		System.out.println("Introduzca otro numero: ");
		num3 = sc.nextFloat();
		System.out.println("Introduzca otro numero: ");
		num4 = sc.nextFloat();		
		System.out.println("Introduzca otro numero: ");
		num5 = sc.nextFloat();
		
		
		if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
					
					System.out.println("El primer numero, "+num1+ ", es el mayor");	
					
		}
				else { 
					if(num2>num3 && num2>num4 && num2>num5) {
					
						System.out.println("El primer numero, "+num2+ ", es el mayor");
					
					}
					else { 
						if(num3>num4 && num3>num5) {
					
							System.out.println("El primer numero, "+num3+ ", es el mayor");
					
						}
						else { 
							if(num4>num5) {
							
								System.out.println("El primer numero, "+num4+ ", es el mayor");
							
							}
							else {
								System.out.println("El primer numero, "+num5+ ", es el mayor");
								
								
								
							}
						}		 
					}
				}
			
		
		
				
		if(num1<num2 && num1<num3 && num1<num4 && num1<num5) {
			
			System.out.println("El primer numero, "+num1+ ", es el menor");	
		}
		else { 
			if(num2<num3 && num2<num4 && num2<num5) {
			
				System.out.println("El primer numero, "+num2+ ", es el menor");
			
			}
			else { 
				if(num3<num4 && num3<num5) {
			
					System.out.println("El primer numero, "+num3+ ", es el menor");
			
				}
				else { 
					if(num4<num5) {
					
						System.out.println("El primer numero, "+num4+ ", es el menor");
					
					}
					else {
						
						System.out.println("El primer numero, "+num5+ ", es el menor");
						
					}
				}		 
			}
		}
			
			
			
	
	}
}
