package Hilos;

import java.util.HashSet;
import java.util.Set;

public class Contador implements Runnable{
	private int numero = 0;
	private final Set<Integer> numeros = new HashSet<>();
	private static final int MAX = 10000;
	
			public synchronized int proximo() {
				return numero++;
			}
			public boolean continua() {
				return numero < MAX;
			}
	@Override
		public void run() {
			while (continua()) {
				int proximoNumero = proximo();
				if (!numeros.add(proximoNumero)) {
					System.out.println("Colision: " + proximoNumero);
					}
			}
		}
}
