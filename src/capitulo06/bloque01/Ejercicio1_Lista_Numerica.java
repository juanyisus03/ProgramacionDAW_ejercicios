package capitulo06.bloque01;

/*
 * Realiza los siguientes ejercicios, utilizando las listas:

1.- Realiza un programa que trabaje con una Lista de elementos Integer. Debes mostrar un menú en pantalla y ofrecer al usuario las siguientes opciones a realizar sobre la lista:
a) "Abandonar el programa".
b) "Crear aleatoriamente la lista de valores". Pedirás al usuario los siguientes datos: longitud de la lista, valor mínimo y valor máximo. A continuación limpiarás la lista (por si contenía valores), y agregarás tantos elementos enteros como se haya indicado, con valores que deben oscilar entre el mínimo y el máximo señalado.
c) "Calcular suma, media, mayor y menor". Mostrarás en pantalla esos cuatro valores.
d) "Agregar una cantidad de nuevos valores". Pedirás al usuario los siguientes datos: cuántos datos nuevos quiere agregar, posición a partir de la que se deben introducir, valor mínimo y valor máximo. Incluirás tantos valores como indique el usuario, en la posición indicada, con valores entre mínimo y máximo.
e) "Eliminar elementos cuyo valor esté en un intervalo". Pedirás dos valores al usuario (mínimo y máximo), que conforman un intervalo. Eliminarás los valores de la lista de elementos que se encuentren dentro de ese intervalo (incluyendo los límites) e informarás de cuantos elementos has eliminado de la lista.
f) "Imprimir la lista". Mostrarás la lista en pantalla.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1_Lista_Numerica {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		int opt;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("     Menú");
			System.out.println("--------------- \n");
			System.out.println("1. Crear aleatoriamente la lista de valores");
			System.out.println("2. Calcular suma, media, mayor y menor");
			System.out.println("3. Agregar una cantidad de nuevos valores");
			System.out.println("4. Eliminar elementos cuyo valor esté en un intervalo");
			System.out.println("5. Mostrar lista");
			System.out.println("0. Salir \n");
			System.out.print("Seleccione opción: ");
			opt = sc.nextInt();
			
			if(opt == 1) crearlista(lista, sc);
			else if(opt == 2) estadisticas(lista);
			else if(opt == 3) agregar(lista, sc);
			else if(opt == 4) eliminar(lista, sc);
			else if(opt == 5) mostrar(lista);
			
		}while(opt != 0);
	}

	public static void eliminar(List<Integer> lista, Scanner sc) {
		int min, max;
		
		System.out.println("Introduce rango");
		System.out.print("Valor mínimo: ");
		min = sc.nextInt();
		System.out.print("Valor máximo: ");
		max = sc.nextInt();
		
		for (int i = lista.size()-1; i >= 0; i--) {
			if(lista.get(i).intValue() >= min && lista.get(i).intValue() <= max) {
				lista.remove(i);
			}
		}
	}

	public static void agregar(List<Integer> lista, Scanner sc) {
		int index, cant, max, min;
		
		System.out.print("Cantidad de números a añadir: ");
		cant = sc.nextInt();
		System.out.print("En que sitio: ");
		index = sc.nextInt();
		System.out.print("Valor mínimo: ");
		min = sc.nextInt();		
		System.out.print("Valor máximo: ");
		max = sc.nextInt();
		
		for(int i = 0; i < cant; i++) lista.add(index, (int) Math.round(Math.random()*(max-min)+min));
		
	}

	public static void estadisticas(List<Integer> lista) {
		int sum = 0, min, max;
		
		if(lista.isEmpty()) JOptionPane.showMessageDialog(null, "Error lista vacia");
		else {
			min = lista.get(0);
			max = lista.get(0);
			for(Integer i : lista) {
				
				if(i.intValue() > max) max = i.intValue();
				if(i.intValue() < min) min = i.intValue();
				
				sum += i.intValue();
			}
			System.out.println("Suma: " + sum);
			System.out.println("Media: " + sum/lista.size()*1f );
			System.out.println("Mayor: " + max);
			System.out.println("Menor: " + min);
			
		}
		
	}

	public static void mostrar(List<Integer> lista) {
		if(lista.isEmpty()) JOptionPane.showMessageDialog(null, "Error lista vacia");
		else {
			for(Integer i : lista) {
				System.out.println(i.intValue());
			}
		}
		
	}

	public static void crearlista(List<Integer> lista, Scanner sc) {
		int l, max, min;
		
		lista.clear();
		System.out.print("Longitud de la lista: ");
		l = sc.nextInt();
		System.out.print("Valor mínimo: ");
		min = sc.nextInt();		
		System.out.print("Valor máximo: ");
		max = sc.nextInt();
		
		for(int i = 0; i < l; i++) lista.add((int) Math.round(Math.random()*(max-min)+min));
	}

}
