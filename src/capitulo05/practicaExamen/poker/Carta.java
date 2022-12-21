package capitulo05.practicaExamen.poker;

public class Carta {
	
	private int valor;
	private String palo;
	private int id;
	
	/**
	 * Método constructor por defecto
	 */
	public Carta() {
	}
	
	
	
	/**
	 * Método constructor
	 * @param valor
	 * @param palo
	 * @param id
	 */
	
	public Carta(int valor, String palo, int id) {
		super();
		this.valor = valor;
		this.palo = palo;
		this.id = id;
	}


	//Getters and Setters
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Carta "+ valor + " " + palo;
	}
	
	

}
