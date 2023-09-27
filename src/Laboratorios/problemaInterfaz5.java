package Laboratorios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class problemaInterfaz5 extends JFrame {

	private JPanel contentPane;
	private JTextField textPrecio;
	private JTextField textCantidad;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problemaInterfaz5 frame = new problemaInterfaz5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public problemaInterfaz5() {
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setBounds(22, 27, 73, 29);
		contentPane.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(22, 66, 73, 22);
		contentPane.add(lblCantidad);
		
		textPrecio = new JTextField();
		textPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPrecio.setBounds(112, 34, 96, 19);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCantidad.setBounds(112, 70, 96, 19);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		JTextArea textSalida = new JTextArea();
		textSalida.setBounds(22, 117, 384, 136);
		contentPane.add(textSalida);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declaracion de variables
				int can, car;
				double pre, impcom, impdes, imppag;
				
				//Entrada de datos
				pre = Double.parseDouble(textPrecio.getText());
				can = Integer.parseInt(textCantidad.getText());
				
				//Proceso de datos
				impcom = pre * can;
				impdes = 0.11 * impcom;
				imppag = impcom - impdes;
				car = 2*can;
				
				//Salida de datos
				textSalida.setText("Importe de compra    : S/. " + impcom + "\n");
				textSalida.append("Importe de descuento  : S/. " + impdes + "\n");
				textSalida.append("Importe a pagar       : S/. " + imppag + "\n");
				textSalida.append("Cantidad de caramelos : S/. " + car);
				
			}
		});
		btnProcesar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProcesar.setBounds(284, 30, 122, 23);
		contentPane.add(btnProcesar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPrecio.setText("");
				textCantidad.setText("");
				textSalida.setText("");
				textPrecio.requestFocus();
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBorrar.setBounds(284, 67, 122, 21);
		contentPane.add(btnBorrar);
		
		
	}
}
