package Hilos;

public class Tarefa implements Runnable{
	private final String nome;

	public Tarefa(String nome) {
		this.nome = nome;
	}
	@Override
	public void run() {
		for(int i = 0; i<= 100;i=i+20) {
			System.out.println(" Tarefa "+" nome "+" : "+i+" % ");
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Tarefa("A"));
		Thread t2 = new Thread(new Tarefa("B"));
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//t1.join();
		//t2.join();
		
		System.out.println("Fin de thread principal ");
	}
}
