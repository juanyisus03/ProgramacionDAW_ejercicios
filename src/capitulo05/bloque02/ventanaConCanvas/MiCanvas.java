package capitulo05.bloque02.ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas {
	
	private Rectangulo r;
	private Triangulo t;
	
	public MiCanvas(Rectangulo r, Triangulo t) {
		this.r = r;
		this.t = t;
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		// Pinto el fondo
		this.setBackground(Color.white);
		r.paint(g);
		t.paint(g);
		
		
		
		
	}

}
