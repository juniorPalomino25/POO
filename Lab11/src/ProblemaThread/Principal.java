package ProblemaThread;



import java.awt.List;
import java.util.ArrayList;



public class Principal {
	
	public static void main(String[] args) {
		int n=100;
		int t=10;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		
		for (int i=0;i<n;i++) {
			lista.add(i);
		}
		SubListaThread sbt;
		int sfinal=0;
		for(int i=0;i<t;i++) {
			sbt = new SubListaThread(lista,i*(n/t), (i+1)*(n /t));
			Thread t1 = new Thread(sbt);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sfinal+= sbt.sumlocal;
			
		}
		
		
		System.out.println("       :::::::"+sfinal);
	
		sfinal=0;
		
		for(int i=0;i<n;i++) {
			sfinal+=lista.get(i);
		}
		
	}
}
