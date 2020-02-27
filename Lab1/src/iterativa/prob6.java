package iterativa;
	import java.util.Scanner;
public class prob6 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int num,pares=0,dig;
	        
	        System.out.print("Ingrese un numero: ");
	        num = entrada.nextInt();
	        
	        while(num>0){
	            dig = num%10;
	            if(dig%2==0){
	                pares++;
	            }
	            num = (int)Math.round(num/10);
	        }        
	        System.out.println("La cantidad de digitos pares es: "+pares);
	    }
}
