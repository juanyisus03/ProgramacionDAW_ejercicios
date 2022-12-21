package capitulo05.practicaExamen.poker;

import java.util.Arrays;

public class Poker {
	
	private Jugador jugadores[] = new Jugador[5];

	/**
	 * Método constructor por defecto
	 */
	public Poker() {
		super();
		for (int i = 0; i < jugadores.length; i++) {
			Jugador j = new Jugador();
			j.setNombre("Jugador" + (1+i));
			this.jugadores[i] = j;
		}
	}
	
	/**
	 * Método constructor
	 * @param jugadores
	 */
	public Poker(Jugador[] jugadores) {
		super();
		this.jugadores = jugadores;
	}
	
	//Repartir cartas
	public void repartir(Baraja b) {
		b.barajar();
		for (int i = 0; i < jugadores.length; i++) {
			b.repartir(jugadores[i]);
		}
		
	}

	//Getters and Setters
	public Jugador[] getJugador() {
		return jugadores;
	}


	public void setJugador(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	//Método toString
	public String toString() {
		return "Poker [jugadores=" + Arrays.toString(jugadores) + "]";
	}
	
	
}
