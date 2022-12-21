package capitulo05.bloque01;

import java.util.Scanner;

public class MenuPersonas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		Persona agenda[] = new Persona[0];
		
		do {
			menu();
			System.out.print("Introduzca opción: ");
			option = sc.nextInt();
			switch(option) {
			case 0:
				System.out.println("Adiós");
				System.exit(0);
			case 1:
				Persona persona = new Persona();
				System.out.print("Introduzca nombre: ");
				persona.setNombre(sc.next());
				System.out.print("Introduzca apellido: ");
				persona.setApellido(sc.next());
				System.out.print("Introduzca DNI: ");
				persona.setDni(sc.next());
				System.out.print("Introduzca direccion: ");
				persona.setDireccion(sc.next());
				System.out.print("Introduzca telefono: ");
				persona.setTelefono(sc.nextInt());
				agenda = addPersona(agenda, persona);
				break;
			case 2:
				if (agenda.length == 0) System.out.println("\n\n\n No tienes ninguna persona registrada \n\n\n");
				else {
					for(int i = 0; i < agenda.length; i++) {
						System.out.println(agenda[i].toString());
					}
				}
				
			}
			
			
			
		}while(true);
		
	}
	public static void menu() {
		
		System.out.println("      Menú       ");
		System.out.println("-----------------\n");
		System.out.println("1. Crear persona ");
		System.out.println("2. Mostrar personas");
		System.out.println("0. Salir \n");
		
	}
	
public static Persona[] addPersona(Persona[] agenda, Persona persona) {
		Persona sustituto[] = new Persona[agenda.length+1];
		for(int i = 0; i < agenda.length; i++) {
			sustituto[i] = agenda[i];
		}
		sustituto[sustituto.length-1] = persona;
		return sustituto;
		
	}
	
}
