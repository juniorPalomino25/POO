package Ventana01;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Calculadora extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnPunto;
	private JButton btnResta;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnSuma;
	private JButton btnIgual;
	
	private int oper1 = 0;
	private int oper2 = 0;
	
	private String operador;
	
	// Bad Implementation: the Toolbar and the TextPanel are not
	// fully separated
	private JTextArea textArea;
	
	public Calculadora() {
		
		setLayout(new GridLayout(5,4,20,20));
		
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		btnSuma = new JButton("-");
		btnResta = new JButton("+");
		btnMult = new JButton("*");
		btnDiv = new JButton("/");
		btnPunto = new JButton(".");
		btnIgual = new JButton("=");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMult.addActionListener(this);
		btnDiv.addActionListener(this);
		btnPunto.addActionListener(this);
		btnIgual.addActionListener(this);
		
		
		textArea = new JTextArea();
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn0);
		add(btnResta);
		add(btnIgual);
		add(btnSuma);
		add(btnMult);
		add(btnDiv);
		add(btnPunto);
		
		add(textArea);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnClicked = (JButton)e.getSource();
		
		if (btnClicked == btn1) {
			textArea.append("1");
		} if (btnClicked == btn2) {
			textArea.append("2");
		}if (btnClicked == btn3) {
			textArea.append("3");
		}if (btnClicked == btn4) {
			textArea.append("4");
		} if (btnClicked == btn5) {
			textArea.append("5");
		}if (btnClicked == btn6) {
			textArea.append("6");
		}if (btnClicked == btn7) {
			textArea.append("7");
		} if (btnClicked == btn8) {
			textArea.append("8");
		}if (btnClicked == btn9) {
			textArea.append("9");
		}if (btnClicked == btn0) {
			textArea.append("0");
		}
		if(btnClicked == btnSuma) {
			String opers1 = textArea.getText();
			oper1 = Integer.parseInt(opers1);
			operador = "Suma";
			textArea.setText("");
			
		}if(btnClicked == btnResta) {
			String opers1 = textArea.getText();
			oper1 = Integer.parseInt(opers1);
			operador = "Resta";
			textArea.setText("");
			
		}if(btnClicked == btnMult) {
			String opers1 = textArea.getText();
			oper1 = Integer.parseInt(opers1);
			operador = "Multiplicacion";
			textArea.setText("");
			
		}if(btnClicked == btnDiv) {
			String opers1 = textArea.getText();
			oper1 = Integer.parseInt(opers1);
			operador = "Division";
			textArea.setText("");
			
		} if(btnClicked == btnPunto) {
			String opers1 = textArea.getText();
			oper1 = Integer.parseInt(opers1);
			operador = ".";
			textArea.setText("");
			
			
		} if(btnClicked == btnIgual) {
			String opers2 = textArea.getText();
			
			oper2 = Integer.parseInt(opers2);
						
			switch (operador) {
				case "suma" : 
					textArea.setText(""+("oper1 + oper2"));
					break;
				case "resta" : 
					textArea.setText(""+("oper1 - oper2"));
					break;
				case "multiplicacion" : 
					textArea.setText(""+("oper1 * oper2"));
					break;
				case "division" : 
					textArea.setText(""+("oper1 / oper2"));
					break;
			}
			

			
			
		}
		
		
		
	}

}
