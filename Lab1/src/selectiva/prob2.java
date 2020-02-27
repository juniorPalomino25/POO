package selectiva;
	import java.util.Scanner;
public class prob2 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int a,b,suma,producto;
	        
	        System.out.println("Ingrese dos numeros: ");
	        a = entrada.nextInt();
	        b = entrada.nextInt();
	        
	        if (a>0 && b>0){
	            producto = a*b;
	            System.out.println("El producto es: "+producto);
	        }
	        else{
	            suma=a+b;
	            System.out.println("La suma es: "+suma);
	        }
	    }
}
