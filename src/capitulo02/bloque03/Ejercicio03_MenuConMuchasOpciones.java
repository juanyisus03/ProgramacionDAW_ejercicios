package capitulo02.bloque03;
/*
 * Realiza un programa que resuelva lo siguientes puntos:
 *     a.- Que muestre un menú en pantalla con opciones para:
 *           1. Cálculo de la hipotenusa de un triángulo.
 *           2. Cálculo de la superficie de una circunferencia.
 *           3. Cálculo del perímetro de una circunferencia.
 *           4. Cálculo del área de un rectángulo.
 *           5. Cálculo del área de un triángulo.
 *           0. Salir de la aplicación.
 *     b.- En la opción "1" debe pedir dos datos, correspondientes a las longitudes 
 *         de los dos catetos de un triángulo. Se debe imprimir la longitud de la
 *         hipotenusa. Recuerda que Hipotenusa al cuadrado = cateto1 al cuadrado 
 *         + cateto2 al cuadrado.
 *     c.- En la opción "2" debe pedir la longitud del radio de una circunferencia 
 *         e imprimir la superficie de la misma. Recuerda que el área es igual a PI 
 *         por el radio al cuadrado. Recuerda también que PI es igual a 3,1416.
 *     d.- En la opción "3" debe pedir la longitud del radio de una circunferencia e 
 *         imprimir la longitud del perímetro de la misma. Recuerda que la longitud 
 *         de la circunferencia = 2 por PI por el radio.
 *     e.- En la opción "4" debe pedir las longitudes de la base y la altura de un 
 *         rectángulo, e imprimir el área de dicho rectángulo. Recuerda que el área 
 *         del rectángulo es igual a la base por la altura.
 *     f.- En la opción "5" debe pedir la base y la altura de un tríangulo e imprimir 
 *         el área del mismo. Recuerda que el área del triángulo es la mitad del área 
 *         del rectángulo de igual base y altura.
 *     g.- Si la opción no fuese "0", "1", "2", "3", "4" o "5", el programa deberá 
 *         dar el mensaje de "opción incorrecta".
 */
import java.util.Scanner;

public class Ejercicio03_MenuConMuchasOpciones {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,opcion;
		double pi= Math.PI;
		
		System.out.println("Menú:");
		System.out.println("1.- Cálculo de la hipotenusa de un triángulo");
		System.out.println("2.- Cálculo de la superficie de una círculo");
		System.out.println("3.- Cálculo del perímetro de una circunferencia");
		System.out.println("4.- Cálculo del área de un rectángulo");
		System.out.println("5.- Cálculo del área de un triángulo");
		System.out.println("0.- Salir");
		System.out.println("");
		System.out.println("Elija una opción: ");
		opcion= sc.nextInt();
		
		switch(opcion) {
		
		case 0:
			return;
		case 1:
			System.out.println("Tamaño del primer cateto: ");
			num1 = (int) Math.pow(sc.nextInt(), 2);
			System.out.println("Tamaño del segundo cateto: ");
			num2 = (int) Math.pow(sc.nextInt(), 2);
			System.out.println("La hipotenusa es: "+ Math.sqrt(num1+num2));
			break;
		case 2:
			System.out.println("Introduzca radio del círculo: ");
			num1 = sc.nextInt();
			System.out.println("El area es: "+ Math.pow(num1, 2)*pi);
			break;
		case 3:
			System.out.println("Introduzca radio de la circunferencia: ");
			num1 = sc.nextInt();
			System.out.println("El perímetro es: "+ num1*pi*2);
			break;
		case 4:
			System.out.println("Altura del rectángulo: ");
			num1 = sc.nextInt();
			System.out.println("Anchura del rectángulo: ");
			num2 = sc.nextInt();
			System.out.println("El área del rectángulo es: "+ num1*num2);
			break;	
		case 5:
			System.out.println("Altura del triángulo: ");
			num1 = sc.nextInt();
			System.out.println("Anchura del triángulo: ");
			num2 = sc.nextInt();
			System.out.println("El área del triángulo es: "+ num1*num2/2);
			break;	
		default:
			System.out.println("Opción incorrecta");
				
		}	
	}
}
