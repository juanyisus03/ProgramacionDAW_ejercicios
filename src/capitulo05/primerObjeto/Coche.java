package capitulo05.primerObjeto;

public class Coche {
	
	private String color;
	private String marca;
	private String matricula;
	private int tam;
	private int pasajeros;
	
	
	
	/**
	 * Método constructor por defecto
	 */
	
	public Coche () {
		
	}
	
	
	/**
	 * Método constructor
	 * @param color
	 * @param marca
	 * @param matricula
	 * @param tam
	 * @param pasajeros
	 */
	
	public Coche (String color, String marca, String matricula, int tam, int pasajeros) {
		this.color = color;
		this.marca = marca;
		this.matricula = matricula;
		this.tam = tam;
		this.pasajeros = pasajeros;
	}
	
	
	public String getColor() {
		return this.color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public int getTam() {
		return this.tam;
	}
	
	
	public void setTam(int tam) {
		this.tam = tam;
	}
	
	public int getPasajeros() {
		return this.pasajeros;
	}
	
	
	public void setColor(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
	public String toString() {
		
		 return "Marca: " + this.marca + "Color: " + this.color + "Matricula: " + this.matricula + "Tamaño: " + this.tam + "Pasajeros: " + this.pasajeros;
		
	}
	
	
}
