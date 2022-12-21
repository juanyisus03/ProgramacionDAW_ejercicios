package examenes.examen_20221213;

import java.util.Arrays;

public class Juego {
	
	private Ladrillo ladrillos[] = new Ladrillo[20];
	private Pelota pelota;
	private Ladrillo destruidos[] = new Ladrillo[0];
	
	/**
	 * Con este método asigno a las variables "x" e "y" de la pelota números aleatorios.
	 * Hago que esto se repita hasta que no quede ningún bloque en el array de ladrillos. 	 
	 */
	public void jugar() {
		do {
			
			this.pelota.setX((int) Math.round(Math.random()*900));
			this.pelota.setY((int) Math.round(Math.random()*600));
			comprobarPosicion();
			
			for (int i = 0; i < ladrillos.length; i++) {
				
				if(ladrillos[i] != null) System.out.print(ladrillos[i].toString() + " ");
			}
			System.out.println();
			
			
		}while(!juegoAcabado());
		
		
	}
	
	/**
	 * Con este método miro si la pelota esta tocando algún bloque. 
	 * Si esto llega a ser así le quito un punto de vida al ladrillo. 
	 */
	private void comprobarPosicion() {
		for (int i = 0; i < ladrillos.length; i++) {
			if(ladrillos[i] != null) {
				if(this.pelota.getX() > ladrillos[i].getX() && this.pelota.getX() < ladrillos[i].getX()+ladrillos[i].getAncho()
				   && this.pelota.getY() > ladrillos[i].getY() && this.pelota.getY() < ladrillos[i].getY()+ladrillos[i].getAltura()) {
					
					ladrillos[i].setPuntosVida(ladrillos[i].getPuntosVida()-1);
				}
			
			
				if(ladrillos[i].getPuntosVida() == 0) {
					destruidos = añadirLadrillo(destruidos, ladrillos[i]);
					ladrillos[i] = null;
				}
			}
		}	
	}

	/**
	 * Con este método compruebo si el juego está acabado o no
	 */
	private boolean juegoAcabado() {
		for (int i = 0; i < ladrillos.length; i++) {
			if(ladrillos[i] != null) return false;
		}
		return true;
	}
	
	/**
	 * Con este método añado los ladrillos destruidos al array "destruidos"
	 */
	private Ladrillo[] añadirLadrillo(Ladrillo[] array, Ladrillo num) {
		Ladrillo sustituto[] = new Ladrillo[array.length+1];
		for(int i = 0; i < array.length; i++) {
			sustituto[i] = array[i];
		}
		sustituto[sustituto.length-1] = num;
		return sustituto;
		
	}
	
	/**
	 * Con este método imprimo el primer y el último ladrillo destruido
	 */
	public void mostrarPrimerYUltimoDestruido() {
		System.out.println("El primer ladrillo destruido fue: " + destruidos[0].toString());
		System.out.println("El último ladrillo destruido fue: " + destruidos[destruidos.length - 1].toString() + "\n\n");
	}
	
	/**
	 * Con este método imprimo el orden en el que los ladrillos fueron destruidos
	 */
	public void mostrarOrdenDestruido() {
		System.out.println("Los ladrillos se destruyeron en este orden: ");
		for (int i = 0; i < destruidos.length; i++) {
			System.out.println((i+1) + ". " + destruidos[i].toString());
		}
	}


	/**
	 * Método constructor
	 */
	
	public Juego() {
		for (int i = 0; i < ladrillos.length; i++) {
			ladrillos[i] = new Ladrillo();
		}
		this.pelota = new Pelota();
	}

	/**
	 * @return the ladrillos
	 */
	public Ladrillo[] getLadrillos() {
		return ladrillos;
	}

	/**
	 * @param ladrillos the ladrillos to set
	 */
	public void setLadrillos(Ladrillo[] ladrillos) {
		this.ladrillos = ladrillos;
	}

	/**
	 * @return the pelota
	 */
	public Pelota getPelota() {
		return pelota;
	}

	/**
	 * @param pelota the pelota to set
	 */
	public void setPelota(Pelota pelota) {
		this.pelota = pelota;
	}

	@Override
	public String toString() {
		return "Juego [ladrillos=" + Arrays.toString(ladrillos) + ", pelota=" + pelota + "]";
	}

	
	

}
