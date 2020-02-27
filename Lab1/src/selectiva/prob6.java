package selectiva;
import java.util.Scanner;
public class prob6 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int a,b,c;
	        System.out.print("Ingrese el primer lado: ");
	        a = entrada.nextInt();
	        System.out.print("Ingrese el segundo lado: ");
	        b = entrada.nextInt();
	        System.out.print("Ingrese el tercer lado: ");
	        c = entrada.nextInt();
	        
	        //Existencia de un triangulo
	        if ( a+b>c && a+c>b && b+c>a ){
	            System.out.println("Si se puede formar un triangulo"); 
	            //Que tipo de triangulo es...
	            if(a==b && b==c){
	            System.out.println("El triangulo es equilatero");
	            }
	            else if(a==b && a!=c){
	                System.out.println("El triangulo es isosceles");
	            }else if(a==c && a!=b){
	                System.out.println("El triangulo es isosceles");
	            }else if(b==c && b!=a){
	                System.out.println("El triangulo es isosceles");
	            }else if(a!=b && b!=c && a!=c){
	                System.out.println("El triangulo es escaleno");
	            }
	        }
	        else{
	            System.out.println("No se puede formar un triangulo");
	        }
	 }
}
