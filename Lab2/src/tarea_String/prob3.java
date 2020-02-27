package tarea_String;

import java.util.Scanner;

public class prob3 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		String palabra,invert;
		boolean palindromo;
		
		System.out.println("escriba la palabra: ");
		palabra=entrada.nextLine();
		invert=invertir(palabra);
		palindromo = esPalindromo(palabra,invert);
		System.out.println(palindromo);
		
	}
	public static boolean esPalindromo(String txt1, String txt2) {
		 int es;
		 boolean compara=true;
		 es=txt1.compareTo(txt2);
		 	if(es!=0) 
		 		compara=false;
		 		else 
		 			compara=true;
		 	
		 return compara;
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
