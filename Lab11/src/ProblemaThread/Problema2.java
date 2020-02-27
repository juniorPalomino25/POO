package ProblemaThread;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;

public class Problema2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema2 frame = new Problema2();
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
	public Problema2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextPane txtpnRelojActual = new JTextPane();
		txtpnRelojActual.setText("Reloj actual");
		txtpnRelojActual.setForeground(Color.BLACK);
		txtpnRelojActual.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnRelojActual.setBackground(Color.WHITE);
		contentPane.add(txtpnRelojActual, BorderLayout.NORTH);
		
		JTextPane txtpnRelojActual_1 = new JTextPane();
		txtpnRelojActual_1.setText("Reloj actual");
		txtpnRelojActual_1.setBounds(10, 11, 73, 20);
		contentPane.add(txtpnRelojActual_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(88, 42, 274, 48);
		contentPane.add(panel);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setText("Nombre");
		txtpnNombre.setBounds(60, 109, 61, 20);
		contentPane.add(txtpnNombre);
		
		JTextPane txtpnApellidos = new JTextPane();
		txtpnApellidos.setText("Apellidos:");
		txtpnApellidos.setBounds(60, 154, 61, 20);
		contentPane.add(txtpnApellidos);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setText("edad:");
		txtpnEdad.setBounds(60, 201, 61, 20);
		contentPane.add(txtpnEdad);
		
		
		
		String[] columnNames = {"ID", "NOMBRE", "APELLIDO","EDAD",};
		Object[][] datos = {
	            {"Juan", 25, false},
	            {"Sonia", 33, true},
	            {"Pedro", 42, false}};


		table = new JTable();
		DefaultTableModel dtm = new DefaultTableModel(datos,columnNames);
		
		table_1 = new JTable();
		table_1.setBackground(new Color(255, 255, 255));
		table_1.setToolTipText("");
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table_1.setBounds(57, 327, 305, 84);
		contentPane.add(table_1);
		
		table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);       
        addWindowListener(new WindowAdapter() {           
            public void windowClosing(WindowEvent e) {
                System.exit(0);               
            }
        });
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(179, 253, 115, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(182, 109, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 154, 180, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 201, 180, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
