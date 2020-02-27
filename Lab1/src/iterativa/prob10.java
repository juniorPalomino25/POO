package iterativa;
	import java.util.Scanner;
public class prob10 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int n,nimpar,suma=0;
	        System.out.println("Ingrese la cantida de numeros: ");
	        n = entrada.nextInt();
	        
	        nimpar = n - (n/2);
	        
	        for(int i=1;i<=nimpar;i++){
	            suma = suma+ (2*i -1);
	        }
	        
	        System.out.print("La suma es: "+suma);
	        System.out.print("\nNumero de impares: "+nimpar+ "\n");
	    }
}
