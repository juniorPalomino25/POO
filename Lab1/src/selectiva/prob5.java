package selectiva;
	import java.util.Scanner;
public class prob5 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m,n,q;
        
        System.out.print("Ingrese el valor de m: ");
        m = entrada.nextInt();
        System.out.print("Ingrese el valor de n: ");
        n = entrada.nextInt();
        System.out.print("Ingrese el valor de q: ");
        q = entrada.nextInt();
        
        if(m%n==0 && m%q==0){
            System.out.println(m+" es multiplo de "+n+" y "+q);
        }
        else{
            System.out.println(m+" no es multiplo de "+n+" y "+q);
        }
        
    }
}
