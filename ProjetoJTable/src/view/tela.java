package view;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import model.pessoas;
import model.tabelaPessoas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

public class tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	ArrayList<pessoas> lista = new ArrayList<pessoas>();
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
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
	public tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 492, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[170px][140px][107px,center]", "[10px,bottom][20px][10px][10px][20px][10px][23px][10px][10px][146px][30px]"));

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 9 3 1,grow");

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				pessoas pessoaSelecionada = lista.get(linha);
				
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);

		labelNome = new JLabel("Nome:");
		labelNome.setVerticalAlignment(SwingConstants.BOTTOM);
		labelNome.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(labelNome, "cell 0 0,alignx left,aligny top");

		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 0 1,growx,aligny top");
		txtNome.setColumns(10);

		lblNewLabel = new JLabel("CPF:");
		contentPane.add(lblNewLabel, "cell 1 0,alignx left,aligny top");

		txtCPF = new JTextField();
		contentPane.add(txtCPF, "cell 1 1,growx,aligny top");
		txtCPF.setColumns(10);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pessoas p = new pessoas();
				
				String nome = txtNome.getText();
				Integer cpf = Integer.valueOf(txtCPF.getText());
				Integer telefone = Integer.valueOf(txtTelefone.getText());
				Integer idade = Integer.valueOf(txtIdade.getText());
				Float peso = Float.valueOf(txtPeso.getText());
				Float altura = Float.valueOf(txtAltura.getText());

				p.setNome(nome);
				p.setCpf(cpf);
				p.setTelefone(telefone);
				p.setIdade(idade);
				p.setPeso(peso);
				p.setAltura(altura);

				lista.add(p);

				atualizarJTableModel();
				limparCampos();

			}
		});
		contentPane.add(btnNewButton, "cell 0 6,alignx center,aligny top");

		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaparaexc = table.getSelectedRow();

				int cpf = (int) table.getValueAt(linhaparaexc, 1);

				for (pessoas pessoa : lista) {
					if (pessoa.getCpf() == cpf) {
						lista.remove(pessoa);
					}
				}

				atualizarJTableModel();
			}
		});
		contentPane.add(btnNewButton_1, "cell 1 6,alignx center,aligny top");

		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int linhaparaexc = table.getSelectedRow();
				
				int cpf = (int) table.getValueAt(linhaparaexc, 1);
				
				String nome = txtNome.getText();
				Integer cpf1 = Integer.valueOf(txtCPF.getText());
				Integer telefone = Integer.valueOf(txtTelefone.getText());
				Integer idade = Integer.valueOf(txtIdade.getText());
				Float peso = Float.valueOf(txtPeso.getText());
				Float altura = Float.valueOf(txtAltura.getText());
				
				
				for (pessoas pessoa : lista) {
					if (pessoa.getCpf() == cpf) {

						pessoa.setNome(nome);
						pessoa.setCpf(cpf1);
						pessoa.setTelefone(telefone);
						pessoa.setIdade(idade);
						pessoa.setPeso(peso);
						pessoa.setAltura(altura);

						atualizarJTableModel();
						limparCampos();
						
					}
				}

				atualizarJTableModel();
			}
		});
		contentPane.add(btnNewButton_2, "cell 2 6,alignx center,aligny top");

		txtTelefone = new JTextField();
		contentPane.add(txtTelefone, "cell 0 4,growx,aligny top");
		txtTelefone.setColumns(10);

		txtIdade = new JTextField();
		contentPane.add(txtIdade, "cell 1 4,growx,aligny top");
		txtIdade.setColumns(10);

		txtAltura = new JTextField();
		contentPane.add(txtAltura, "cell 2 1,growx,aligny top");
		txtAltura.setColumns(10);

		txtPeso = new JTextField();
		contentPane.add(txtPeso, "cell 2 4,growx,aligny top");
		txtPeso.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		contentPane.add(lblNewLabel_1, "cell 0 3,alignx left,aligny top");

		JLabel lblNewLabel_2 = new JLabel("Idade:");
		contentPane.add(lblNewLabel_2, "cell 1 3,alignx left,aligny top");

		JLabel lblNewLabel_3 = new JLabel("Peso:");
		contentPane.add(lblNewLabel_3, "cell 2 3,alignx left,aligny top");

		JLabel lblNewLabel_4 = new JLabel("Altura:");
		contentPane.add(lblNewLabel_4, "cell 2 0,alignx left,aligny top");
		
		btnNewButton_3 = new JButton("Fechar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_3, "cell 1 10,alignx center");
	}

	public void atualizarJTableModel() {
		table.setModel(new tabelaPessoas(lista));

	}

	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
	}
}
