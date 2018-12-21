
package avaliaçao;


import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Teste extends JFrame{
	
	MaskFormatter formatTel = null;
	MaskFormatter formatCel = null;
	MaskFormatter formatRG = null;
	MaskFormatter formatCEP = null;
	MaskFormatter formatCPF = null;

	JLabel lblNome = new JLabel("NOME: ");
	JLabel lblEndereco = new JLabel("ENDEREÇO: ");
	JLabel lblCidade = new JLabel("CIDADE: ");
	JLabel lblBairro = new JLabel("BAIRRO: ");
	JLabel lblTelefone = new JLabel("TELEFONE:");
	JLabel lblRG = new JLabel("RG: ");
	JLabel lblSexo = new JLabel("SEXO: ");
	JLabel lblCEP = new JLabel("CEP: ");
	JLabel lblEstado = new JLabel("ESTADO: ");	
	JLabel lblCelular = new JLabel("CELULAR: ");
	JLabel lblCPF = new JLabel("CPF: ");
	
	
	JTextField txtNome = new JTextField();
	JTextField txtEndereco = new JTextField();
	JTextField txtCidade = new JTextField();
	JTextField txtBairro = new JTextField();	
	JFormattedTextField txtTelefone = null;	
	JTextField txtRG = new JTextField();	
	JRadioButton[] rdnSexo = new JRadioButton[2];	
	JTextField txtCEP = new JTextField();
	JComboBox cboEstado = new JComboBox();
	JFormattedTextField txtCelular = null;	
	JTextField txtCPF = new JTextField();	
	
	ButtonGroup grupo = new ButtonGroup();

	JButton btnSalvar = new JButton("Salvar");
	JButton btnImprimir = new JButton("Imprimir");
	
	
	public Teste(){
		super("Cadastro PF");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblNome.setBounds(20, 20, 200, 20);
		paine.add(lblNome);		
		txtNome.setBounds(90, 20, 200, 25);
		paine.add(txtNome);
		
		lblEndereco.setBounds(20, 50, 200, 20);
		paine.add(lblEndereco);		
		txtEndereco.setBounds(90, 50, 200, 25);
		paine.add(txtEndereco);
		
		lblCidade.setBounds(20, 80, 200, 20);
		paine.add(lblCidade);		
		txtCidade.setBounds(90, 80, 200, 25);
		paine.add(txtCidade);		
		
		lblBairro.setBounds(20, 110, 200, 20);
		paine.add(lblBairro);
		txtBairro.setBounds(90, 110, 200, 25);
		paine.add(txtBairro);
		
		
		try {  
			formatTel = new MaskFormatter("(##)####-####");
			txtTelefone = new JFormattedTextField(formatTel);
		} catch (Exception ex) {  
            ex.printStackTrace();  
		} 
		lblTelefone.setBounds(20, 140, 200, 20);
		paine.add(lblTelefone);
		txtTelefone.setBounds(90, 140, 200, 25);
		paine.add(txtTelefone);
		
		try {  
			formatRG = new MaskFormatter("##.###.###-##");
			txtRG = new JFormattedTextField(formatRG);
		} catch (Exception ex) {  
            ex.printStackTrace();  
		} 
		lblRG.setBounds(20, 170, 200, 20);
		paine.add(lblRG);		
		txtRG.setBounds(90, 170, 200, 25);
		paine.add(txtRG);
		
		
		lblSexo.setBounds(320, 20, 200, 20);
		paine.add(lblSexo);
		
		rdnSexo[0] = new JRadioButton("Masculino");
		rdnSexo[1] = new JRadioButton("Feminino");
		
		grupo.add(rdnSexo[0]);
		grupo.add(rdnSexo[1]);
		
		rdnSexo[0].setBounds(390, 20, 100, 25);
		paine.add(rdnSexo[0]);
		
		rdnSexo[1].setBounds(490, 20, 100, 25);
		paine.add(rdnSexo[1]);
		
		
		
		try {  
			formatCEP = new MaskFormatter("#####-###");
			txtCEP = new JFormattedTextField(formatCEP);
		} catch (Exception ex) {  
            ex.printStackTrace();  
		} 
		lblCEP.setBounds(320, 50, 200, 20);
		paine.add(lblCEP);
		txtCEP.setBounds(400, 50, 150, 25);
		paine.add(txtCEP);
		
		
		lblEstado.setBounds(320, 80, 200, 20);
		paine.add(lblEstado);		
		cboEstado.addItem("AC");
		cboEstado.addItem("AL");
		cboEstado.addItem("AP");
		cboEstado.addItem("AM");
		cboEstado.addItem("BA");
		cboEstado.addItem("CE");
		cboEstado.addItem("DF");
		cboEstado.addItem("ES");
		cboEstado.addItem("GO");
		cboEstado.addItem("MA");
		cboEstado.addItem("MT");
		cboEstado.addItem("MS");
		cboEstado.addItem("MG");
		cboEstado.addItem("PA");
		cboEstado.addItem("PB");
		cboEstado.addItem("PR");
		cboEstado.addItem("PE");
		cboEstado.addItem("PI");
		cboEstado.addItem("RJ");
		cboEstado.addItem("RN");
		cboEstado.addItem("RS");
		cboEstado.addItem("RO");
		cboEstado.addItem("RR");
		cboEstado.addItem("SC");
		cboEstado.addItem("SP");
		cboEstado.addItem("SE");
		cboEstado.addItem("TO");
		cboEstado.setBounds(400, 80, 80, 25);
		paine.add(cboEstado);
		
		
		
		try {  
			formatCel = new MaskFormatter("(##)#####-####");
			txtCelular = new JFormattedTextField(formatCel);
		} catch (Exception ex) {  
            ex.printStackTrace();  
		}
		lblCelular.setBounds(320, 110, 200, 20);
		paine.add(lblCelular);
		txtCelular.setBounds(400, 110, 150, 25);
		paine.add(txtCelular);
		
		
		
		try {  
			formatCPF = new MaskFormatter("###.###.###-##");
			txtCPF = new JFormattedTextField(formatCPF);
		} catch (Exception ex) {  
            ex.printStackTrace();  
		} 
		lblCPF.setBounds(320, 140, 200, 20);
		paine.add(lblCPF);
		txtCPF.setBounds(400, 140, 150, 25);
		paine.add(txtCPF);
		
		
		btnSalvar.setBounds(200, 220, 100, 25);
		paine.add(btnSalvar);
		
		btnImprimir.setBounds(360, 220, 100, 25);
		paine.add(btnImprimir);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(600, 300);
		this.setResizable(false);
	}
	public static void main(String args[]){
		Teste tela = new Teste();
	}
}