package capitulo05.bloque02.coleccionAntiguedades;

public class Libro extends Antiguedad{
	private String titulo;
	private String autor;
	
	/**
	 * Método constructor por defecto
	 */
	public Libro() {
		super();
	}
	/**
	 * Método constructor
	 * @param origen
	 * @param anyo
	 * @param precio
	 * @param titulo
	 * @param autor
	 */
	public Libro(String origen,int anyo, int precio, String titulo, String autor ) {
		super(origen, anyo, precio);
		this.titulo = titulo;
		this.autor = autor;
	}
	
	//Getters and Setters
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//Método toString
	public String toString() {
		
		return "Origen: " + this.getOrigen() + " Fecha: " + this.getAnyo() + " Precio: "+ this.getPrecio() + " Título: " + this.titulo + " Autor: " + this.autor;
	}
}
