import javax.swing.JOptionPane;

public class HolaMundo {
	
	public static void main(String[] args) {
		int x = 0, num = 1;
		String e = " "; 
		String carac = "^";
		System.out.println(carac);
		while (num != 0){
			
			//Muestro un panel donde se introduzca el numero
			String	stringnum =  JOptionPane.showInputDialog("Pulse 4 para ir a la izquierda y 6 para la derecha");
			num = Integer.parseInt(stringnum);
		
			//Hago que si el num es 4, reduzca la x, pero si esta es 0, que no la disminuya
			if(num == 4 && x > 0) { carac = "<"; x--;}
			
			//Hago que si el num es 6 aumente la x, no hace falta limite aqui
			if (num == 6) {carac = ">"; x++;}
			
			//Cuando introduzca 0 imprimiria una ultima "o" por eso de este if para que eso no pase
			if(num != 0) {
				
				//Con este for pongo los espacios suficientes para que se dezplace
				for(int i = x;i > 0; i--) System.out.print(e);
			
				//Imprimo la o y salto de linea para que se vea mejor
				System.out.print(carac);
				System.out.println("");
				
			}
				
					
			
			
		}
	
	}
}

