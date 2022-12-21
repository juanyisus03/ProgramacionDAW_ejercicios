package capitulo05.practicaExamen.batalla;

public class Personaje {
	private int hp;
	private String nombre;
	private boolean vivo;
	private int disparos;
	
	/**
	 * Método constructor por defecto
	 */
	public Personaje() {
		this.hp = (int) Math.round(Math.random()*(100-50)+50);
		this.vivo = true;
	}


	


	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}





	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}





	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}





	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}





	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}





	/**
	 * @return the disparos
	 */
	public int getDisparos() {
		return disparos;
	}





	/**
	 * @param disparos the disparos to set
	 */
	public void setDisparos(int disparos) {
		this.disparos = disparos;
	}





	@Override
	public String toString() {
		return "Personaje [hp=" + hp + ", nombre=" + nombre + ", vivo=" + vivo + ", disparos=" + disparos + "]";
	}
	
	
}
