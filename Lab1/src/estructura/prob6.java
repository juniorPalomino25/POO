package estructura;
import java.util.Scanner;
public class prob6 {
	public static void main(String args[]) {
			
			Scanner entrada = new Scanner(System.in);
			int grados,minutos,segundos;
			double numero,aux1,aux2,resp;
			
			System.out.println("digite el numero en radianes ()π: ");
			numero= entrada.nextDouble();
			
			resp= numero*180/3.1416;
			grados=(int) Math.floor(resp);
			aux1= 60*(resp-grados);
			minutos= (int) Math.floor(aux1);
			aux2= 60*(aux1-minutos);
			segundos= (int) Math.floor(aux2);
			
			System.out.println("grado: "+grados);
			System.out.println("minutos: "+minutos);
			System.out.println("segundos: "+segundos);
			
		}
}
