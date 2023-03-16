package capitulo09.ejemplos;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {
		super("Mi primera Ventana sabiendo que hago");
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setContentPane(getJPanelPrincipal());
	}
	
	/**
	 * 
	 * @return
	 */
	private JPanel getJPanelPrincipal(){
		JPanel jpn = new JPanel();
		
		jpn.setLayout(new GridBagLayout());
		
		//Primer elemento
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		c.insets = new Insets(10, 10, 10, 10);
		c.anchor = GridBagConstraints.EAST;
		
		JLabel jlb = new JLabel("Mi primer JLabel sabiendo como crearlo");
		jpn.add(jlb,c);
		
		//Segundo componente
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf = new JTextField("Ya se crear solito un JTextField");
		
		jpn.add(jtf,c);
		
		//Tercer elemento
		c = new GridBagConstraints();
		
		c.gridx = 2;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0;
		
		
		JButton jbt = new JButton("Primer botón sabiendo cositas");
		
		jpn.add(jbt, c);
		
		//Segunda Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		
		JLabel jlb2 = new JLabel("Mi primer JLabel sabiendo como crearlo");
		jpn.add(jlb2,c);
		
		//Segundo componente
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf2 = new JTextField("Ya se crear solito un JTextField");
		
		jpn.add(jtf2,c);
		
		//Tercer elemento
		c = new GridBagConstraints();
		
		c.gridx = 2;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0;
		
		
		JButton jbt2 = new JButton("Primer botón sabiendo cositas");
		
		jpn.add(jbt2, c);
		
		
		//Tercera fila
		c = new GridBagConstraints();
		
		c.gridx= 0;
		c.gridy = 2;
		c.gridwidth= 3;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		JPanel fondo = new JPanel();
		fondo.setBackground(null);
		jpn.add(fondo, c);
		
		return jpn;
	}
}
