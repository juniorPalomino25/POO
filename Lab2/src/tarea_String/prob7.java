package tarea_String;

import java.util.Scanner;

public class prob7 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		float aumento;
		int tam;
		System.out.println("digite el tama�o del arreglo: ");
		tam = entrada.nextInt();
		int [] vec = new int [tam];
		System.out.println("en cuanto desea aumentar el tama�o del arreglo? : ");
		aumento=entrada.nextFloat();
		prob7 ampl = new prob7();
		ampl.ampliarArreglo(vec,tam);
	}
	public static void ampliarArreglo(int vec[], float aumento) {
		int a;
		float i,aum;
			i=vec.length;
			aum = i+aumento;
			a = Math.round(aum);
			System.out.println("el tama�o del aumento es: "+a);
	}
}
