package tarea_String;

import java.util.Scanner;

public class prob1 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		String palabra1,palabra2 , palabra3,nuevaPalabra;
		
		System.out.println("escriba la primer cadena");
		palabra1 = entrada.nextLine();
		System.out.println("escriba la segunda cadena");
		palabra2 = entrada.nextLine();
		System.out.println("escriba la tercera cadena");
		palabra3 = entrada.nextLine();
		
		nuevaPalabra=concatenar(palabra1,palabra2,palabra3);
		System.out.println(nuevaPalabra);
	}
	
	public static String concatenar(String txtUno, String txtDos, String txtTres) {
		String nuevo;
		nuevo = "txtUno".concat("txtDos").concat("txtTres");
		return nuevo;
	}
}
