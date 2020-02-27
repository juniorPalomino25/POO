package tarea_String;

import java.util.Scanner;

public class prob5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cant,cantVocales;
		String palabra;
		System.out.println("escriba una palabra: ");
		palabra = entrada.nextLine();
		cant=palabra.length();
		cantVocales=contarTodasVocales(palabra,cant);
		System.out.println("la cantidad de vocales sin repetir es:");
		System.out.println(cantVocales);
	}
	
	public static Integer contarTodasVocales(String txt, int c) {
		int voc=0,j=0,pos,a=0,e=0,i=0,o=0,u=0;
		char cadena;
		while(j<c) {
			cadena=txt.charAt(j);
			switch(cadena) {
				case 'a' : a=1; break;
				case 'e' : e=1; break;
				case 'i' : i=1; break;
				case 'o' : o=1; break;
				case 'u' : u=1; break;
			}
			j++;
		}
		
		voc = a+e+i+o+u;
		return voc;
	}
}
