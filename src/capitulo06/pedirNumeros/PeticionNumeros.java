package capitulo06.pedirNumeros;
import java.util.Scanner;

/* Implementa un programa que contenga una clase llamada "PeticionNumeros", con un método "pideNumeroPar()". Desde un método "main()" llama al método anterior. 
 * Dentro del método "pideNumeroPar()" debes crear todo lo necesario para disparar una Exception, creada por ti, cuando el número introducido no sea un número par.
 * 
 * 
 *
 */

public class PeticionNumeros {

	public static void main(String[] args) {
		try {
			
			System.out.println(pideNumeroPar() + " es un número par");
			
		} catch (OddNumberException e) {
			
			e.printStackTrace();
		}

	}

	private static int pideNumeroPar() throws OddNumberException{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce un número par: ");
		num = sc.nextInt();
		if(num%2 == 1) throw new OddNumberException("Error: el número introducido es impar");
		return num;
	}

}
