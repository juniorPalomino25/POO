package Ventana01;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame  {
	private static final long serialVersionUID = 1L;
	private Calculadora calculadora;
	
	public  MainFrame () {
		
		super("Calculadora");
		
		setLayout(new BorderLayout());
		
		calculadora = new Calculadora();
	
		
		
		add(calculadora, BorderLayout.CENTER);
		
		setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	}
