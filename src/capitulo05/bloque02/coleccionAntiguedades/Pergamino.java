package capitulo05.bloque02.coleccionAntiguedades;

public class Pergamino extends Antiguedad {
	private String tipoPiel;
	private String idioma;
	
	/**
	 * Método constructor por defecto
	 */
	public Pergamino() {
		super();
	}
	/**
	 * Método constructor
	 * @param origen
	 * @param anyo
	 * @param precio
	 * @param tipoPiel
	 * @param idioma
	 */
	public Pergamino(String origen,int anyo, int precio, String tipoPiel, String idioma ) {
		super(origen, anyo, precio);
		this.tipoPiel = tipoPiel;
		this.idioma = idioma;
	}
	
	//Getters and Setters
	
	public String getTipoPiel() {
		return this.tipoPiel;
	}
	
	public void setTipoPiel(String tipoPiel) {
		this.tipoPiel = tipoPiel;
	}
	
	public String getIdioma() {
		return this.idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	//Método toString
	public String toString() {
		
		return "Origen: " + this.getOrigen() + " Fecha: " + this.getAnyo() + " Precio: "+ this.getPrecio() + " Tipo de piel usado: " + this.tipoPiel + " Idioma: " + this.idioma;
	}
}
