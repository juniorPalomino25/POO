package tarea_String;

import java.util.Scanner;

public class prob9 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		String cadena, nuevo="";
		int i=0;
		char caracter;
		System.out.println("escriba la cadena: ");
		cadena = entrada.nextLine();
		while(i<cadena.length()) {
			caracter = cadena.charAt(i);
			switch (caracter) {
				case 'a' : caracter = '4';break;
				case 'e' : caracter = '3';break;
				case 'i' : caracter = '1';break;
				case 'o' : caracter = '0';break;
				case 'u' : caracter = '8';break;
			}
			nuevo += caracter;
			i++;
		}
		System.out.println("cadena cambiada: "+nuevo);
	}
}
