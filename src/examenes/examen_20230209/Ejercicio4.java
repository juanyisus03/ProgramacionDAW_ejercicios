package examenes.examen_20230209;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num, rojo = 0, azul = 0, verde = 077;
		int cont = 0;
		
		do {
			//Pido los números en el try y si ocurre algún error o el número no es válido lo mando al catch
			try {
				num = pedirNumero();
				if(cont == 0) rojo = num;
				if(cont == 1) verde = num;
				if(cont == 2) azul = num;
				cont++;
			}
			//En el catch le digo al usuario que dicha entrada no es válida
			catch (Exception e) {
				
				JOptionPane.showMessageDialog(null,"Error entrada no válida");
			}
		}while(cont != 3);
		
		System.out.println("Su color sería: " + Integer.toHexString(rojo) + Integer.toHexString(verde) + Integer.toHexString(azul) );
		
		
	}

	private static int pedirNumero() throws Exception {
		
		String str = JOptionPane.showInputDialog("Introduzca un número comprendido entre 0 y 255");
		
		try {
			//Intento parsear el String a int y sino, se va al catch
			int num = Integer.parseInt(str);
			if(num > 255 || num < 0) throw new Exception();
			else return num;
			
		}
		catch (Exception e) {
			throw e;
		}
	
	
		
	}

}
