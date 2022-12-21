package capitulo05.bloque02.articulosComestibles;

public class Perecederos extends Articulo {
	
	private String fechaCaducidad;

	/**
	 * Método por defecto
	 */
	public Perecederos() {
		super();
	}
	/***
	 * Método constructor
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param fechaCaducidad
	 */
	public Perecederos(int codigo, String nombre, int precio, String fechaCaducidad) {
		super(codigo,nombre,precio);
		this.fechaCaducidad = fechaCaducidad;
	}
	
	//Getters and Setters
	
	public String getFechaCaducidad() {
		return this.fechaCaducidad;
	}
	
	
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	//Método toString
	
	public String toString() {
		
		 return "Código: " + this.getCodigo() + ". Nombre: " + this.getNombre() + ". Precio: " + this.getPrecio() + ". Fecha de Caducidad: " + this.fechaCaducidad;
		
	}
	
	
}
