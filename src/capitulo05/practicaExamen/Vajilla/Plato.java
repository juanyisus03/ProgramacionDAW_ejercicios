package capitulo05.practicaExamen.Vajilla;

public class Plato {

	private int suciedad;
	private int dureza;
	private int suciedadReal;
	private int id;
	private boolean roto;
	private int posibilidadRomperse;
	private int pasada;
	
	
	public Plato(int id) {
		this.suciedad = (int) Math.round(Math.random()*90+10);;
		this.dureza = (int) Math.round(Math.random()*2+1);;
		this.suciedadReal = this.suciedad * this.dureza;
		this.id = id;
		this.roto = false;
		this.pasada = 0;
		this.posibilidadRomperse = 50;
	}
	
	public void limpiar() {
		int fuerzaLimpiadora = (int) Math.round(Math.random()*20+20);
		if((int) Math.round(Math.random()*100) >= this.posibilidadRomperse) {
			this.roto = true;
			System.out.println("Se rompio el plato :( ");
			return;
		}
		
		this.suciedadReal -= fuerzaLimpiadora;
		this.pasada++;
		System.out.println("Limpiando el plato");
		
		
	}


	/**
	 * @return the suciedad
	 */
	public int getSuciedad() {
		return suciedad;
	}


	/**
	 * @param suciedad the suciedad to set
	 */
	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}


	/**
	 * @return the dureza
	 */
	public int getDureza() {
		return dureza;
	}


	/**
	 * @param dureza the dureza to set
	 */
	public void setDureza(int dureza) {
		this.dureza = dureza;
	}


	/**
	 * @return the suciedadReal
	 */
	public int getSuciedadReal() {
		return suciedadReal;
	}


	/**
	 * @param suciedadReal the suciedadReal to set
	 */
	public void setSuciedadReal(int suciedadReal) {
		this.suciedadReal = suciedadReal;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the roto
	 */
	public boolean isRoto() {
		return roto;
	}


	/**
	 * @param roto the roto to set
	 */
	public void setRoto(boolean roto) {
		this.roto = roto;
	}


	@Override
	public String toString() {
		return "Plato [suciedad=" + suciedad + ", dureza=" + dureza + ", suciedadReal=" + suciedadReal + ", id=" + id
				+ ", roto=" + roto + "]";
	}
	
	
	
	
	

}
