package avaliaçao;


import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ExemploTela extends JFrame{
	
	MaskFormatter formatTel = null;
	
	JLabel lblTelefone = new JLabel("Telefone:");
	JFormattedTextField txtTelefone = null;
	JComboBox cboEstado = new JComboBox();
	JRadioButton[] rdnSexo = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();

	
	public ExemploTela(){
		super("Aula");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		
		cboEstado.addItem("SP");
		cboEstado.addItem("RJ");
		cboEstado.setBounds(20, 20, 200, 20);
		paine.add(cboEstado);
		
		rdnSexo[0] = new JRadioButton("Masculino");
		rdnSexo[1] = new JRadioButton("Feminino");
		
		grupo.add(rdnSexo[0]);
		grupo.add(rdnSexo[1]);
		
		rdnSexo[0].setBounds(20, 60, 100, 20);
		paine.add(rdnSexo[0]);
		
		rdnSexo[1].setBounds(120, 60, 100, 20);
		paine.add(rdnSexo[1]);
		
		lblTelefone.setBounds(20, 90, 80, 20);
		paine.add(lblTelefone);
		
		try {  
			formatTel = new MaskFormatter("(##)#####-####");
			txtTelefone = new JFormattedTextField(formatTel);
		} catch (Exception ex) {  
            ex.printStackTrace();  
		}  
		
		txtTelefone.setBounds(90, 90, 150, 20);
		paine.add(txtTelefone);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 300);
	}
	public static void main(String args[]){
		ExemploTela tela = new ExemploTela();
	}
}