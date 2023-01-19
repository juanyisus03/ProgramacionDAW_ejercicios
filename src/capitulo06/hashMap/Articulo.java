package capitulo06.hashMap;

public class Articulo {

	private String codigo;
	private int estante;
	private int cantidad;
	
	/**
	 * Método constructor por defecto
	 */
	public Articulo() {
		
	}
	
	/**
	 * Método constructor
	 * @param codigo
	 * @param estante
	 * @param cantidad
	 */
	public Articulo(String codigo, int estante, int cantidad) {
		this.codigo = codigo;
		this.estante = estante;
		this.cantidad = cantidad;
	}
	
	/**
	 * Metodo toString
	 * @return 
	 */
	
	public String toString() {
		return "Articulo " + this.codigo + ": hay " + this.cantidad + " en el estante " + this.estante ;
	}
	
	
	/**
	 * Getters & Setters
	 * @return
	 */
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
