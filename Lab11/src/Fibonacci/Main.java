package Fibonacci;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Fibonacci serie = new Fibonacci();
		Scanner entrada = new Scanner (System.in);
		int n=0;
		System.out.println("digite un numero para la serie fibonacci: ");
		n=entrada.nextInt();
		
		serie.mostrarSerie(n);
	}

	
}
