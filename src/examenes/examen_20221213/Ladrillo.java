package examenes.examen_20221213;

public class Ladrillo {
	
	private int x;
	private int y;
	private int ancho;
	private int altura;
	private String color;
	private int puntosVida;
	private static String COLORES[] = new String[] {"azul", "rojo", "verde"}; 
	
	/*
	 * Método constructor 
	 */
	
	public Ladrillo() {
		this.x = (int) Math.round(Math.random()*800);
		this.y = (int) Math.round(Math.random()*500);
		this.ancho = 100;
		this.altura = 50;
		this.puntosVida = (int) Math.round(Math.random()*2+1);
		
		if(this.puntosVida == 1) {
			this.color = COLORES[(int) Math.round(Math.random()*2)];
		}
		else if(this.puntosVida == 2) this.color = "plateado";
		else this.color = "dorado";
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	@Override
	public String toString() {
		return "Ladrillo " + color + " [x: " + x + ", y: " + y + "]";
	}
	
	
	
	
	
	
}
