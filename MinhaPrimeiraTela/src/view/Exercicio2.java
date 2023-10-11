package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSobrenome;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(162, 23, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblInserirNome = new JLabel("Insere Nome:");
		lblInserirNome.setBounds(72, 26, 100, 14);
		contentPane.add(lblInserirNome);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textSobrenome.setText("");
			}
		});
		btnLimpar.setBounds(72, 182, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnNomeCompleto = new JButton("Mostrar Nome Completo");
		btnNomeCompleto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome= textNome.getText();
				String sobrenome=textSobrenome.getText();
				JOptionPane.showMessageDialog(null, "Nome completo: "+ (nome+" "+sobrenome));
			}
		});
		btnNomeCompleto.setBounds(247, 182, 177, 23);
		contentPane.add(btnNomeCompleto);
		
		JLabel lblSobrenome = new JLabel("Insere sobrenome:");
		lblSobrenome.setBounds(42, 91, 126, 14);
		contentPane.add(lblSobrenome);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(162, 88, 86, 20);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(162, 227, 89, 23);
		contentPane.add(btnFechar);
	}

}
