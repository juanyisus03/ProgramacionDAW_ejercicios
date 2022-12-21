package examenes.examen_20221123;

public class Ejercicio4 {
	public static void main(String[] args) {
		char frase[] = new char[] {'H', 'o', 'l', 'a', ' ','M', 'u', 'n', 'd', 'o'}; 
		
		//Imprimo como esta originalmente
		for(int i = 0; i < frase.length; i ++) {
			
			System.out.print(frase[i]);
		}
		
	    System.out.println("\n\nPasando mayúsculas a minúsculas...\n");
	    
	    //Imprimo el String producido por la unión del array en minúsculas
	    System.out.println(minusculas(frase));
	}
	public static String minusculas (char frase[]) {
		String fraseEnMinusculas = "";
		
		//Recorro la frase
		for(int i = 0; i < frase.length; i ++) {
			//Si tiene alguna mayúscula la cambio a minúscula
			if(frase[i] > 64 && frase[i] < 91) {
				frase[i] += 32;
			}
			//Los uno en una cadena de texto
			fraseEnMinusculas +=  frase[i];
		}
		
		return fraseEnMinusculas;
	}

}
