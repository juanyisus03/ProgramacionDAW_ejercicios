package capitulo05.bloque02.coleccionAntiguedades;

public class Sarcofago extends Antiguedad {
	private String faraon;
	
	/**
	 * Método constructor por defecto
	 */
	public Sarcofago() {
		super();
	}
	/**
	 * Método constructor
	 * @param origen
	 * @param anyo
	 * @param precio
	 * @param faraon
	 */
	public Sarcofago(String origen,int anyo, int precio, String faraon ) {
		super(origen, anyo, precio);
		this.faraon = faraon;
	}
	
	//Getters and Setters
	
	public String getFaraon() {
		return this.faraon;
	}
	
	public void setFaraon(String faraon) {
		this.faraon = faraon;
	}
	
	
	public String toString() {
		
		return "Origen: " + this.getOrigen() + " Fecha: " + this.getAnyo() + " Precio: " + this.getPrecio() + " Faraón: " + this.faraon;
	}
	
}
