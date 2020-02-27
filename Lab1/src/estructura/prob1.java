package estructura;
import java.util.Scanner;
public class prob1 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double radio, altura, areaTotal;
		
		System.out.println("Area total del cilindro recto ");
		
		System.out.println("digite el radio del cilindro recto: ");
		radio = entrada.nextDouble();
		
		System.out.println("digite la altura del cilindro recto: ");
		altura = entrada.nextDouble();
		
		areaTotal = 2*3.1416*radio*(altura+radio);
		
		System.out.println("\n El area total del cilindro recto es: "+areaTotal);
	}
}
