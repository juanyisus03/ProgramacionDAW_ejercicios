package capitulo05.practicaExamen.batalla;

import java.util.Arrays;

public class CampoBatalla {
	private Malvado m[] = new Malvado[20];
	private Humano h[] = new Humano[20];
	private String nombre;
	private String ganador;
	
	/**
	 * Método constructor por defecto
	 */
	public CampoBatalla() {
		Malvado malo;
		Humano bueno; 
		
		for (int i = 0; i < this.m.length; i++) {
			malo = new Malvado();
			malo.setNombre("malo " + i);
			this.m[i] = malo;
		}
		
		this.m[this.m.length-1].setHp(this.m[this.m.length-1].getHp()*2);
		
		for (int i = 0; i < this.h.length; i++) {
			bueno = new Humano();
			bueno.setNombre("bueno " + i);
			this.h[i] = bueno;
		}
		
		
		this.h[this.h.length-1].setHp(this.h[this.h.length-1].getHp()*2);
		
	}
	
	/**
	 * Con este método mezclo el array de humanos cogiendo dos posiciones al azar e intercambiandolas
	 */
	public void mezclarHumanos() {
	
		int pos1;
		int pos2;
		Humano aux;
		for (int i = 0; i < 10000; i++) {
			pos1 = (int) Math.round(Math.random()*(this.h.length-1));
			pos2 = (int) Math.round(Math.random()*(this.h.length-1));
			aux = this.h[pos1];
			this.h[pos1] = this.h[pos2];
			this.h[pos2] = aux;
		}
	}
	
	/**
	 * Con este método mezclo el array de malvados cogiendo dos posiciones al azar e intercambiandolas
	 */
	public void mezclarMalvados() {
		int pos1;
		int pos2;
		Malvado aux;
		for (int i = 0; i < 10000; i++) {
			pos1 = (int) Math.round(Math.random()*(this.m.length-1));
			pos2 = (int) Math.round(Math.random()*(this.m.length-1));
			aux = this.m[pos1];
			this.m[pos1] = this.m[pos2];
			this.m[pos2] = aux;
		}
	}
	
	/**
	 * Con este método hago que la batalla comience entre los dos bandos
	 */
	public void comenzarBatalla() {
		//Hallo el malo vivo más cercano
		Malvado malo = hallarProximoMalvado();;
		Humano bueno;
		do {
			Malvado primerMalvado = hallarProximoMalvado();
			primerMalvado.setHp(primerMalvado.getHp()- (int) Math.round(Math.random()* (20)+ 5));
			if(primerMalvado.getHp() <= 0) {
				primerMalvado.setVivo(false);
			}
			
			if(hallarProximoMalvado() == null) {
				System.out.println("Han ganado los Humanos");
				break;
			}
			
			Humano primerHumano = hallarProximoHumano();
			primerHumano.setHp(primerHumano.getHp()- (int) Math.round(Math.random()* (20)+ 5));
			if(primerHumano.getHp() <= 0) {
				primerHumano.setVivo(false);
			}
			
			if(hallarProximoHumano() == null) {
				System.out.println("Han ganado los Malvados");
				break;
			}
			
		}while(!(hallarProximoHumano() == null || hallarProximoMalvado() == null));
		
		
	}
	
	/**
	 * Con este método hallo el humano vivo más próximo
	 * @return
	 */
	public Malvado hallarProximoMalvado() {
		for (int i = 0; i < m.length; i++) {
			if(m[i].isVivo()) {
				return m[i];
			}
		}
		return null;
	}
	
	/**
	 * Con este método hallo el humano vivo más próximo
	 * @return
	 */
	public Humano hallarProximoHumano() {
		for (int i = 0; i < h.length; i++) {
			if(h[i].isVivo()) {
				return h[i];
			}
		}
		return null;
	}


	/**
	 * @return the m
	 */
	public Malvado[] getM() {
		return m;
	}

	/**
	 * @param m the m to set
	 */
	public void setM(Malvado[] m) {
		this.m = m;
	}

	/**
	 * @return the h
	 */
	public Humano[] getH() {
		return h;
	}

	/**
	 * @param h the h to set
	 */
	public void setH(Humano[] h) {
		this.h = h;
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
	
	public String getGanador() {
		return this.ganador;
	}

	@Override
	public String toString() {
		return "CampoBatalla [m=" + Arrays.toString(m) + ", h=" + Arrays.toString(h) + ", nombre=" + nombre + "]";
	}


	
	
	
}
