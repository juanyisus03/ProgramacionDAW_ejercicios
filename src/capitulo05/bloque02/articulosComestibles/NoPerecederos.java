package capitulo05.bloque02.articulosComestibles;

public class NoPerecederos extends Articulo {
	private int etiqueta;

	/**
	 * Método por defecto
	 */
	public NoPerecederos() {
		super();
	}
	/***
	 * Método constructor
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param fechaCaducidad
	 */
	public NoPerecederos(int codigo, String nombre, int precio, int etiqueta) {
		super(codigo,nombre,precio);
		this.etiqueta = etiqueta;
	}
	
	//Getters and Setters
	
	public int setEtiqueta() {
		return this.etiqueta;
	}
	
	
	public void setEtiqueta(int etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	//Método toString
	
	public String toString() {
		
		 return "Código: " + this.getCodigo() + ". Nombre: " + this.getNombre() + ". Precio: " + this.getPrecio() + ". Etiqueta: " + this.etiqueta;
		
	}
	
	

}
