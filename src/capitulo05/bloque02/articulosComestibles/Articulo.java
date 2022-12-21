package capitulo05.bloque02.articulosComestibles;

public class Articulo {
	private int codigo;
	private String nombre;
	private int precio;
	
	
	/**
	 * Método por defecto
	 */
	public Articulo() {
	}
	
	/**
	 * Método constructor
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	
	public Articulo(int codigo, String nombre, int precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Getters and Setters

	public int getCodigo() {
		return this.codigo;
	}
	
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
