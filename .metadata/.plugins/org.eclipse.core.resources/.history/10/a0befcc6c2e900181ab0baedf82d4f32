package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JIFVenta extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblDni;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNombre;
	private JLabel lblApllidos;
	private JTextField textField_3;
	private JComboBox comboBox;
	private JLabel lblCategoria;
	private JComboBox comboBox_1;
	private JButton btnVender;
	private JButton btnLimpiar;
	private JLabel lblCodigoProducto;
	private JTextField textField_4;
	private JLabel lblCantidad;
	private JTextField textField_5;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFVenta dialog = new JIFVenta();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public JIFVenta() {
		setBorder(null);
		setTitle("Venta | productos");
		setBounds(100, 100, 450, 333);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("N\u00B0 Venta:");
		lblNewLabel.setBounds(26, 22, 62, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(98, 19, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(206, 22, 46, 14);
		getContentPane().add(lblDni);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 19, 126, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 50, 276, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(26, 55, 62, 14);
		getContentPane().add(lblNombre);
		
		lblApllidos = new JLabel("Apllidos:");
		lblApllidos.setBounds(26, 87, 73, 14);
		getContentPane().add(lblApllidos);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 81, 276, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(97, 120, 116, 20);
		getContentPane().add(comboBox);
		
		lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(26, 123, 73, 14);
		getContentPane().add(lblCategoria);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(227, 120, 126, 20);
		getContentPane().add(comboBox_1);
		
		btnVender = new JButton("Vender");
		btnVender.setIcon(new ImageIcon(JIFVenta.class.getResource("/imagen/dinero.png")));
		btnVender.setBounds(26, 226, 115, 33);
		getContentPane().add(btnVender);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(JIFVenta.class.getResource("/imagen/list.png")));
		btnLimpiar.setBounds(153, 226, 127, 33);
		getContentPane().add(btnLimpiar);
		
		lblCodigoProducto = new JLabel("Codigo Producto:");
		lblCodigoProducto.setBounds(26, 156, 108, 14);
		getContentPane().add(lblCodigoProducto);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(126, 153, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(227, 156, 73, 14);
		getContentPane().add(lblCantidad);
		
		textField_5 = new JTextField();
		textField_5.setBounds(301, 153, 73, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setIcon(new ImageIcon(JIFVenta.class.getResource("/imagen/cerrar.png")));
		btnCerrar.setBounds(301, 226, 108, 33);
		getContentPane().add(btnCerrar);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
}
