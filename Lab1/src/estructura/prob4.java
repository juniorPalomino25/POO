package estructura;
import java.util.Scanner;
public class prob4 {
	public static void main(String args[]) {
			
			Scanner entrada = new Scanner(System.in);
			double x1,y1,x2,y2,distancia,aux;
			
			System.out.println("digite la cordenada (x1,y1): ");
			x1= entrada.nextDouble();
			y1= entrada.nextDouble();
			System.out.println("digite la cordenada (x2,y2): ");
			x2= entrada.nextDouble();
			y2= entrada.nextDouble();
			
			aux= (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
			distancia = Math.sqrt(aux);
			
			System.out.println("la distancia entre coordenadas es: "+distancia);
		}
}
