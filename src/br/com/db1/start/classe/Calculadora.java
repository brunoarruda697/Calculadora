package br.com.db1.start.classe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

	JTextField tfNumero1, tfNumero2;
	JButton btSoma, btSubtracao, btMultiplicacao, btDivisao, btResetar;

	public double numero1, numero2;

	public Calculadora() {
		setSize(400, 150);
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		tfNumero1 = new JTextField(15);
		tfNumero2 = new JTextField(15);
		btSoma = new JButton("Somar");
		btSubtracao = new JButton("Subtrair");
		btMultiplicacao = new JButton("Multiplicar");
		btDivisao = new JButton("Dividir");
		btResetar = new JButton("C");

		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

		getContentPane().add(tfNumero1);
		getContentPane().add(tfNumero2);
		getContentPane().add(btSoma);
		getContentPane().add(btSubtracao);
		getContentPane().add(btMultiplicacao);
		getContentPane().add(btDivisao);
		getContentPane().add(btResetar);

		btSoma.addActionListener(this);
		btSubtracao.addActionListener(this);
		btMultiplicacao.addActionListener(this);
		btDivisao.addActionListener(this);
		btResetar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			// textfield por default só recebe String, aqui ele vai transformar o
			// texto(string) para as variaveis como Double.
			numero1 = Double.parseDouble(tfNumero1.getText());
			numero2 = Double.parseDouble(tfNumero2.getText());

			if (e.getSource() == btSoma) {
				JOptionPane.showMessageDialog(null, "A soma é : " + (numero1 + numero2));
			}

			if (e.getSource() == btSubtracao) {
				JOptionPane.showMessageDialog(null, "A subtração é : " + (numero1 - numero2));
			}

			if (e.getSource() == btMultiplicacao) {
				JOptionPane.showMessageDialog(null, "A multiplicação é : " + (numero1 * numero2));
			}

			if (e.getSource() == btDivisao) {
				JOptionPane.showMessageDialog(null, "A divisão é : " + (numero1 / numero2));
			}

			// nao sei como resetar as caixas de digitar o numero.
			if (e.getSource() == btResetar) {
				tfNumero1.setText("");
				tfNumero2.setText("");
			}

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Digite valores validos!");
		}

	}

}
