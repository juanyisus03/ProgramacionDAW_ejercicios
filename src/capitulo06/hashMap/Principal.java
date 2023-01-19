package capitulo06.hashMap;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Principal {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap hm = new HashMap();
		
		do {
			menu(sc);
			eleccion(sc.nextInt(), hm);
		}while(true);
		
	}
	
	public static void menu(Scanner sc) {

		
		System.out.println("Registro de almacen");
		System.out.println("------------------- \n");
		
		System.out.println("1. Lista de artículos");
		System.out.println("2. Crear nuevo artículo");
		System.out.println("3. Eliminar un artículo");
		System.out.println("4. Actualizar un artículo");
		System.out.println("0. Salir \n");
		
		System.out.print("Seleccione opción: ");
		
	
		
	}
	
	private static void crearArticulo(HashMap hm) {
		String codigo = JOptionPane.showInputDialog("Introduce codigo del artículo: ");
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad que hay: "));
		int estante = Integer.parseInt(JOptionPane.showInputDialog("Introduce estante donde se encuentra: "));
		hm.put(codigo, new Articulo(codigo, cantidad, estante));
		System.out.println("\nArtículo añadido correctamente \n");
	}

	private static void eleccion(int opt, HashMap hm) {
		String codigo;
		switch (opt) {
		case 0:
			System.out.println("\nHasta otra ;-)");
			System.exit(0);
		case 1:
			
			if(!hm.isEmpty()) {
				Object claves[] = hm.keySet().toArray();
				for (int i = 0; i < claves.length; i++) {
					System.out.println(hm.get(claves[i]).toString());
				}
			}
			else System.out.println("\nNo hay nada en el almacén \n");
			break;
			
		case 2:
			
			crearArticulo(hm);
			break;
			
		case 3:
			
			codigo = JOptionPane.showInputDialog("Introduce codigo del artículo a eliminar: ");
			if(hm.containsKey(codigo)) hm.remove(codigo); 
			else System.out.println("\nNo existe dicho artículo \n");
			break;
			
		case 4:
			
			codigo = JOptionPane.showInputDialog("Introduce codigo del artículo a actualizar: ");
			if(hm.containsKey(codigo)) { 
				int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce nueva cantidad: "));
				int estante = Integer.parseInt(JOptionPane.showInputDialog("Introduce nuevo estante: "));
				((Articulo) hm.get(codigo)).setCantidad(cantidad);
				((Articulo) hm.get(codigo)).setEstante(estante);
			}
			else System.out.println("\nNo existe dicho artículo \n");
			break;
			
		}
		
	}

	

}
