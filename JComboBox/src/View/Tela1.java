package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;

public class Tela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text500mlPreco;
	private JTextField text1LPreco;
	private JTextField textDieselPreco;
	private JTextField textComumPreco;
	private JTextField textAditivPreco;
	private JTextField textEtanolPreco;
	private JTextField text500mlquanti;
	private JTextField text1LQuanti;
	private JTextField textQuantiLitros;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textDias;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_7.add(panel_1);
		panel_1.setToolTipText("Tabela preço");
		panel_1.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o Do Combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Óleo díesel:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		textDieselPreco = new JTextField();
		panel_3.add(textDieselPreco);
		textDieselPreco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gas. Comum:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		textComumPreco = new JTextField();
		panel_4.add(textComumPreco);
		textComumPreco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gas. Aditivada:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		textAditivPreco = new JTextField();
		panel_5.add(textAditivPreco);
		textAditivPreco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Etanol");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		textEtanolPreco = new JTextField();
		panel_6.add(textEtanolPreco);
		textEtanolPreco.setColumns(10);
		
		JPanel panel = new JPanel();
		panel_7.add(panel);
		panel.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		text500mlPreco = new JTextField();
		text500mlPreco.setText("");
		panel.add(text500mlPreco);
		text500mlPreco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Frasco 1L");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);
		
		text1LPreco = new JTextField();
		panel.add(text1LPreco);
		text1LPreco.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9);
		
		JLabel lblNewLabel_6 = new JLabel("Quantidade");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Valor a Pagar");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Total Óleo");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Frasco de 500ml");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_9);
		
		text500mlquanti = new JTextField();
		panel_8.add(text500mlquanti);
		text500mlquanti.setColumns(10);
		
		JLabel lblValorP500mlOleo = new JLabel("-");
		lblValorP500mlOleo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblValorP500mlOleo);
		
		JLabel lbl500mlTotalOleo = new JLabel("-");
		lbl500mlTotalOleo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lbl500mlTotalOleo);
		
		JLabel lblNewLabel_11 = new JLabel("Frasco de 1L");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_11);
		
		text1LQuanti = new JTextField();
		panel_8.add(text1LQuanti);
		text1LQuanti.setColumns(10);
		
		JLabel lblValor1L = new JLabel("-");
		lblValor1L.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblValor1L);
		
		JLabel lblTotalOleo = new JLabel("-");
		lblTotalOleo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblTotalOleo);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Combustível:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_10);
		
		JComboBox comboBoxCombustivel = new JComboBox();
		panel_11.add(comboBoxCombustivel);
		
		JLabel lblNewLabel_12 = new JLabel("Quantidade Litros");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_12);
		
		textQuantiLitros = new JTextField();
		panel_11.add(textQuantiLitros);
		textQuantiLitros.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Total Combustível:");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("-");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_14);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14);
		panel_14.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("À vista");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_15.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnPrazo);
		panel_15.add(rdbtnPrazo);
		
		JPanel panel_16 = new JPanel();
		panel_14.add(panel_16);
		panel_16.setLayout(new BoxLayout(panel_16, BoxLayout.X_AXIS));
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17);
		panel_17.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("129px"),},
			new RowSpec[] {
				RowSpec.decode("43px"),}));
		
		JLabel lblNewLabel_15 = new JLabel("Dias:");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_17.add(lblNewLabel_15, "2, 1");
		lblNewLabel_15.setVerticalAlignment(SwingConstants.BOTTOM);
		
		textDias = new JTextField();
		textDias.setHorizontalAlignment(SwingConstants.LEFT);
		panel_17.add(textDias, "3, 1, center, center");
		textDias.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13);
		
		JLabel lblNewLabel_16 = new JLabel("Total a pagar:");
		panel_13.add(lblNewLabel_16);
		
		textField = new JTextField();
		panel_13.add(textField);
		textField.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		contentPane.add(panel_18);
		panel_18.setLayout(new MigLayout("", "[318px,grow][318px][318px]", "[45px,grow,top]"));
		
		JButton btnNewButton = new JButton("New button");
		panel_18.add(btnNewButton, "cell 0 0,alignx center");
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_18.add(btnNewButton_1, "cell 1 0,alignx center");
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_18.add(btnNewButton_2, "cell 2 0,alignx center");
	}

}
