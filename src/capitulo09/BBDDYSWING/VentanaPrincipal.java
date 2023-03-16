package capitulo09.BBDDYSWING;

import java.awt.Font;
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
		
		//Primera Fila
		//Primer elemento
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.VERTICAL;
		c.weighty = 1;
		c.weightx = 0;
		c.gridwidth = 2;
		c.anchor = GridBagConstraints.CENTER;
		
		
		
		JLabel jlb = new JLabel("Gestion de Estudiante");
		jlb.setFont(new Font("Default", Font.BOLD, 100));
		jpn.add(jlb,c);
		
		//Segunda Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		
		
		
		JLabel jlb2 = new JLabel("Introduce Nombre");
		jpn.add(jlb2,c);
		
		//Segundo componente
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf1 = new JTextField("Example: Pepe");
		
		jpn.add(jtf1,c);
		
		
		//Tercera Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		c.insets = new Insets(10, 10, 10, 10);
		JLabel jlb3 = new JLabel("Introduce 1º Apellido");
		jpn.add(jlb3,c);
		
		//Segundo componente
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf2 = new JTextField("Example: Pérez");
		
		jpn.add(jtf2,c);
		
		//Cuarta Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		JLabel jlb4 = new JLabel("Introduce 2º Apellido");
		jpn.add(jlb4,c);
		
		//Segundo elemento
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf3 = new JTextField("Example: Pérez");
		
		jpn.add(jtf3,c);
		
		
		//Quinta Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		c.insets = new Insets(10, 10, 10, 10);
		JLabel jlb5 = new JLabel("Introduce DNI");
		jpn.add(jlb5,c);
		
		//Segundo elemento
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 4;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf4 = new JTextField("Example: 11111111A");
		
		jpn.add(jtf4,c);
		
		
		
		//Sexta Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		JLabel jlb6 = new JLabel("Introduce direccion");
		jpn.add(jlb6,c);
		
		//Segundo elemento
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf5 = new JTextField("Example: Calle Málaga 298");
		
		jpn.add(jtf5,c);
		
		//Séptima Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 6;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		c.insets = new Insets(10, 10, 10, 10);
		JLabel jlb7 = new JLabel("Introduce correo electrónico");
		jpn.add(jlb7,c);
		
		//Segundo elemento
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf6 = new JTextField("Example: example@example.com ");
		
		jpn.add(jtf6,c);
		
		//Octava Fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 7;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;
		JLabel jlb8 = new JLabel("Introduce teléfono");
		jpn.add(jlb8,c);
		
		//Segundo elemento
		c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 7;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 0.8;
		
		JTextField jtf7 = new JTextField("Example: 666666666 ");
		
		jpn.add(jtf7,c);
		
		
		//Novena fila
		//Primer elemento
		c = new GridBagConstraints();
		
		c.gridx= 0;
		c.gridy = 8;
		c.weighty = 0;
		c.weightx = 1;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.CENTER;
		
		JButton jbt = new JButton("Insertar");
		
		jpn.add(jbt, c);
		
		c = new GridBagConstraints();
		
		c.gridx= 1;
		c.gridy = 8;
		c.gridwidth= 3;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		JButton jbt1 = new JButton("Actualizar");
		
		jpn.add(jbt1, c);
		

		
		c = new GridBagConstraints();
		
		c.gridx= 3;
		c.gridy = 8;
		c.gridwidth= 3;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		JButton jbt3 = new JButton("Borrar");
		
		jpn.add(jbt3, c);
		
		
		
		c = new GridBagConstraints();
		
		c.gridx= 0;
		c.gridy = 9;
		c.gridwidth= 3;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		JPanel fondo = new JPanel();
		fondo.setBackground(null);
		jpn.add(fondo, c);
		
		return jpn;
	}
}
