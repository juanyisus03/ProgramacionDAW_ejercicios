package capitulo05.bloque02.ventanaConCanvas;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		int x[] = new int[] {50,100,105};
		int y[] = new int[] {50,100,200};
		Rectangulo rect = new Rectangulo(20, 20, 40, 80);
		Triangulo tri = new Triangulo(x,y,3);
		ventana.setBounds(0, 0, 800, 600);
		ventana.getContentPane().setLayout(new BorderLayout());
		MiCanvas canvas = new MiCanvas(rect,tri);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		ventana.setVisible(true);

	}

}
