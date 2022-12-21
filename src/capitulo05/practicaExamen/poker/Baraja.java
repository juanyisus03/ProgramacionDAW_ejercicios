package capitulo05.practicaExamen.poker;

import java.util.Arrays;

public class Baraja {
	private Carta cartas[] = new Carta[52];

	/**
	 * Método constructor por defecto
	 */
	public Baraja() {
		int j = 0;
		//Inicializo las cartas
		//Picas
		for (int i = 1; i < 14; i++, j++) {
			this.cartas[j] = new Carta(i, "Picas", j);
		}
		//Diamantes
		for (int i = 1; i < 14; i++, j++) {
			this.cartas[j] = new Carta(i, "Diamantes", j);
		}
		//Tréboles
		for (int i = 1; i < 14; i++, j++) {
			this.cartas[j] = new Carta(i, "Tréboles", j);
		}
		//Corazones
		for (int i = 1; i < 14; i++, j++) {
			this.cartas[j] = new Carta(i, "Corazones", j);
		}
		
	}
	/**
	 * Método constructor
	 * @param cartas
	 */
	public Baraja(Carta[] cartas) {
		super();
		this.cartas = cartas;
	}
	
	
	//Pasar una carta de abajo a arriba
	public void abajoArriba() {
		Carta cambio = new Carta();
		for(int i = (this.cartas.length - 1); i > 0; i--) {
			
			cambio = cartas[i];
			this.cartas[i] = this.cartas[i-1];
			this.cartas[i-1] = cambio;
			
		}
	
	}
	
	//Pasar una carta de arriba a abajo
	public void arribaAbajo() {
		Carta cambio = new Carta();
		for(int i = 0; i < this.cartas.length-1; i++) {
			
			cambio = this.cartas[i];
			this.cartas[i] = this.cartas[i+1];
			this.cartas[i+1] = cambio;
			
		}
	
	}
	
	/**
	 * Mezclo la baraja
	 */
	public void barajar() {
		int pos1;
		int pos2;
		Carta aux;
		for (int i = 0; i < 10000; i++) {
			pos1 = (int) Math.round(Math.random()*(cartas.length-1));
			pos2 = (int) Math.round(Math.random()*(cartas.length-1));
			aux = cartas[pos1];
			cartas[pos1] = cartas[pos2];
			cartas[pos2] = aux;
		}
		
	}

	
	/**
	 * Ordeno la baraja
	 */
	public void ordenar() {
		Carta cambio;
		boolean permutacion = true;
		
		while(permutacion == true){
			permutacion = false;
			
			for(int i = 0; i < cartas.length-1; i ++){
				
				if(cartas[i].getId() > cartas[i+1].getId()){
					
					permutacion = true;
					cambio = cartas[i];
					cartas[i] = cartas[i+1];
					cartas[i+1] = cambio;	
				}	
			}
		}
	}
	
	/**
	 * Reparto las cartas a los jugadores
	 * @param j
	 */
	public void repartir(Jugador j) {
		j.setCartas(cartas);
		cartas = borrarCartas();	
		
	}
	
	/**
	 *Quito las cartas que le dí al jugador cuando las repartí 
	 * @return
	 */
	private Carta[] borrarCartas() {
		Carta sustituto[] = new Carta[this.cartas.length-5];
		for (int i = 0; i < sustituto.length; i++) {
			sustituto[i] = this.cartas[i+5];
		}
		return sustituto;
	}

	
	//Getters and Setters
	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	//Método to String
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
		
	
	
}
