package UNMSM;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Login_entrada extends JFrame {

  private JPanel panel02;

  public String usuario;

  private JTextField cuadro1;

  public JTextField cuadro2;

  public JButton jugar;


    public Login_inicio apertura;
    public Juego myJuego;

  public Login_entrada() {
	  super("LOGIN");
      setSize(1000,800);
      setLocationRelativeTo(null);
      añadirComp();
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      panel02.setBackground(Color.white);
  }

  public void añadirComp() {
	  panel();
      title();
      CuadrosIngresos1();
  }

  public void panel() {
	  panel02 = new JPanel();
      panel02.setLayout(null);
      this.getContentPane().add(panel02);  
  }

  public void title() {
	//Titulo del juego
      JLabel titu = new JLabel();
      titu.setText("FISIGAME");
      titu.setFont(new Font("Cooper Black",0,100));
      titu.setForeground(Color.red);      
      titu.setBounds(234,195,532,100);
      
      //Nombre de usuario
      JLabel user = new JLabel();
      user.setText("USUARIO:");
      user.setFont(new Font("Arial",1,20));
      user.setForeground(Color.blue);
      user.setBounds(350,330,96,30);

      panel02.add(titu);
      panel02.add(user);
  }

  public void CuadrosIngresos1() {
	  cuadro1 = new JTextField();
      cuadro1.setBounds(453,332,200,30);
      
      panel02.add(cuadro1);
      botonJugar();   
  }

  public void botonJugar() {
	  jugar = new JButton();
      jugar.setBounds(465,450,100,30);
      jugar.setText("JUGAR");
      panel02.add(jugar); 
      
     MouseListener ac = new MouseListener(){

          @Override
          public void mouseClicked(MouseEvent e) {
              String usuario;
              Juego game=new Juego();
              try{
                  usuario = cuadro1.getText();                 
                 JOptionPane.showMessageDialog(null, usuario);
                 // System.out.println("aa");
              }catch(NullPointerException ex){
                  ex.printStackTrace();
                  JOptionPane.showMessageDialog(null,"Ingrese un usuario gilaso");
                //  System.out.println("bb");
              }
              Login_entrada.this.dispose();
              
          }

          @Override
          public void mousePressed(MouseEvent e) {
          }

          @Override
          public void mouseReleased(MouseEvent e) {
          }

          @Override
          public void mouseEntered(MouseEvent e) {
          }

          @Override
          public void mouseExited(MouseEvent e) {
          }
      };
      jugar.addMouseListener(ac);
  }

  public String getUsuario() {
	  	return usuario;
  }

  public void setUsuario(String Usuario) {
	  this.usuario = usuario;
  }

}