package PrimeraPregunta;

import java.util.Scanner;

public class main {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	double discriminante;
	System.out.println("digite el valor de a: ");
	double a = entrada.nextDouble();
	System.out.println("digite el valor de b: ");
	double b = entrada.nextDouble();
	System.out.println("digite el valor de c: ");
	double c = entrada.nextDouble();

	QuadraticEquation cuadratica = new QuadraticEquation(a,b,c);
	discriminante = cuadratica.getDiscriminant();
	
	if (discriminante >=0) {
		System.out.println("la primera raiz es: "+ cuadratica.getRoot1());
		System.out.println("la segunda raiz es: "+ cuadratica.getRoot2());
	}
	else {
		System.out.println("las raices son 0 ");
	}
	}
	
}
