package capitulo09.ejemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Utils.UtilsBBDD;

import java.sql.Statement ;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.JobAttributes;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VentanaGestionCursos extends JFrame {

	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfDescripcion;
	private Connection conn = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGestionCursos frame = new VentanaGestionCursos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.java.sql.Statement 
	 */
	public VentanaGestionCursos() {
		try {
			conn = ConnectionManagerV1.getConexion();
		}
		catch(Exception e){
			
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0};
//		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
//		gbl_contentPane.columnWidths = new int[]{0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestión de Cursos");
		lblNewLabel.setFont(new Font("Nimbus Sans", Font.BOLD, 33));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 15, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblId = new JLabel("Id :");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		contentPane.add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.weightx = 1.0;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 0;
		gbc_lblDescripcin.gridy = 2;
		contentPane.add(lblDescripcin, gbc_lblDescripcin);
		
		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.weightx = 1.0;
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 1;
		gbc_jtfDescripcion.gridy = 2;
		contentPane.add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);
		
		cargarPrimerRegistro();
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCargarPrimerRegistro = new JButton("<<");
		btnCargarPrimerRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarPrimerRegistro();
			}
		});
		panel.add(btnCargarPrimerRegistro);
		
		
		
		JButton btnCargarAnteriorRegistro = new JButton("<");
		btnCargarAnteriorRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarAnteriorRegistro();
			}
		});
		panel.add(btnCargarAnteriorRegistro);
		
		JButton btnCargarSiguienteRegistro = new JButton(">");
		btnCargarSiguienteRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarPosteriorRegistro();
			}
		});
		panel.add(btnCargarSiguienteRegistro);
		
		JButton btnCargarUltimoRegistro = new JButton(">>");
		btnCargarUltimoRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarUltimoRegitro();
			}
		});
		panel.add(btnCargarUltimoRegistro);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarRegistro();
			}
		});
		panel.add(btnGuardar);
		
		JButton btnNuevoRegistro = new JButton("Nuevo Registro");
		btnNuevoRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfId.setText("");
				jtfDescripcion.setText("");
			}
		});
		panel.add(btnNuevoRegistro);
		
		JButton btnBorrarregistro = new JButton("Borrar");
		btnBorrarregistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int op = JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar el registro?");
				if(op == JOptionPane.YES_OPTION) {
					borrarRegistro();
				}
			}
		});
		panel.add(btnBorrarregistro);
		
	}
	
	private void borrarRegistro() {
	
		try {
			Statement st = conn.createStatement();
			st.executeUpdate("delete from curso where id = " + jtfId.getText());
			JOptionPane.showMessageDialog(null,"Se borró correctamente");
			
			cargarAnteriorRegistro();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void guardarRegistro() {
		
		try {
			Statement st = conn.createStatement();
			if(jtfId.getText().isBlank() || jtfId.getText().isEmpty()) {
				int idValido = UtilsBBDD.getNextValidID(conn, "curso");
				st.executeUpdate("insert into curso values ( "+ idValido +",'" + jtfDescripcion.getText() +"')");
				jtfId.setText(Integer.toString(idValido));
			}
			else {
				int row = st.executeUpdate("update curso set descripcion = '" + jtfDescripcion.getText() + "' where id = " + jtfId.getText());
				
			}
			JOptionPane.showMessageDialog(null,"Se guardó correctamente");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void cargarUltimoRegitro() {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from curso order by id desc limit 1");
			
			if(rs.next()) {
			
				this.jtfId.setText(Integer.toString(rs.getInt(1)));
				this.jtfDescripcion.setText(rs.getString(2));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 */
	private void cargarPrimerRegistro() {
	
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from curso order by id limit 1");
			
			if(rs.next()) {

				this.jtfId.setText(Integer.toString(rs.getInt(1)));
				this.jtfDescripcion.setText(rs.getString(2));
			}

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	private void cargarAnteriorRegistro() {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from curso where id < " + jtfId.getText() + " order by id desc limit 1");
			
			if(rs.next()) {
		
				this.jtfId.setText(Integer.toString(rs.getInt(1)));
				this.jtfDescripcion.setText(rs.getString(2));
			}

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void cargarPosteriorRegistro() {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from curso where id > "+  jtfId.getText()  +" order by id limit 1");
			
			if(rs.next()) {

				this.jtfId.setText(Integer.toString(rs.getInt(1)));
				this.jtfDescripcion.setText(rs.getString(2));
			}

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
