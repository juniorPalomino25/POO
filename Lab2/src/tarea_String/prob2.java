package tarea_String;

import java.util.Scanner;

public class prob2 {

	public static void main(String args[]) {
		Scanner entrada= new Scanner(System.in);
		String palabra, nuevaPalabra;
		
		System.out.println("escriba la palabra: ");
		palabra=entrada.nextLine();
		nuevaPalabra = invertir(palabra);
		System.out.println(nuevaPalabra);
	}
	
	public static String invertir(String txt) {
		int j=0;
		String nuevo="";
		for(int i=txt.length()-1;i>=0;i--) {
			nuevo += txt.charAt(i);
			j++;
		}
		
		return nuevo;
	}
}
