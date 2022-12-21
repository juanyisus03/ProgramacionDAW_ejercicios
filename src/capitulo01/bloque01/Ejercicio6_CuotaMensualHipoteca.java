package capitulo01.bloque01;

/*
 *  Realiza un ejercicio en C para el cálculo de la cuota 
 *  mensual de una hipóteca (tema tan importante hoy día ;-))
 */




import java.util.Scanner;

public class Ejercicio6_CuotaMensualHipoteca {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su Capital: ");
		float cap = sc.nextFloat();
		
		System.out.println("Introduzca su Euribor: ");
		float euribor = sc.nextFloat();
		
		System.out.println("Introduzca su Diferencial: ");
		float dif = sc.nextFloat();

		
		System.out.println("Introduzca su Numero de Plazos Mensuales: ");
		int npm = sc.nextInt();
		
		double im = (euribor + dif)/12/100;
		double x = (double) Math.pow((1+im),npm);   
		double cm = cap*im*x/(x-1);
		
		
		System.out.println("Su Cuota Mensual es: " +cm );
		
}
}
