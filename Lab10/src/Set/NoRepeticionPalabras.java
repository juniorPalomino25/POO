package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NoRepeticionPalabras {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		Set<String> palabras = new HashSet<>();	
		System.out.println("escriba una cadena: ");
		String frase = entrada.nextLine();
		String cad="";
		frase = frase.toLowerCase();
		
		int pos1 = 0;
		int pos2=0;
		char caracter;
		
		for(int i=0;i<frase.length();i++) {
			caracter=frase.charAt(i);
			if(caracter==' '|| i==frase.length()-1) {
				pos2=i;
				cad=frase.substring(pos1,pos2);
				palabras.add(cad);
				pos1=pos2;
			}
		}
		
		System.out.println("El texto tiene " + palabras.size() + " palabras");
		
	}

	}

