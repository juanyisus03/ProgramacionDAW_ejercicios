package examenes.examen_20221213;

public class Pelota {
	
	private int x;
	private int y;
	
	
	/**
	 * Método constructor por defecto
	 */
	public Pelota() {
		
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



	@Override
	public String toString() {
		return "Pelota [x: " + x + ", y: " + y + "]";
	}
	
	
	
}
