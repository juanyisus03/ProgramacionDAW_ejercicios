package buscaminas;

public class Casilla {
	
	private boolean esRevelado;
	private boolean esBomba;
	private int numBombas;
	private String str;
	private boolean sinBombasCerca;
	private boolean protegida;
	
	public Casilla() {
		this.protegida = false;
		this.esRevelado = false;
		this.esBomba =  (Math.round(Math.random()*3) == 3);
		this.str = "-";
	}

	public boolean isProtegida() {
		return protegida;
	}
	
	public void setProtegida(boolean b) {
		this.protegida = b;
		if(this.protegida)this.str = "P";
		else this.str = "-";
	}
	
	public void setRevelado() {
		this.esRevelado = true;
		if(this.esBomba) str = "x";
		else str = numBombas + "";
	}
	
	public boolean isRevelado() {
		return esRevelado;
	}
	
	public void setNumBombas(int numBombas ) {
		this.numBombas = numBombas;
		sinBombasCerca = (numBombas == 0);
	}
	
	public boolean getSinBombasCerca() {
		return sinBombasCerca;
	}
	
	public int getNumBombas() {
		return numBombas;
	}
	
	public boolean esBomba() {
		return this.esBomba;
	}
	
	public String toString() {
		return str;
	}
}
