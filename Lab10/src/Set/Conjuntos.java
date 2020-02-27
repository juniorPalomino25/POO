package Set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjuntos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Set<String> conjuntoA = new HashSet<>();	
		Set<String> conjuntoB = new HashSet<>();	
	
		conjuntoA.add("1");
		conjuntoA.add("3");
		conjuntoA.add("5");
		conjuntoA.add("7");
		conjuntoA.add("10");
		
		conjuntoB.add("2");
		conjuntoB.add("4");
		conjuntoB.add("5");
		conjuntoB.add("6");
		conjuntoB.add("8");
		conjuntoB.add("10");
		conjuntoB.add("11");
		conjuntoB.add("13");
		
		int A = conjuntoA.size();
		int B = conjuntoB.size();
		
		int i=0,j=0,k=0;
		ArrayList<Integer> C = new ArrayList<Integer>();
		while (i<A && j<B) {
			
		}
		

	}
}
