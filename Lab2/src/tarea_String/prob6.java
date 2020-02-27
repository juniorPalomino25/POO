package tarea_String;

import java.util.Scanner;

public class prob6 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		String cadena;
		int p,cant;
		System.out.println("escriba una cadena: ");
		cadena=entrada.nextLine();
		cant=cadena.length();
		p=contarPalabras(cadena,cant);
		System.out.println("la cantidad de palabras es: "+p);
	}
	
	public static Integer contarPalabras(String txt,int c) {
		int cont=1,i=0,j;
		char caracter;
		while(i<c) {
			caracter = txt.charAt(i);
			if(caracter==' ') {
				cont++;
			}
			i++;
		}
		if(txt.charAt(c-1)==' ') {
			cont--;
		}
		return cont;
	}
}
