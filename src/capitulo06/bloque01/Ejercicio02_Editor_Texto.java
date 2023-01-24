package capitulo06.bloque01;

/*
 * 2.- Escribe un programa editor de textos. Debes utilizar la consola de Java. El objetivo es que se pueda editar el contenido de un archivo ficticio. Para hacer esto utilizarás una lista de elementos de tipo String. Cada línea del texto será representada como un String. Debes mostrar un menú en pantalla, que contenga todas las opciones siguientes, y que funcionen adecuadamente:
a) "Abandonar el programa".
b) "Agregar una línea al texto". Pediras al usuario un String y lo agregarás al final de la lista que representa tu fichero ficticio.
b) "Insertar una línea en cualquier posición del texto". Pedirás al usuario un String y un número. Insertarás el String en la línea pedida.
c) "Editar una línea (reescribir su contenido)". Pedirás al usuario un número de línea para sobrescribir, mostrarás al usuario la línea actual que desea sobrescribir. Pedirás un nuevo String. Eliminarás el String actual y cambiarás con el nuevo
d) "Borrar una línea". Pedirás un número de línea y la eliminarás de la lista.
e) "Cortar un conjunto de líneas", (marcadas por su posición inicial y final). Pedirás un número de línea inicial y uno final. "Transportarás todas las líneas del intervalo a una nueva lista y las borrarás de la lista original.
f) "Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás un número de línea en la que insertar lo que tienes cortado con la opción anterior.
g) "Imprimir el fichero". Mostrarás cada línea del fichero ficticio, aparecerá numerada en la consola
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio02_Editor_Texto {

	public static void main(String[] args) {
		List<String> fichero = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		int opt;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("     Menú");
			System.out.println("--------------- \n");
			System.out.println("1. Agregar una línea al texto");
			System.out.println("2. Insertar una línea en cualquier posición del texto");
			System.out.println("3. Editar una línea (reescribir su contenido)");
			System.out.println("4. Borrar una línea");
			System.out.println("5. Cortar un conjunto de líneas");
			System.out.println("6. Pegar un conjunto de líneas cortadas en una determinada posición");
			System.out.println("7. Imprimir Fichero");
			System.out.println("0. Salir \n");
			System.out.print("Seleccione opción: ");
			opt = sc.nextInt();
			
			if(opt == 1) agregar(fichero);
			else if(opt == 2) insertar(fichero);
			else if(opt == 3) editar(fichero);
			else if(opt == 4) eliminar(fichero);
			else if(opt == 5) cortar(fichero, portapapeles);
			else if(opt == 6) pegar(fichero, portapapeles);
			else if(opt == 7) imprimir(fichero);
			
		}while(opt != 0);
	}

	private static void pegar(List<String> fichero, List<String> portapapeles) {
		int index;
		
		if(portapapeles.isEmpty()) JOptionPane.showMessageDialog(null, "Portapapeles vacio");
		else {
			index = Integer.parseInt(JOptionPane.showInputDialog("Lugar en el que pegar: "));
			fichero.addAll(index, fichero);
		}
	}

	private static void cortar(List<String> fichero, List<String> portapapeles) {
		int ini, fin;
		
		if(fichero.isEmpty()) JOptionPane.showMessageDialog(null, "Fichero vacio");
		else {
			ini = Integer.parseInt(JOptionPane.showInputDialog("Desde que linea desea cortar: "));
			fin = Integer.parseInt(JOptionPane.showInputDialog("Hasta que linea desea cortar: "));
			portapapeles.clear();
			for (int i = ini-1; i < fin; i++) {
				portapapeles.add(fichero.get(i));
				fichero.remove(i);
			}
		}
	}
		

	private static void eliminar(List<String> fichero) {
		if(fichero.isEmpty()) JOptionPane.showMessageDialog(null, "Fichero vacio");
		else fichero.remove(Integer.parseInt(JOptionPane.showInputDialog(null, "Linea que desea borrar: ")));
	}

	private static void editar(List<String> fichero) {
		int index;
		if(fichero.isEmpty()) JOptionPane.showMessageDialog(null, "Fichero vacio");
		else{
			index = Integer.parseInt(JOptionPane.showInputDialog("Posición a editar: ")) - 1;
			fichero.set(index ,JOptionPane.showInputDialog("Introduzca línea de texto: "));
		}
		
		
	}

	private static void insertar(List<String> fichero) {
		int index;
		index = Integer.parseInt(JOptionPane.showInputDialog("Posición a insertar: ")) - 1;
		fichero.add(index ,JOptionPane.showInputDialog("Introduzca línea de texto: "));
	}

	private static void agregar(List<String> fichero) {
		
		fichero.add(JOptionPane.showInputDialog("Introduzca línea de texto: "));
		
	}

	
	private static void imprimir(List<String> fichero) {
		if(fichero.isEmpty()) JOptionPane.showMessageDialog(null, "Fichero vacio");
		else {
			System.out.println("     Tu texto");
			System.out.println("-------------------");
			for (String str : fichero) {
				System.out.println(str);
			}
			System.out.println();
		}
		
	}
	

}
