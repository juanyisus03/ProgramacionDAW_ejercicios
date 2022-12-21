package capitulo05.bloque01;

public class Persona {
	//Atributos de la clase persona
	
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private int telefono;
	
	
	/**
	 * Método constructor por defecto
	 */
	
	public Persona() {
		
	}
	
	/**
	 * Método constructor
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param telefono
	 */
	
	public Persona(String nombre, String apellido, String dni, String direccion, int telefono) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}
	
	
	
	//Getters and Setters
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public String getDireccion() {
		return this.direccion;
	}
	
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	//Método toString
	public String toString() {
		
		 return "Nombre: " + this.nombre + "Apellido: " + this.apellido + "DNI: " + this.dni + "Direccion: " + this.direccion + "Telefono: " + this.telefono;
		
	}
	
	
	
}
