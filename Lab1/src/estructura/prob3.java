package estructura;
import java.util.Scanner;
public class prob3 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int a,b,aux;
		
		System.out.println("digite el primer valor: ");
		a = entrada.nextInt();
		
		System.out.println("digite el segundo valor: ");
		b = entrada.nextInt();
		
		aux=a;
		a=b;
		b=aux;
		
		System.out.println("el primer valor ahora es: "+a);
		System.out.println("el segundo valor ahora es: "+b);
		
	}
}
