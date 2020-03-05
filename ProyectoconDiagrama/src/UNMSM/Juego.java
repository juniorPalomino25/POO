package UNMSM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Juego {

 JFrame ventana;

JPanel tablero;

   JLabel comida;

 JLabel veneno;

   javax.swing.Timer tiempo;

   Rectangle gus;

   Rectangle comi;

   Rectangle vene;

   JLabel puntuacion;

   int x;

   int y;

   int movimiento=20;
  // gusano

   ArrayList<JLabel> gusano;

   int bandera=0;

   int perdio=0;
  // comida

   int cx=0;

   int cy=0;
  // veneno

   int vx=0;

   int vy=0;
  // puntuacion

   int contador;

   int contador2;

  

  int EstadoSup=1,EstadoInf=1,EstadoIzq=1,EstadoDer=1;
    /**
   * 
   * @element-type Login_entrada
   */
  public Vector  myLogin_entrada;

  public void Juego() {
	// ventana
      ventana = new JFrame("Juego del Gusanito");
      ventana.setSize(800,500);
	ventana.setLocationRelativeTo(null);//se posiciona al centro de la ventan
	ventana.setLayout(null); // permite colocar componentes en cualquier lugar que queramos
	ventana.setResizable(false); //no permite maximizar
	ventana.setVisible(true);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar la aplicacion sino el programa seguirá ejecutandose
      
      // panel
	tablero = new JPanel();
	tablero.setSize(ventana.getSize()); // ajustar el panel al tamaño de la ventana
	tablero.setLayout(null); // permite colocar jlabels en cualquier lugar que queramos
      tablero.setBackground(Color.yellow);
	tablero.setVisible(true);
      
      //dentro del Panel Tablero
      //titulo
      JLabel titulo = new JLabel();
      titulo.setText("JUEGO DEL GUSANITO");
      titulo.setForeground(java.awt.Color.blue);
      titulo.setFont(new Font("TimesRoman",Font.BOLD, 25));
      titulo.setBounds(250, 10, 300, 30);//x=250, y=10 , ancho=300, largo=30
      tablero.add(titulo);
      
      //Marcador
      JLabel marcador = new JLabel();
      marcador.setText("MARCADOR:");
      marcador.setForeground(java.awt.Color.blue);
      marcador.setFont(new Font("TimesRoman",Font.PLAIN, 18));
      marcador.setBounds(0,60,300, 20);
      tablero.add(marcador);
      
      //Nivel
      JLabel nivel = new JLabel();
      nivel.setText("NIVEL:");
      nivel.setForeground(java.awt.Color.blue);
      nivel.setFont(new Font("TimesRoman",Font.PLAIN, 18));
      nivel.setBounds(450,60, 150, 20);
      tablero.add(nivel);
      
      //Vidas
      JLabel vida = new JLabel();
      vida.setText("VIDA:");
      vida.setForeground(java.awt.Color.blue);
      vida.setFont(new Font("TimesRoman",Font.PLAIN, 18));
      vida.setBounds(50,440, 150, 20);
      tablero.add(vida);
      
      //Vida inicio
      JLabel corazon=new JLabel();
      corazon.setIcon(new ImageIcon("corazon2.jpg"));
      corazon.setBounds(95,440,20,20);//coordenada (95,440) de ancho=20 largo 20
      tablero.add(corazon);
      JLabel corazon2=new JLabel();
      corazon2.setIcon(new ImageIcon("corazon2.jpg"));
      corazon2.setBounds(120,440,20,20);//coordenada (0,440) de ancho=20 largo 20
      tablero.add(corazon2);
      JLabel corazon3=new JLabel();
      corazon3.setIcon(new ImageIcon("corazon2.jpg"));
      corazon3.setBounds(145,440,20,20);//coordenada (0,440) de ancho=20 largo 20
      tablero.add(corazon3);
      
      //Bonus
      JLabel bonus = new JLabel();
      bonus.setText("BONUS:");
      bonus.setForeground(java.awt.Color.blue);
      bonus.setFont(new Font("TimesRoman",Font.PLAIN, 18));
      bonus.setBounds(500,440,150,20);
      tablero.add(bonus);
           
      //Marco izquierdo
      JLabel marco_izq=new JLabel();
      marco_izq.setIcon(new ImageIcon("borde_ver.jpg"));
      marco_izq.setBounds(0,100,20,320);//coordenada (0,100) de ancho=20 largo 320
      tablero.add(marco_izq);
      
       //Marco derecho
      JLabel marco_der=new JLabel();
      marco_der.setIcon(new ImageIcon("borde_ver.jpg"));
      marco_der.setBounds(780,100,20,320);//coordenada (785,100) de ancho=20 largo 320
      tablero.add(marco_der);
      
      //Marco superior
      JLabel marco_sup=new JLabel();
      marco_sup.setIcon(new ImageIcon("borde_hor.jpg"));
      marco_sup.setBounds(0,80,800,20);//coordenada (0,80) de ancho=800 largo 20
      tablero.add(marco_sup);
      
      //Marco inferior
      JLabel marco_inf=new JLabel();
      marco_inf.setIcon(new ImageIcon("borde_hor.jpg"));
      marco_inf.setBounds(0,420,800,20);//coordenada (0,420) de ancho=800 largo 20
      tablero.add(marco_inf);
      
      ventana.add(tablero); // agregando el panel a la ventana
      //----
      // gusano
	gusano = new ArrayList<JLabel>();
	JLabel aux = new JLabel();
	aux.setLocation(700,200);//posicion al inicio del gusano
	aux.setSize(20, 20);
	aux.setIcon(new ImageIcon("cara_derecha.jpg"));
	aux.setVisible(true);
	gusano.add(aux);
	ventana.add(gusano.get(0), 0);//agrega la posicion 0 de gusano
              
      comida = new JLabel();
	comida.setSize(20, 20);
	comida.setIcon(new ImageIcon("comida.jpg"));
	cx = (int) (Math.random()*740)+20; //posi min=20, posi max=760, número aleatorio desde 20 hasta 760, existe 740 números
	cy = (int) (Math.random()*300)+100;//posi min=100, posi max=400,  número aleatorio desde 100 hasta 400, existe 300 números
	comida.setLocation(cx, cy);
	comida.setVisible(true);
	ventana.add(comida,0);
              
      gus = new Rectangle(gusano.get(0).getBounds());
	comi = new Rectangle(comida.getBounds());
      
      //para el marcador
      puntuacion = new JLabel(""+contador);
      puntuacion.setFont(new Font("TimesRoman",Font.PLAIN, 18));
	puntuacion.setBounds(115, 45, 50, 50);//coordenada (115,45) de ancho=50 largo=50
	puntuacion.setVisible(true);
	puntuacion.setForeground(Color.blue);
	ventana.add(puntuacion, 0);
      
      //para el nivel
      nivel = new JLabel(" " + contador2);
      nivel.setFont(new Font("TimesRoman",Font.PLAIN, 18));
	nivel.setBounds(510, 45, 150, 50);
	nivel.setVisible(true);
	nivel.setForeground(Color.blue);
	ventana.add(nivel, 0);
   
      //Movimiento
      tiempo = new javax.swing.Timer(400, new ActionListener() {// velocidad del gusano 300
          @Override
          public void actionPerformed(ActionEvent e) {
          System.out.println(gusano.get(0).getX());
             comi.setBounds(comida.getBounds());
             gus.setBounds(gusano.get(0).getBounds());
             if (gusano.get(0).getX() > 780) {
                  perdio = 1;
              }
              if (gusano.get(0).getX() < 20) {
                  perdio = 1;
              }
              if (gusano.get(0).getY() > 400) {
                  perdio = 1;
              }
              if (gusano.get(0).getY() <100) {
                  tiempo.stop();
                  perdio = 1;
              }
              if (perdio == 1) {
                  System.out.println("El jugador ha perdido");
                  tiempo.stop();
              }
              
              if (comi.intersects(gus)) {//si los rectangulos se cortan
                  cx = (int) (Math.random()*740)+20; //posi min=20, posi max=760, número aleatorio desde 20 hasta 760, existe 740 números
                  cy = (int) (Math.random()*300)+100;//posi min=100, posi max=400,  número aleatorio desde 100 hasta 400, existe 300 números
                  comida.setLocation(cx, cy);
                  comida.repaint();

                  JLabel aux = new JLabel();
                  aux.setLocation(200, 200);
                  aux.setSize(20, 20);
                  aux.setIcon(new ImageIcon("cuerpo.jpg"));
                  aux.setVisible(true);
                  gusano.add(aux);
                  ventana.add(gusano.get(gusano.size() - 1), 0);
                  contador += 5;
                  puntuacion.setText(" " + contador);
                  puntuacion.repaint();
		}
              if(gusano.get(0).getY()==100 && EstadoSup==1){
                  tiempo.stop();
              }
              
              if(gusano.get(0).getY()==400 && EstadoInf==1){
                  tiempo.stop();
              }
              
              if(gusano.get(0).getX()==20 && EstadoIzq==1){
                  tiempo.stop();
              }
              
              if(gusano.get(0).getX()==760 && EstadoDer==1){
                  tiempo.stop();
              }
              
              for (int i = gusano.size() - 1; i > 0; i--) {
                  gusano.get(i).setLocation(gusano.get(i - 1).getLocation());
                  gusano.get(i).repaint();
		}
		gusano.get(0).setLocation(gusano.get(0).getX() + x, gusano.get(0).getY() + y);
		
          }
	});
      ventana.addKeyListener(new KeyListener() {
                  
      @Override
      public void keyTyped(KeyEvent e) {        
      }
      
      @Override
      public void keyReleased(KeyEvent e) { 
         
      }

      @Override
      public void keyPressed(KeyEvent e) {
          //arriba
          if (e.getKeyCode() == KeyEvent.VK_UP) {
              gusano.get(0).setIcon(new ImageIcon("cara_arriba.jpg"));
              y = -movimiento;//reduce en 20 (tamaño de cada cuadricula), como reduce la cabeza sube
              x = 0;
              if(gusano.get(0).getY()<=100){
                  tiempo.stop();
              }
		if (bandera == 0) {
                  tiempo.start();//se usa para iniciar el movimiento del gusanito, movimiento arriba
                  bandera = 1;
		}
              
              if(gusano.get(0).getX()==20){
                  EstadoIzq=0;
              }else{
                  EstadoIzq=1;
              }
              
              if(gusano.get(0).getX()==760){
                  EstadoDer=0;
              }else{
                  EstadoDer=1;
              }
          }   
          //abajo
          if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		gusano.get(0).setIcon(new ImageIcon("cara_abajo.jpg"));
              y = +movimiento;//Aumenta en 20 (tamaño de cada cuadricula), como aumenta la cabeza baja
              x = 0;
              if(gusano.get(0).getY()>380){
                  tiempo.stop();
              }
		if (bandera == 0) {
                  tiempo.start();//se usa para iniciar el movimiento del gusanito, movimiento abajo
                  bandera = 1;
		}
              
              if(gusano.get(0).getX()==20){
                  EstadoIzq=0;
              }else{
                  EstadoIzq=1;
              }
              
              if(gusano.get(0).getX()==760){
                  EstadoDer=0;
              }else{
                  EstadoDer=1;
              }
          }   
          // izquierda
          if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              gusano.get(0).setIcon(new ImageIcon("cara_izqui.jpg"));
              y = 0;
              x = -movimiento;//Disminuye en 20 (tamaño de cada cuadricula), como disminuye la cabeza va a la izquierda
		if (bandera == 0) {
                  tiempo.start();//se usa para iniciar el movimiento del gusanito, movimiento izquierda
                  bandera = 1;
		}
              
              if(gusano.get(0).getX()<=20){
                  tiempo.stop();
              }
              
              if(gusano.get(0).getY()==100){
                  EstadoSup=0;
              }else{
                  EstadoSup=1;
              }
              if(gusano.get(0).getY()==400){
                  EstadoInf=0;
              }else{
                  EstadoInf=1;
              }
          }
                      
          // derecha
          if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		gusano.get(0).setIcon(new ImageIcon("cara_derecha.jpg"));
              y = 0;
              x = +movimiento;//Aumenta en 20 (tamaño de cada cuadricula), como aumenta la cabeza va a la derecha    
              if(gusano.get(0).getX()>=760){
                  tiempo.stop();
              }
		if (bandera == 0) {
                  tiempo.start();//se usa para iniciar el movimiento del gusanito, movimiento derecha
                  bandera = 1;
		}
              if(gusano.get(0).getY()==100){
                  EstadoSup=0;
              }else{
                  EstadoSup=1;
              }
              if(gusano.get(0).getY()==400){
                  EstadoInf=0;
              }else{
                  EstadoInf=1;
              }
          }
      }  
      });
  }  

  }

 

