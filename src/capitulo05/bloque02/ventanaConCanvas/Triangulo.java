package capitulo05.bloque02.ventanaConCanvas;

import java.awt.Color;
import java.awt.Graphics;

public class Triangulo {
	
	private int x[];
	private int y[];
	private int n;
	
	
	public Triangulo() {
		
	}
	
	public Triangulo(int x[], int y[], int n) {
		this.x = x;
		this.y = y;
		this.n = n;
		
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillPolygon(x, y, n);
		
	}

}
