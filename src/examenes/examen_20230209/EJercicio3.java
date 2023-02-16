package examenes.examen_20230209;

import javax.swing.JOptionPane;

public class EJercicio3 {

	public static void main(String[] args) {
		boolean may, min, dig, notalfa;
		
		String frase = JOptionPane.showInputDialog("Introduzca una frase: ");
		
		String palabras[] = frase.split("[ ]{1,}");
		
		for (int i = 0; i < palabras.length; i++) {
			
			//Divido cada palabra en carateres y las mando a comprobar
			char[] caracteres = palabras[i].toCharArray();
			may = comprobarMayusculas(caracteres);
			min = comprobarMinusculas(caracteres);
			dig = comprobarDigitos(caracteres);
			notalfa = comprobarNoAlfanumericos(caracteres);
			
			if(may && min && dig && notalfa) System.out.println(palabras[i]);
		}
	}
	
	//Compruebo que tenga un cáracter no alfanumérico
	private static boolean comprobarNoAlfanumericos(char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			if(!Character.isLetterOrDigit(caracteres[i])) return true;
		}
		return false;
	}

		
	//Compruebo que tenga un dígito
	private static boolean comprobarDigitos(char[] caracteres) {
		
		for (int i = 0; i < caracteres.length; i++) {
			if(Character.isDigit(caracteres[i])) return true;
		}
		return false;
	}
	
	
	//Compruebo que al menos tenga dos minúculas
	private static boolean comprobarMinusculas(char[] caracteres) {
		int cont = 0;
		
		for (int i = 0; i < caracteres.length; i++) {
			if(Character.isLowerCase(caracteres[i])) cont++;
		}
		if(cont >= 2) return true;
		else return false;
	}

	//Compruebo que tenga una mayúscula
	private static boolean comprobarMayusculas(char[] caracteres) {
		
		for (int i = 0; i < caracteres.length; i++) {
			if(Character.isUpperCase(caracteres[i])) return true;
		}
		
		return false;
	}

}
