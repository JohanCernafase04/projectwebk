package Ejercicios;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practica_02 extends JFrame {

	private JPanel contentPane;
	private JButton Guardar;
	private JButton Nuevo;
	private JButton Cerrar;
	/**
	 * @wbp.nonvisual location=-88,149
	 */
	private final JTextField textField = new JTextField();
	private JTextField txtNombre;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextPane txtpnNombre;
	private JTextPane txtpnApellidos;
	private JTextPane txtpnEdad;
	private JTextPane txtpnPeso;
	/**
	 * @wbp.nonvisual location=185,9
	 */
	private final JToolBar toolBar = new JToolBar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica_02 frame = new Practica_02();
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
	public Practica_02() {
		setFont(new Font("Bernard MT Condensed", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Registro de personas");
		textField.setColumns(10);
		setBounds(100, 100, 450, 192);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Guardar = new JButton("Guardar");
		Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Guardar.setBackground(new Color(255, 255, 51));
		Guardar.setForeground(Color.BLACK);
		Guardar.setBounds(324, 22, 89, 23);
		contentPane.add(Guardar);
		
		Nuevo = new JButton("Nuevo");
		Nuevo.setBackground(new Color(0, 255, 0));
		Nuevo.setBounds(324, 56, 89, 23);
		contentPane.add(Nuevo);
		
		Cerrar = new JButton("Cerrar");
		Cerrar.setBackground(new Color(0, 255, 255));
		Cerrar.setBounds(324, 90, 89, 23);
		contentPane.add(Cerrar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(77, 23, 198, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 57, 198, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(77, 90, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(77, 121, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		txtpnNombre = new JTextPane();
		txtpnNombre.setForeground(new Color(255, 0, 0));
		txtpnNombre.setBackground(new Color(204, 204, 153));
		txtpnNombre.setText("Nombres");
		txtpnNombre.setBounds(10, 22, 60, 20);
		contentPane.add(txtpnNombre);
		
		txtpnApellidos = new JTextPane();
		txtpnApellidos.setBackground(new Color(204, 204, 153));
		txtpnApellidos.setForeground(new Color(255, 0, 0));
		txtpnApellidos.setText("Apellidos");
		txtpnApellidos.setBounds(10, 56, 60, 20);
		contentPane.add(txtpnApellidos);
		
		txtpnEdad = new JTextPane();
		txtpnEdad.setBackground(new Color(204, 204, 153));
		txtpnEdad.setForeground(new Color(255, 0, 0));
		txtpnEdad.setText("Edad");
		txtpnEdad.setBounds(10, 90, 46, 20);
		contentPane.add(txtpnEdad);
		
		txtpnPeso = new JTextPane();
		txtpnPeso.setBackground(new Color(204, 204, 153));
		txtpnPeso.setForeground(new Color(255, 0, 0));
		txtpnPeso.setText("Peso");
		txtpnPeso.setBounds(10, 121, 60, 20);
		contentPane.add(txtpnPeso);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, Guardar, Nuevo, Cerrar, txtNombre, textField_2, textField_3, textField_4, txtpnNombre, txtpnApellidos, txtpnEdad, txtpnPeso, textField}));
	}
}
