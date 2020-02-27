package tarea_String;

import java.util.Scanner;

public class prob8 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int p;
		System.out.println("digite la cantidad de elementos: ");
		p= entrada.nextInt();
		int []V = new int[p];
		for (int i=0;i<V.length;i++) {
			System.out.println("ingrese el numero en la posicion "+"("+(i+1)+"): " );
			V[i]=entrada.nextInt();
		}
		
		prob8 imp = new prob8();
		imp.imprimir(V);
	}
	public void imprimir(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.println(vector[i]);
		}
	}
}
