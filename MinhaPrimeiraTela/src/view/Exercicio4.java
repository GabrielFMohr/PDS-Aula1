package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.PrecoMarmita;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textPreco;

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
		setBounds(100, 100, 450, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPeso = new JTextField();
		textPeso.setBounds(181, 57, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textPreco = new JTextField();
		textPreco.setBounds(181, 101, 86, 20);
		contentPane.add(textPreco);
		textPreco.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float peso= Float.valueOf(textPeso.getText());
				float preco= Float.valueOf(textPreco.getText());
				PrecoMarmita c= new PrecoMarmita();
				float precoFinal= c.Calculo(preco, peso);
				JOptionPane.showMessageDialog(null,"O preço final é: R$"+precoFinal);
				
			}
		});
		btnCalcular.setBounds(178, 149, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblPeso = new JLabel("Insira o peso do prato montado:");
		lblPeso.setBounds(10, 60, 158, 14);
		contentPane.add(lblPeso);
		
		JLabel lblValor = new JLabel("Insira o valor do kilo:");
		lblValor.setBounds(62, 104, 100, 14);
		contentPane.add(lblValor);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPreco.setText(null);
				textPeso.setText(null);
			}
		});
		btnLimpar.setBounds(130, 183, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(229, 183, 89, 23);
		contentPane.add(btnFechar);
	}
}
