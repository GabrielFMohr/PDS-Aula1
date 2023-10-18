package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalculoLitros;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPL;
	private JTextField textPF;
	private JButton btnLimpar;
	private JButton btnCL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPL = new JTextField();
		textPL.setBounds(215, 48, 86, 20);
		contentPane.add(textPL);
		textPL.setColumns(10);
		
		textPF = new JTextField();
		textPF.setBounds(215, 89, 86, 20);
		contentPane.add(textPF);
		textPF.setColumns(10);
		
		JLabel lblPL = new JLabel("Insira o preço do litro:");
		lblPL.setBounds(90, 51, 123, 14);
		contentPane.add(lblPL);
		
		JLabel lblPF = new JLabel("Insira o valor inserido pelo cliente:");
		lblPF.setBounds(20, 92, 219, 14);
		contentPane.add(lblPF);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(75, 174, 89, 23);
		contentPane.add(btnFechar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPF.setText(null);
				textPL.setText(null);
			}
		});
		btnLimpar.setBounds(236, 174, 89, 23);
		contentPane.add(btnLimpar);
		
		btnCL = new JButton("Calcular Litros");
		btnCL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PL= Double.valueOf(textPL.getText());
				double PF= Double.valueOf(textPF.getText());
				CalculoLitros c= new CalculoLitros();
				double LT= c.Calcular(PL, PF);
				JOptionPane.showMessageDialog(null, "O valor inserido corresponde à "+ LT+" litros");
				
			}
		});
		btnCL.setBounds(148, 139, 123, 23);
		contentPane.add(btnCL);
	}
}
