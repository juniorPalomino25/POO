package labo;
import java.util.Scanner;

public class labo1 {

		public static void main(String args[]) {
			Scanner entrada = new Scanner(System.in);
			
			float x1=0,x2=0,x3,y1,y2,y3,d1,d2,d3=0;
			
			System.out.println("digite las coordenadas del primera coordenada: ");
			x1=entrada.nextFloat();
			y1=entrada.nextFloat();
			
			System.out.println("digite las coordenadas del segunda coordenada: ");
			x2=entrada.nextFloat();
			y2=entrada.nextFloat();

			System.out.println("digite las coordenadas del tercera coordenada: ");
			x3=entrada.nextFloat();
			y3=entrada.nextFloat();
			
			
			d1=(float) Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((x1-x2), 2));
			d2=(float) Math.sqrt(Math.pow((x2-x3), 2)+Math.pow((x2-x3), 2));
			d3=(float) Math.sqrt(Math.pow((x1-x3), 2)+Math.pow((x1-x3), 2));
			
			
				if(d1==d2 && d1==d3 &&d2==d3) {
					System.out.println("el triángulo es equilátero");
				} 	
				else {
					if(d1!=d2 && d1!=d3 && d2!=d3)
						System.out.println("el triángulo es escaleno");
					else 
						System.out.println("el triángulo es isoceles");
					
				}
		}
	}


