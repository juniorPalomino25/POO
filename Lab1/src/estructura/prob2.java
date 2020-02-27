package estructura;
import java.util.Scanner;
public class prob2 {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int termino, suma=0;
		
		
		System.out.println("digite la cantidad de terminos:");
		termino = entrada.nextInt();
		
		for (int i=1;i<=termino;i++) {
			suma=(int) (suma + Math.pow(i,3));
		}
		System.out.println("la suma de cubos es: " + suma);
	}

}
