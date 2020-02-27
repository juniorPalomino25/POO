package tarea_String;

import java.util.Scanner;

public class prob4 {

	public static void main (String[] args) {
		Scanner entrada= new Scanner(System.in);
		int cant,cantVocales;
		String palabra="";
		System.out.println("escriba una palabra: ");
		palabra=entrada.nextLine();
		cant=palabra.length();
		cantVocales=contarTodasVocales(palabra,cant);
		System.out.println("la cantidad de vocales con repetición es: ");
		System.out.println(cantVocales);
	}
	public static Integer contarTodasVocales(String txt, int c) {
		int p=0,i=0;
		char caracter;
		while(i<c) {
			caracter=txt.charAt(i);
			if ( (caracter == 'a') || (caracter == 'e') || (caracter =='i') || (caracter == 'o') || (caracter =='u')) {
				p++;
			}
			i++;
		}
		return p;
	}
}
