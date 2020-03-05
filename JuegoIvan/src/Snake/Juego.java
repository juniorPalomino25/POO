package Snake;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Juego {
	JFrame ventana;
	JPanel panelJuego;
	JLabel fondo;

	// serpiente
	ArrayList<JLabel> snake;
	int x;
	int y;
	int movimiento = 20;
	javax.swing.Timer tiempo;
	int bandera = 0;
	Rectangle serp;
	int perdio = 0;
	// comida
	JLabel comida;
	int cx = 0;
	int cy = 0;
	Rectangle comi;
	// puntuacion
	JLabel puntuacion;
	int contador = 0;

	public Juego() {
		// ventana
		ventana = new JFrame("Snake");
		ventana.setSize(600, 600);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(null); // permite colocar componentes en cualquier lugar que queramos
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ventana.setResizable(false); //no permite maximizar
		ventana.setVisible(true);

		// panel
		panelJuego = new JPanel();
		panelJuego.setSize(ventana.getSize()); // ajustar el panel al tamaño de la ventana
		panelJuego.setLayout(null); // permite colocar jlabels en cualquier lugar que queramos
		panelJuego.setVisible(true);
		// panelJuego.setBackground(Color.red); //color al panel

		// fondo
		fondo = new JLabel(new ImageIcon("fondo.jpg"));
		fondo = new JLabel();
		fondo.setSize(panelJuego.getSize()); // ajustar la imagen al tamaño del panel
		// fondo.setBounds(0, 0, 600, 600);
		fondo.setIcon(new ImageIcon("imagenes/fondo.jpg"));
		fondo.setVisible(true);
		// fondo.setLayout(null);
		panelJuego.add(fondo, 0);

		ventana.add(panelJuego); // agregando el panel a la ventana

		// serpiente
		snake = new ArrayList<JLabel>();
		JLabel aux = new JLabel();
		aux.setLocation(290, 290);
		aux.setSize(20, 20);
		aux.setIcon(new ImageIcon("imagenes/cabezaDerecha.png"));
		aux.setVisible(true);
		snake.add(aux);
		panelJuego.add(snake.get(0), 0);

		comida = new JLabel();
		comida.setSize(20, 20);
		comida.setIcon(new ImageIcon("imagenes/comida.png"));
		Random aleatorio = new Random();
		cx = aleatorio.nextInt(540);
		cy = aleatorio.nextInt(540);
		comida.setLocation(cx, cy);

		comida.setVisible(true);
		panelJuego.add(comida, 0);

		serp = new Rectangle(snake.get(0).getBounds());
		comi = new Rectangle(comida.getBounds());

		puntuacion = new JLabel("Puntuacion: " + contador);
		puntuacion.setBounds(10, 20, 100, 20);
		puntuacion.setVisible(true);
		puntuacion.setForeground(Color.red);
		panelJuego.add(puntuacion, 0);

		/*
		 * tiempo = new Timer(400, new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub snake.get(0).setLocation(snake.get(0).getX() + x,
		 * snake.get(0).getY() + y); snake.get(0).repaint(); } });
		 * 
		 */

		tiempo = new javax.swing.Timer(200, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				comi.setBounds(comida.getBounds());
				serp.setBounds(snake.get(0).getBounds());

				if (snake.get(0).getX() > 530) {
					perdio = 1;
				}
				if (snake.get(0).getX() < 10) {
					perdio = 1;
				}
				if (snake.get(0).getY() > 530) {
					perdio = 1;
				}
				if (snake.get(0).getY() < 10) {
					perdio = 1;
				}
				if (perdio == 1) {

					tiempo.stop();
				}

				if (comi.intersects(serp)) {

					cx = aleatorio.nextInt(540);
					cy = aleatorio.nextInt(540);
					comida.setLocation(cx, cy);
					comida.repaint();

					JLabel aux = new JLabel();
					aux.setLocation(200, 200);
					aux.setSize(20, 20);
					aux.setIcon(new ImageIcon("imagenes/cuerpo.png"));
					aux.setVisible(true);
					snake.add(aux);
					panelJuego.add(snake.get(snake.size() - 1), 0);
					contador += 5;
					puntuacion.setText("Puntuacion: " + contador);
					puntuacion.repaint();
				}

				// snake.get(0).setLocation(snake.get(0).getX() + x, snake.get(0).getY() + y);
				for (int i = snake.size() - 1; i > 0; i--) {
					snake.get(i).setLocation(snake.get(i - 1).getLocation());
					snake.get(i).repaint();
				}
				snake.get(0).setLocation(snake.get(0).getX() + x, snake.get(0).getY() + y);
				// snake.get(0).repaint();
			}
		});

		ventana.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// arriba
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (snake.get(0).getY() > 0) {
						y = -movimiento;
						x = 0;
						snake.get(0).setIcon(new ImageIcon("imagenes/cabezaArriba.png"));
					}
					if (bandera == 0) {
						tiempo.start();
						bandera = 1;
					}
				}
				// abajo
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (snake.get(0).getY() < 600) {
						y = movimiento;
						x = 0;
						snake.get(0).setIcon(new ImageIcon("imagenes/cabezaAbajo.png"));
					}
					if (bandera == 0) {
						tiempo.start();
						bandera = 1;
					}
				}
				// izquierda
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (snake.get(0).getX() > 0) {
						y = 0;
						x = -movimiento;
						snake.get(0).setIcon(new ImageIcon("imagenes/cabezaIzquierda.png"));
					}
					if (bandera == 0) {
						tiempo.start();
						bandera = 1;
					}
				}
				// derecha
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (snake.get(0).getX() < 600) {
						y = 0;
						x = movimiento;
						snake.get(0).setIcon(new ImageIcon("imagenes/cabezaDerecha.png"));
					}
					if (bandera == 0) {
						tiempo.start();
						bandera = 1;
					}
				}

			}
		});
	}

}
