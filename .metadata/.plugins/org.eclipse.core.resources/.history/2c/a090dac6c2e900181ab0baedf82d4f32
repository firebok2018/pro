package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class JFSsytemRepair extends JFrame implements ActionListener {

	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnConfiguracn;
	private JMenuItem mntmConfiguracinDeMonedas;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnActualizacin;
	private JMenu mnRegistro;
	private JMenuItem mntmProductos;
	private JMenu mnVenta;
	private JMenuItem mntmProductos_1;
	private JMenu mnConsultas;
	private JMenuItem mntmClientes;
	private JMenuItem mntmNewMenuItem_1;
	private  JDesktopPane conte;
	private JMenuItem mntmCerrarSesion;
	private JMenuItem mntmCliente;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFSsytemRepair frame = new JFSsytemRepair();
					frame.setLocationRelativeTo(frame);
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
	public JFSsytemRepair() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/folder.png")));
		menuBar.add(mnArchivo);
		
		mntmCerrarSesion = new JMenuItem("Cerrar Sesion");
		mntmCerrarSesion.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/logout.png")));
		mnArchivo.add(mntmCerrarSesion);
		
		mnActualizacin = new JMenu("Actualizaci\u00F3n");
		mnActualizacin.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/synchronize.png")));
		menuBar.add(mnActualizacin);
		
		mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(this);
		mnActualizacin.add(mntmProductos);
		
		mnRegistro = new JMenu("Registro");
		mnRegistro.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/list.png")));
		mnRegistro.addActionListener(this);
		menuBar.add(mnRegistro);
		
		mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(this);
		mnRegistro.add(mntmCliente);
		
		mnVenta = new JMenu("Venta");
		mnVenta.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/shop.png")));
		menuBar.add(mnVenta);
		
		mntmProductos_1 = new JMenuItem("Productos");
		mntmProductos_1.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/engineering.png")));
		mntmProductos_1.addActionListener(this);
		mnVenta.add(mntmProductos_1);
		
		mnConfiguracn = new JMenu("Configurac\u00F3n");
		mnConfiguracn.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/settings.png")));
		menuBar.add(mnConfiguracn);
		
		mntmConfiguracinDeMonedas = new JMenuItem("Configuraci\u00F3n de Monedas");
		mntmConfiguracinDeMonedas.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/services.png")));
		mntmConfiguracinDeMonedas.addActionListener(this);
		mnConfiguracn.add(mntmConfiguracinDeMonedas);
		
		mntmNewMenuItem = new JMenuItem("Configuraci\u00F3n de Garantia");
		mntmNewMenuItem.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/services.png")));
		mntmNewMenuItem.addActionListener(this);
		mnConfiguracn.add(mntmNewMenuItem);
		
		mnConsultas = new JMenu("Consultas");
		mnConsultas.setHorizontalAlignment(SwingConstants.LEFT);
		mnConsultas.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/questions.png")));
		menuBar.add(mnConsultas);
		
		mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/manager.png")));
		mntmClientes.addActionListener(this);
		mnConsultas.add(mntmClientes);
		
		mntmNewMenuItem_1 = new JMenuItem("Facturas");
		mntmNewMenuItem_1.setIcon(new ImageIcon(JFSsytemRepair.class.getResource("/imagen/boleta o factura.png")));
		mnConsultas.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conte = new JDesktopPane();
		conte.setEnabled(false);
		conte.setBounds(0, 0, 864, 548);
		contentPane.add(conte);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmCliente) {
			actionPerformedMntmCliente(e);
		}
		if (e.getSource() == mntmClientes) {
			actionPerformedMntmClientes(e);
		}
		if (e.getSource() == mntmProductos_1) {
			actionPerformedMntmProductos_1(e);
		}
		
		if (e.getSource() == mntmProductos) {
			actionPerformedMntmProductos(e);
		}
		
		if (e.getSource() == mntmConfiguracinDeMonedas) {
			actionPerformedMntmConfiguracinDeMonedas(e);
		}
	}
	protected void actionPerformedMntmConfiguracinDeMonedas(ActionEvent e) {
		JIFConfiidMoney cm= new JIFConfiidMoney();
		//conte.add(cm);
		center(cm);
		
		
		
		
	}
	
	protected void actionPerformedMntmProductos(ActionEvent e) {
		
		JIFProductos jdp =new JIFProductos();
		//conte.add(jdp);
		center(jdp);
		
		
		
	}
	
	protected void actionPerformedMntmProductos_1(ActionEvent e) {
		JIFVenta jdv= new JIFVenta();
		//conte.add(jdv);
		center(jdv);
		
	}
	protected void actionPerformedMntmClientes(ActionEvent e) {
		JIFClientes jcliente= new JIFClientes();
		//conte.add(jcliente);
		center(jcliente);
		
	}
	protected void actionPerformedMntmCliente(ActionEvent e) {
		
		JIFRegisCliente jrc= new JIFRegisCliente();
		center(jrc);
		
		
	}
	void center(JInternalFrame f){
		
		Dimension size = conte.getSize();
		Dimension fSize=f.getSize();
		f.setLocation((size.width-fSize.width)/2,(size.height-fSize.height)/2);
		f.show();
		
		boolean countView=true;
		String nombre = f.getTitle();
		
		
		for (int i = 0; i < conte.getComponentCount(); i++) {
			if (f.getClass().isInstance(conte.getComponent(i))) {
				JOptionPane.showMessageDialog(null,"Cierre la Ventana " +nombre +" e Intentente Nuevamente");
				f.toFront();
				conte.moveToFront(f);
				countView=false;
			}
			
			
	
		}
		if (countView && f != null) {
			conte.add(f);
		}
		f.show();
	}
	
	

	
}
