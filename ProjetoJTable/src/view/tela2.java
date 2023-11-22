package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textAltura;
	private JTextField textTelefone;
	private JTextField textIdade;
	private JTextField textPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela2 frame = new tela2();
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
	public tela2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][]", "[][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nome:");
		contentPane.add(lblNewLabel, "cell 1 0,alignx right");
		
		textNome = new JTextField();
		contentPane.add(textNome, "cell 2 0 12 1,growx");
		textNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_1, "cell 1 1,alignx right");
		
		textCPF = new JTextField();
		contentPane.add(textCPF, "cell 2 1 12 1,growx");
		textCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Altura:");
		contentPane.add(lblNewLabel_2, "cell 1 2,alignx right");
		
		textAltura = new JTextField();
		contentPane.add(textAltura, "cell 2 2 12 1,growx");
		textAltura.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		contentPane.add(lblNewLabel_3, "cell 1 3,alignx right");
		
		textTelefone = new JTextField();
		contentPane.add(textTelefone, "cell 2 3 12 1,growx");
		textTelefone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Idade:");
		contentPane.add(lblNewLabel_4, "cell 1 4,alignx right");
		
		textIdade = new JTextField();
		contentPane.add(textIdade, "cell 2 4 12 1,growx");
		textIdade.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Peso:");
		contentPane.add(lblNewLabel_5, "cell 1 5,alignx right");
		
		textPeso = new JTextField();
		contentPane.add(textPeso, "cell 2 5 12 1,growx");
		textPeso.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, "cell 3 9 2 1");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		contentPane.add(btnNewButton_1, "cell 8 9 3 1");
	}

}
