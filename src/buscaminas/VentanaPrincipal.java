package buscaminas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToolBar;

public class VentanaPrincipal extends JFrame {
	private static boolean terminado = false;
	private static JPanel contentPane;
	private static MyCasilla[][] m;
	private static JPanel panel;
	private static int numCasillas = 5;
	private static int cantMaxBombas = (numCasillas*numCasillas)/3;
	private static int numBombas;
	
	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JToolBar toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 0;
		contentPane.add(toolBar, gbc_toolBar);
		
		JLabel lblNCasillas = new JLabel("Nº Casillas / Fila");
		toolBar.add(lblNCasillas);
		
		JSlider slider = new JSlider();
		toolBar.add(slider);
		slider.setValue(5);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!slider.getValueIsAdjusting() && panel != null) {
					numCasillas = slider.getValue();
					cantMaxBombas = (numCasillas*numCasillas)/3;
					panel.removeAll();
					panel.repaint();
					panel.revalidate();
					buscaminas();
				}
					
				
			}
		});
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setMinorTickSpacing(1);
		slider.setMinimum(5);
		slider.setMaximum(10);
		
		JButton btnNewButton = new JButton("Nuevo Juego");
		toolBar.add(btnNewButton);
		
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel.removeAll();
					panel.repaint();
					panel.revalidate();
					buscaminas();
					
				}
			});
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
//		gbl_panel.columnWidths = new int[]{0};
//		gbl_panel.rowHeights = new int[]{0};
//		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
//		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		buscaminas();
	}
	
	private static void buscaminas() {
		terminado = false;
		inicializarMatriz();
		revelarCasillasSinBombas();
	}	
		

	


	


	private static void revelarCasillasSinBombas() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j].getCasilla().getSinBombasCerca()) m[i][j].setRevelado();				
			}
		}
		
	}

	private static void inicializarMatriz() {
		m = new MyCasilla[numCasillas][numCasillas];
		
		do {
			numBombas = 0;
			panel.removeAll();
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					MyCasilla c = new MyCasilla();
					GridBagConstraints gbc_c = new GridBagConstraints();
					gbc_c.gridx = i+1;
					gbc_c.gridy = j+1;
					gbc_c.fill = gbc_c.HORIZONTAL;
					c.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(c.getCasilla().isProtegida()==false) {
								c.setRevelado();
								if(c.getCasilla().esBomba()) juegoTerminado(0);
								if(esJuegoTerminado()) juegoTerminado(1);
							}
							
							
						}
					});
					c.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if(e.getButton()== e.BUTTON3 && c.getCasilla().isRevelado() == false && c.getCasilla().isProtegida() == false) {
								c.setProtegida(true);
							}
							else if(e.getButton()== e.BUTTON3 && c.getCasilla().isRevelado() == false && c.getCasilla().isProtegida() == true) c.setProtegida(false);
								
							
							
							
						}
					});
					panel.add(c, gbc_c);
					m[i][j] = c;
					if(c.getCasilla().esBomba()) numBombas++;
					
				}
			}
		}while(!(numBombas < cantMaxBombas && numBombas > 5));
		contarX();
	}

	

	protected static boolean esJuegoTerminado() {
		boolean esTerminado = true;
		for (int i = 0; i < m.length && esTerminado; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(!m[i][j].getCasilla().isRevelado() && !m[i][j].getCasilla().esBomba()) esTerminado = false;
			}
		}
		return esTerminado;
	}

	protected static void juegoTerminado(int cas) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j].setRevelado();
			}
		}
		
		if(cas == 0 && terminado == false) {
			JOptionPane.showMessageDialog(null, "Has perdido :-[ ");
			terminado = true;
		}
		
		else if (cas == 1 && terminado == false) {
			JOptionPane.showMessageDialog(null, "Has ganado :-] ");
			terminado = true;
		}
		
		
	}

	private static void contarX() {
		int cont;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(!m[i][j].getCasilla().esBomba()) {
					//Casos Limites
					
					// Primera Fila
					if(i == 0) {
						cont = primeraFila(0,i, j);
					}
					// Última Fila
					
					else if(i == (m.length-1)){
						cont = ultimaFila(0, i, j);
					}
					
					// Los demás casos
					else {
						
						cont = restoDeFilas(0, i, j);
					}
					m[i][j].getCasilla().setNumBombas(cont); 
					cont = 0;
				}
			}
		}
	}

	private static int restoDeFilas(int cont, int i, int j) {
		//Primera columna
		if(j == 0) {
			if(m[i-1][j].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j].getCasilla().esBomba()) {
				cont++;
			}
		}
		//Última columna
		else if(j == m[i].length-1) {
			if(m[i-1][j].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j].getCasilla().esBomba()) {
				cont++;
			}
		}
		
		//Resto de columnas de la última fila
		else {
			if(m[i-1][j].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].getCasilla().esBomba()) {
				cont++;
			}
		}
		return cont;
	}

	private static int ultimaFila(int cont, int i, int j) {
		//Primera columna
		if(j == 0) {
			if(m[i][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j].getCasilla().esBomba()) {
				cont++;
			}
		}
		//Última columna
		else if(j == m[i].length-1) {
			if(m[i][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j].getCasilla().esBomba()) {
				cont++;
			}
		}
		
		//Resto de columnas de la última fila
		else {
			if(m[i][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i-1][j].getCasilla().esBomba()) {
				cont++;
			}
			
			if(m[i-1][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i][j-1].getCasilla().esBomba()) {
				cont++;
			}
		}
		return cont;
	}

	private static int primeraFila(int cont,  int i, int j) {
		//Primera columna
		if(j == 0) {
			if(m[i][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j].getCasilla().esBomba()) {
				cont++;
			}
		}
		//Última columna
		else if(j == m[i].length-1) {
			if(m[i][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j].getCasilla().esBomba()) {
				cont++;
			}
		}
		
		//Resto de columnas de la primera fila
		else {
			if(m[i][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j+1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j].getCasilla().esBomba()) {
				cont++;
			}
			
			if(m[i][j-1].getCasilla().esBomba()) {
				cont++;
			}
			if(m[i+1][j-1].getCasilla().esBomba()) {
				cont++;
			}
		}
		return cont;
	}
}
