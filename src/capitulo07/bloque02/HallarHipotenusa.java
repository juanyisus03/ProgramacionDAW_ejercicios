package capitulo07.bloque02;

/*
 * Dado un triángulo rectángulo cuyos catetos miden 4 cm y 5 cm respectivamente, hallar cuanto mide la hipotenusa.
 * 
 */

public class HallarHipotenusa {

	public static void main(String[] args) {
		System.out.println("Cateto mayor: 5");
		System.out.println("Cateto menor: 4");
		System.out.println("Hipotenusa: " + Math.hypot(4, 5));

	}

}
