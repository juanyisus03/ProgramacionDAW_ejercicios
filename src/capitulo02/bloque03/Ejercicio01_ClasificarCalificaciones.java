package capitulo02.bloque03;
/*
 * Realiza un ejercicio que califique la nota obtenida por un alumno/a en un examen. 
 * El ejercicio pedirá al usuario la nota numérica, y se imprimirá en pantalla
 * su traducción a nota de texto: muy deficiente, insuficiente, suficiente,
 * bien, notable y sobresaliente. Debes realizar el ejercicio a través de una 
 * sentencia switch, no de if anidados.
 */
import java.util.Scanner;

public class Ejercicio01_ClasificarCalificaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		
		System.out.println("Introduce tu nota: ");
		nota = sc.nextInt();
		
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy deficiente");
			break; 
		case 3:
		case 4:
			System.out.println("Deficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("La cifra entregada no puede ser una nota");
		}

	}

}
