package capitulo05.bloque02.articulosComestibles;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Selección de artículo");
			System.out.println("---------------------\n");
			System.out.println("1. Perecedero");
			System.out.println("2. No Perecedero\n");
			System.out.print("Introduzca opción: ");
			opcion = sc.nextInt();
			
			if(opcion == 1) {
				Perecederos p = new Perecederos();
				System.out.print("Introduzca nombre: ");
				p.setNombre(sc.next()); 
				System.out.print("Introduzca codigo: ");
				p.setCodigo(sc.nextInt());
				System.out.print("Introduzca precio: ");
				p.setPrecio(sc.nextInt());
				System.out.print("Introduzca fecha de caducidad: ");
				p.setFechaCaducidad(sc.next());
				System.out.println(p.toString());
			}
			else if(opcion == 2) {
				NoPerecederos np = new NoPerecederos();
				System.out.print("Introduzca nombre: ");
				np.setNombre(sc.next()); 
				System.out.print("Introduzca codigo: ");
				np.setCodigo(sc.nextInt());
				System.out.print("Introduzca precio: ");
				np.setPrecio(sc.nextInt());
				System.out.print("Introduzca etiqueta: ");
				np.setEtiqueta(sc.nextInt());
				System.out.println(np.toString());
			}
			
			
		}
		
		

	}

}
