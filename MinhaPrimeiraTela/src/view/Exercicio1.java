package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Convercao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFarenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblColocaFarenheit = new JLabel("Coloca Farenheit:");
		lblColocaFarenheit.setBounds(83, 47, 101, 14);
		contentPane.add(lblColocaFarenheit);
		
		textFarenheit = new JTextField();
		textFarenheit.setForeground(Color.WHITE);
		textFarenheit.setColumns(10);
		textFarenheit.setBackground(new Color(0, 255, 64));
		textFarenheit.setBounds(182, 44, 86, 20);
		contentPane.add(textFarenheit);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFarenheit.setText("");
			}
		});
		btnLimpar.setBounds(62, 94, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(182, 94, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convercao converte= new Convercao();
				String c=textFarenheit.getText();
				Float tempF=Float.valueOf(c);
				Float tempC=converte.ConverterFToC(tempF);
				
				JOptionPane.showMessageDialog(null, "A temperatura inserida em Farenheits é igual à "+tempC+" em Celcius");
			}
		});
		btnConverter.setBounds(307, 94, 89, 23);
		contentPane.add(btnConverter);
	}

}
