package capitulo05.bloque02.coleccionAntiguedades;

import java.util.Scanner;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
	
		System.out.println("Selección de antigüedad");
		System.out.println("---------------------\n");
		System.out.println("1. Joyas");
		System.out.println("2. Libro");
		System.out.println("3. Sarcófago");
		System.out.println("4. Pergamino \n");
		System.out.print("Introduzca opción: ");
		opcion = sc.nextInt();
		
		if(opcion == 1) {
			Joya j = new Joya();
			System.out.print("Introduzca origen: ");
			j.setOrigen(sc.next()); 
			System.out.print("Introduzca año de origen: ");
			j.setAnyo(sc.nextInt());
			System.out.print("Introduzca precio: ");
			j.setPrecio(sc.nextInt());
			System.out.print("Introduzca material: ");
			j.setMaterial(sc.next());
			System.out.println(j.toString());
		}
		else if(opcion == 2) {
			Libro l = new Libro();
			System.out.print("Introduzca origen: ");
			l.setOrigen(sc.next()); 
			System.out.print("Introduzca año de origne: ");
			l.setAnyo(sc.nextInt());
			System.out.print("Introduzca precio: ");
			l.setPrecio(sc.nextInt());
			System.out.print("Introduzca título: ");
			l.setTitulo(sc.next());
			System.out.print("Introduzca autor: ");
			l.setAutor(sc.next());
			System.out.println(l.toString());
		}
		else if(opcion == 3) {
			Sarcofago s = new Sarcofago();
			System.out.print("Introduzca origen: ");
			s.setOrigen(sc.next()); 
			System.out.print("Introduzca año de origne: ");
			s.setAnyo(sc.nextInt());
			System.out.print("Introduzca precio: ");
			s.setPrecio(sc.nextInt());
			System.out.print("Introduzca faraón: ");
			s.setFaraon(sc.next());
			System.out.println(s.toString());
		}
		else if(opcion == 4) {
			Pergamino p = new Pergamino();
			System.out.print("Introduzca origen: ");
			p.setOrigen(sc.next()); 
			System.out.print("Introduzca año de origne: ");
			p.setAnyo(sc.nextInt());
			System.out.print("Introduzca precio: ");
			p.setPrecio(sc.nextInt());
			System.out.print("Introduzca idioma: ");
			p.setIdioma(sc.next());
			System.out.print("Introduzca tipo de piel: ");
			p.setTipoPiel(sc.next());
			System.out.println(p.toString());
		}
		
	}

}
