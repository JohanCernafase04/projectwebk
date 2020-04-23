package Ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Practica_02 extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
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
		
		btn1 = new JButton("Guardar");
		btn1.setBackground(new Color(255, 255, 51));
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(324, 22, 89, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("Nuevo");
		btn2.setBackground(new Color(0, 255, 0));
		btn2.setBounds(324, 56, 89, 23);
		contentPane.add(btn2);
		
		btn3 = new JButton("Cerrar");
		btn3.setBackground(new Color(0, 255, 255));
		btn3.setBounds(324, 90, 89, 23);
		contentPane.add(btn3);
		
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
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, btn1, btn2, btn3, txtNombre, textField_2, textField_3, textField_4, txtpnNombre, txtpnApellidos, txtpnEdad, txtpnPeso, textField}));
	}
}
