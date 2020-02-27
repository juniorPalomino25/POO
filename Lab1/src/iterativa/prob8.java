package iterativa;
	import java.util.Scanner;	
public class prob8 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int n,nsub,npar,a=1,b=2,suma1,suma2,sumat;
	        System.out.print("Ingrese el numero de terminos a sumar: ");
	        n = entrada.nextInt();
	       
	        npar = n/2;
	        nsub = n-npar;
	        suma1 = (nsub*(nsub+1))/2;
	        suma2 = npar*(npar+1);

	        sumat = suma1 + suma2;
	        System.out.println("La suma de la serie es: "+sumat);
	        
	    }
}
