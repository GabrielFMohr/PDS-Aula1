package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalcularRetangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblBase = new JLabel("Base:");
	private JTextField textBase;
	private JTextField textAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblBase.setBounds(86, 25, 33, 31);
		contentPane.add(lblBase);
		
		textBase = new JTextField();
		textBase.setBounds(129, 30, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setBounds(129, 79, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(84, 82, 46, 14);
		contentPane.add(lblAltura);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBase.setText("");
				textAltura.setText("");
			}
		});
		btnLimpar.setBounds(41, 148, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(129, 193, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcularRetangulo c= new CalcularRetangulo();
				float base= Float.valueOf(textBase.getText());
				float altura= Float.valueOf(textAltura.getText());
				float perimetro= c.CalcularPerimetro(base, altura);
				float area= c.CalcularArea(base, altura);
				JOptionPane.showMessageDialog(null, "Perimetro:"+perimetro+"\nÁrea:"+area);
			}
		});
		btnCalcular.setBounds(218, 148, 89, 23);
		contentPane.add(btnCalcular);
	}

}
