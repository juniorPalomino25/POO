package Hilos;

public class Principal2 {
	public static void main(String[] args) {
		Runnable contador = new Contador();
		for(int i=0;i<10;i++) {
			Thread t = new Thread(contador);
			t.start();
		}
	}
}
