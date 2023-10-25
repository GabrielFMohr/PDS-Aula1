package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class CalculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textMensal;
	private JTextField textMeses;
	private JTextField textJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setTitle("CalcInvestGrid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 202);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Ajuda");
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSobre f=new FormSobre();
				f.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Depósito Mensal R$:");
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textMensal = new JTextField();
		panel_2.add(textMensal);
		textMensal.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Num. meses:");
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		textMeses = new JTextField();
		panel_3.add(textMeses);
		textMeses.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Juros ao mês %:");
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		textJuros = new JTextField();
		panel_4.add(textJuros);
		textJuros.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total investido mais juros R$:");
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double depositoMensal= Double.valueOf(textMensal.getText());
				int numMeses= Integer.valueOf(textMeses.getText());
				double Juros= Double.valueOf(textJuros.getText());
				Investimento c= new Investimento(numMeses,Juros,depositoMensal);
				float CT= (float) c.calculaTotal();
				String VT=String.format("%.2f",CT);
				JOptionPane.showMessageDialog(null, "O valor total até agora é de:R$ " +VT);
			}
		});
		contentPane.add(btnNewButton);
	}

}
