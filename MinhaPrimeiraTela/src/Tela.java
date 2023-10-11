import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Tela extends JFrame {

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
					Tela frame = new Tela();
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
	public Tela() {
		setBackground(new Color(128, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		btnFechar.setBounds(210, 208, 89, 23);
		contentPane.add(btnFechar);
		
		textFarenheit = new JTextField();
		textFarenheit.setBackground(new Color(0, 255, 64));
		textFarenheit.setForeground(new Color(255, 255, 255));
		textFarenheit.setBounds(210, 105, 86, 20);
		contentPane.add(textFarenheit);
		textFarenheit.setColumns(10);
		
		JLabel lblColocaFarenheit = new JLabel("Coloca Farenheit:");
		lblColocaFarenheit.setBounds(117, 108, 89, 14);
		contentPane.add(lblColocaFarenheit);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome= textFarenheit.getText();
				JOptionPane.showMessageDialog(null, "O nome inserido é: "+nome);
			}
		});
		btnConverter.setBounds(333, 208, 89, 23);
		contentPane.add(btnConverter);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFarenheit.setText("");
				JOptionPane.showMessageDialog(null,"Burro pra krl");
			}
		});
		btnLimpar.setBounds(81, 208, 89, 23);
		contentPane.add(btnLimpar);
	}
}
