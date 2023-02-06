package capitulo07.bloque01;

import javax.swing.JOptionPane;

/*
 * Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
- Al menos una mayúscula.
- Al menos una minúscula.
- Al menos un dígito
- Al menos un carácter no alfanumérico.
El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.
 */


public class ContrasenaConRequisitos {
	public static void main(String[] args) {
		String contrasena;
		do {
			
			contrasena = JOptionPane.showInputDialog("Introduzca contraseña con un dígito, una mayúscula, minúscula y un carácter no alfanumérico");
			
		}while(esContraseñaInvalida(contrasena));
		
		JOptionPane.showMessageDialog(null, "Contraseña válida");
	}

	private static boolean esContraseñaInvalida(String contrasena) {
		char[] caracteres = contrasena.toCharArray();
		int min = 0, may = 0, num = 0, notAlfa = 0;
		for (int i = 0; i < caracteres.length; i++) {
			if(Character.isDigit(caracteres[i])) num++;
			else if(!Character.isAlphabetic(caracteres[i])) notAlfa++;
			else if(Character.isUpperCase(caracteres[i])) may++;
			else if(Character.isLowerCase(caracteres[i])) min++;
		}
		if(min == 0 || may == 0 || num == 0 || notAlfa == 0) return true;
		
		
		return false;
	}

}
