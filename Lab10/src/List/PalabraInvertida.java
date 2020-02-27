package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalabraInvertida {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList();
		System.out.println("escriba una cadena: ");
		Scanner entrada= new Scanner(System.in);
		String frase= entrada.nextLine();
	
		
		
		int pos1 = frase.indexOf(" ");
		int pos2=0;
		
		lista.add(frase.substring(0,pos1));
		while (frase.indexOf(" ", pos1+1) > 0 ) {
			pos2=frase.indexOf(" ", pos1+1);
			
			System.out.println(" p1 "+pos1+" ****  p2 "+pos2);
			lista.add(frase.substring(pos1,pos2));
		
			pos1=pos2;
		}
		lista.add(frase.substring(pos2));
		System.out.println("[ "+frase.toString()+"]");
		
	}
}
