package buscaminas;

import javax.swing.JButton;

public class MyCasilla extends JButton {
	private Casilla c =  new Casilla();
	
	public MyCasilla() {
		super("-");
	
	}
	
	public Casilla getCasilla() {
		return this.c;
	}
	
	public void setRevelado() {
		c.setRevelado();
		this.setText(c.toString());
		this.setEnabled(false);
	}

	public void setProtegida(boolean b) {
		this.c.setProtegida(b);
		setText(c.toString());
		
	}
}
