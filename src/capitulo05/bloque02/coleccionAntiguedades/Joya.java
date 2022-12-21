package capitulo05.bloque02.coleccionAntiguedades;

public class Joya extends Antiguedad {
	private String material;
	
	/**
	 * Método constructor por defecto
	 */
	public Joya() {
		super();
	}
	/**
	 * Método constructor
	 * @param origen
	 * @param anyo
	 * @param precio
	 * @param material
	 */
	public Joya(String origen,int anyo, int precio, String material ) {
		super(origen, anyo, precio);
		this.material = material;
	}
	
	//Getters and Setters
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	public String toString() {
		
		return "Origen: " + this.getOrigen() + " Fecha: " + this.getAnyo() + " Precio: "+ this.getPrecio() + " Material: " + this.material;
	}
}
