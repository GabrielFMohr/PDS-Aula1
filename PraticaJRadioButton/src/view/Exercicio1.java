package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalculoRetangulo;

import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textBase;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setTitle("Retangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 57, 122, 24);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		textBase = new JTextField();
		panel.add(textBase);
		textBase.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(22, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAltura.setBounds(197, 32, 46, 14);
		contentPane.add(lblAltura);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(197, 57, 122, 24);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textAltura = new JTextField();
		panel_1.add(textAltura);
		textAltura.setColumns(10);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setBounds(22, 126, 109, 23);
		contentPane.add(rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnPerimetro);
		rdbtnPerimetro.setBounds(161, 126, 109, 23);
		contentPane.add(rdbtnPerimetro);
		
		JLabel lblResult = new JLabel("");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResult.setBounds(32, 160, 67, 14);
		contentPane.add(lblResult);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBase.setText(null);
				textAltura.setText(null);
				rdbtnArea.setSelected(false);
				rdbtnPerimetro.setSelected(false);
				lblResult.setText(null);
			}
		});
		btnLimpar.setBounds(10, 185, 89, 23);
		contentPane.add(btnLimpar);
		
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float base=Float.valueOf(textBase.getText());
				float altura=Float.valueOf(textAltura.getText());
				CalculoRetangulo c= new CalculoRetangulo();
				if(rdbtnArea.isSelected())
				{
					float area=c.CalcularArea(base, altura);
					lblResult.setText(String.valueOf(area));
				}
				else if(rdbtnPerimetro.isSelected())
				{
					float perimetro=c.CalcularPerimetro(base, altura);
					lblResult.setText(String.valueOf(perimetro));
				}
			}
		});
		btnCalcular.setBounds(146, 185, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(281, 185, 89, 23);
		contentPane.add(btnFechar);
		

	}
}
