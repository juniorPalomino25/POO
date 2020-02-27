package iterativa;
	import java.util.Scanner;
public class prob5 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int num,ver=-1,i=10,cont=0;
	        System.out.print("Ingrese un numero: ");
	        num = entrada.nextInt();
	        
	        while(ver<0){
	            ver= i-num;
	            cont++;
	            i*=10;
	        }
	        System.out.println("El numero de digitos es: "+cont);
	    }
}
