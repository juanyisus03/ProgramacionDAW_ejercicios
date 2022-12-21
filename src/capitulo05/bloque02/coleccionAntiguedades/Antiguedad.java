package capitulo05.bloque02.coleccionAntiguedades;

public class Antiguedad {
	private String origen;
	private int anyo;
	private int precio;
	
	/**
	 * Método constructor por defecto
	 */
	public Antiguedad() {
		
	}
	
	/**
	 * Método constructor
	 * @param origen
	 * @param anyo
	 * @param precio
	 */
	
	public Antiguedad(String origen,int anyo, int precio ) {
		this.origen = origen;
		this.anyo = anyo;
		this.precio = precio;
	}
	
	//Getters and Setters
	
	public String getOrigen() {
		return this.origen;
	}
	
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public int getAnyo() {
		return this.anyo;
	}
	
	
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
