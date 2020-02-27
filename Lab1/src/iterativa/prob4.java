package iterativa;
	import java.util.Scanner;
public class prob4 {
	  public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int num,suma=0;
	        System.out.print("Ingrese un numero: ");
	        num = entrada.nextInt();
	        
	        for(int i=1;i<num;i++){
	            if(num%i==0){
	                suma +=i;
	            }
	        }
	        if(suma==num){
	            System.out.println("El numero "+num+" es perfecto");
	        }
	        else{
	            System.out.println("El numero "+num+" no es perfecto");
	        }
	        
	    }
}
