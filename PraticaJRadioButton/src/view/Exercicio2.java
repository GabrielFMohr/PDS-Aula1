package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Matematica;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimeiroNumero;
	private JTextField textSegundoNumero;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 8, 174, 35);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Primeiro Número Inteiro:");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(176, 8, 248, 35);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textPrimeiroNumero = new JTextField();
		panel_1.add(textPrimeiroNumero);
		textPrimeiroNumero.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 66, 174, 35);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Segundo Número Inteiro:");
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(5, 112, 174, 92);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicao);
		panel_2_1.add(rdbtnAdicao);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtracao);
		panel_2_1.add(rdbtnSubtracao);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		panel_2_1.add(rdbtnMultiplicacao);
		
		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisao);
		panel_2_1.add(rdbtnDivisao);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(176, 66, 248, 35);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textSegundoNumero = new JTextField();
		panel_1_1_1.add(textSegundoNumero);
		textSegundoNumero.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(256, 228, 118, 22);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblResultado = new JLabel("");
		panel_3.add(lblResultado);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(162, 228, 90, 22);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float primeiro= Float.valueOf(textPrimeiroNumero.getText());
				float segundo= Float.valueOf(textSegundoNumero.getText());
				Matematica m= new Matematica();
				
				if(rdbtnAdicao.isSelected())
				{
					float resultado= m.Adicao(primeiro, segundo);
					lblResultado.setText("Resultado: "+resultado);
				}
				if(rdbtnSubtracao.isSelected())
				{
					float resultado= m.Subtracao(primeiro, segundo);
					lblResultado.setText("Resultado: "+resultado);
				}
				if(rdbtnMultiplicacao.isSelected())
				{
					float resultado= m.Multiplicacao(primeiro, segundo);
					lblResultado.setText("Resultado: "+resultado);
				}
				if(rdbtnDivisao.isSelected())
				{
					float resultado= m.Divisao(primeiro, segundo);
					lblResultado.setText("Resultado: "+resultado);
				}
			}
		});
		panel_4.add(btnCalcular);
	}

}
