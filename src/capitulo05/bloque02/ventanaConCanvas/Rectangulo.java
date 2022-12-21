package capitulo05.bloque02.ventanaConCanvas;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(int x, int y, int ancho, int alto) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, ancho, alto);
		
	}
}
