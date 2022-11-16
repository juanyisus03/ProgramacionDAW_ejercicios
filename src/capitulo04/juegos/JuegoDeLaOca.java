package capitulo04.juegos;

import javax.swing.JOptionPane;

public class JuegoDeLaOca {
	public static void main(String[] args) {
		int posiciones[] = new int[] {0,0,0,0};
		int turnosSinTirar[] = new int[] {0,0,0,0};
		int turno = 0;
		int salir = 0;
		
		do {
			if(turno == 4) {
				turno = 1;
			}
			else turno++;
			if(turnosSinTirar[turno-1] == 0) {
				salir = JOptionPane.showConfirmDialog(null, "Lanza el dado jugador " + turno);
				if(salir != 0) break;
				tirarDado(posiciones, turno);
				casillasEspeciales(posiciones, turno, turnosSinTirar);
			}
			else if(turnosSinTirar[turno-1]-1 == 0) {
				JOptionPane.showMessageDialog(null, "Tiras en el siguiente turno Jugador " + turno);
				turnosSinTirar[turno-1]--;
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Te quedan " + (turnosSinTirar[turno-1]) + " turnos sin tirar Jugador " + turno);
				turnosSinTirar[turno-1]--;
				
			}
		}
		while(!(partidaAcabada(posiciones)));
		if(salir != 0) System.out.println("Hasta otra!!");
		else System.out.println("Gano el jugador " + turno);
		
	}		

	public static boolean partidaAcabada(int[] posiciones) {
		for(int i = 0; i < posiciones.length; i++) {
			if(posiciones[i] == 63) return true;
		}
		return false;
	}
//	Genero un número al azar entre 1 y 6 para simular un dado de seis caras
	public static void tirarDado(int[] posiciones, int turno) {
		int dado = (int) Math.round(Math.random()*(6 - 1) + 1);
		
		
		posiciones[turno - 1] += dado;
		JOptionPane.showMessageDialog(null, "Salío un "+ dado +". Ahora estas en la casilla " + posiciones[turno - 1]);
		
		if(posiciones[turno-1] > 63) {
			posiciones[turno-1] -= (posiciones[turno-1]-63);
		}
		
		
	}
//  Con este método miro si hay alguna casilla de oca, posada, dado etc etc, y realizo la función de la casilla correspondiente
	
	public static void casillasEspeciales(int[] posiciones, int turno, int[] turnosSinTirar) {
		
		switch(posiciones[turno - 1]) {
		
		case 1:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 5. Lanza de nuevo el dado");
			posiciones[turno - 1] = 5;
			tirarDado(posiciones, turno);
			break;	
		case 5:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 9. Lanza de nuevo el dado");
			posiciones[turno - 1] = 9;
			tirarDado(posiciones, turno);
			break;	
		case 6:
			JOptionPane.showMessageDialog(null, "De puente a puente y tiro porque te da la corriente. Estás en la casilla 12. Lanza de nuevo el dado");
			posiciones[turno - 1] = 12;
			tirarDado(posiciones, turno);
			break;
		case 9:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 14. Lanza de nuevo el dado");
			posiciones[turno - 1] = 14;
			tirarDado(posiciones, turno);
			break;		
			
		case 12:
			JOptionPane.showMessageDialog(null, "De puente a puente y tiro porque te da la corriente. Estás en la casilla 6. Lanza de nuevo el dado");
			posiciones[turno - 1] = 6;
			tirarDado(posiciones, turno);
			break;
		case 14:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 18. Lanza de nuevo el dado");
			posiciones[turno - 1] = 18;
			tirarDado(posiciones, turno);
			break;
		case 18:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 23. Lanza de nuevo el dado");
			posiciones[turno - 1] = 23;
			tirarDado(posiciones, turno);
			break;	
		case 19:	
			JOptionPane.showMessageDialog(null, "Caiste en la posada, un turno sin tirar");
			turnosSinTirar[turno - 1] = 1;
			break;
		case 23:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 27. Lanza de nuevo el dado");
			posiciones[turno - 1] = 27;
			tirarDado(posiciones, turno);
			break;
		case 26:	
			JOptionPane.showMessageDialog(null, "De dado ha dado y tiras porque te ha tocado. Estás en la casilla 53. Lanza de nuevo el dado");
			posiciones[turno - 1] = 53;
			tirarDado(posiciones, turno);
			break;	
		case 27:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 32. Lanza de nuevo el dado");
			posiciones[turno - 1] = 32;
			tirarDado(posiciones, turno);
			break;	
		case 31:	
			JOptionPane.showMessageDialog(null, "Caiste en el pozo, dos turnos sin tirar");
			turnosSinTirar[turno - 1] = 2;
			break;
		case 32:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 36. Lanza de nuevo el dado");
			posiciones[turno - 1] = 36;
			tirarDado(posiciones, turno);
			break;	
		case 36:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 41. Lanza de nuevo el dado");
			posiciones[turno - 1] = 41;
			tirarDado(posiciones, turno);
			break;	
		case 41:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 45. Lanza de nuevo el dado");
			posiciones[turno - 1] = 45;
			tirarDado(posiciones, turno);
			break;	
		case 45:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 50. Lanza de nuevo el dado");
			posiciones[turno - 1] = 50;
			tirarDado(posiciones, turno);
			break;
		case 50:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Estás en la casilla 54. Lanza de nuevo el dado");
			posiciones[turno - 1] = 54;
			tirarDado(posiciones, turno);
			break;	
		case 52:	
			JOptionPane.showMessageDialog(null, "Caiste en la cárcel, 3 turnos sin tirar");
			turnosSinTirar[turno - 1] = 3;
			break;
		case 53:	
			JOptionPane.showMessageDialog(null, "De dado ha dado y tiras porque te ha tocado. Estás en la casilla 26. Lanza de nuevo el dado");
			posiciones[turno - 1] = 26;
			tirarDado(posiciones, turno);
			break;	
		case 54:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. Lanza de nuevo el dado");
			posiciones[turno - 1] = 59;
			tirarDado(posiciones, turno);
			break;
		case 58:	
			JOptionPane.showMessageDialog(null, "Caiste en la calavera, de nuevo al principio");
			posiciones[turno - 1] = 0;
			break;
		case 59:	
			JOptionPane.showMessageDialog(null, "De oca en oca y tiro porque me toca. LLegaste al final!!!");
			posiciones[turno - 1] = 63;
			break;	
		}
		
		
	}

}
