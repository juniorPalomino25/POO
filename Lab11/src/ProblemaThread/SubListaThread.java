package ProblemaThread;

import java.awt.List;
import java.util.ArrayList;

public  class SubListaThread implements Runnable{

	int sumlocal=0;
	ArrayList<Integer> lista;
	int ini;
	int fin;
	public SubListaThread(ArrayList<Integer> lista, int ini,int fin){
		this.lista = lista;
		this.fin = fin;
		this.ini = ini;
	}
	
	public  void  makeLocalSun(){
		int s=0;
		for(int i=ini; i<fin;i++) {
			s+=lista.get(i);
		}
		sumlocal=s;
	}
	
	
	
	public int getSumlocal() {
		return sumlocal;
	}
	@Override
	public  void run() {
		makeLocalSun();
		
	}
	
}
