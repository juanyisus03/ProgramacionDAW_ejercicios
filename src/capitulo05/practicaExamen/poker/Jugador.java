package capitulo05.practicaExamen.poker;

import java.util.Arrays;

public class Jugador {
	private String nombre;
	private Carta cartas[] = new Carta[5];
	private String mano;
	
	
	/**
	 * Método constructor por defecto
	 */
	
	public Jugador() {
		super();
	}
	
	
	/**
	 * Método constructor
	 * @param nombre
	 * 
	 */
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	//Hallar mano
	public void hallarMano() {
		int valor;
		int cont1 = 1;
		int cont2;
		for (int i = 0; i < cartas.length; i++) {
			valor = this.cartas[i].getValor();
			cont2 = 1;
			for (int j = 0; j < cartas.length; j++) {
				if(valor == this.cartas[j].getValor() && i != j) {
					cont2++;
				}
				
			}
			
			if(cont2 > cont1) {
				cont1 = cont2;
			}
			
		}
		if(cont1 == 1) this.mano = "ninguna";
		else if(cont1 == 2) this.mano = "pareja";
		else if(cont1 == 3) this.mano = "trio";
		else if(cont1 == 4) this.mano = "poker";
		
	}

	//Getters And Setters
	
	public String getNombre() {
		return nombre;
	}
	public String getMano() {
		return mano;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Carta[] getCartas() {
		return cartas;
	}
	public void setCartas(Carta[] cartas) {
		for (int i = 0; i < this.cartas.length; i++) {
			this.cartas[i] = cartas[i];
		}
		hallarMano();
	}


	//Método to String
	
	public String toString() {
		return "Jugador: " + nombre + " cartas: " + Arrays.toString(cartas);
	}
	
	
	
}
