package iterativa;
	import java.util.Scanner;

public class prob9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int num,dig,suma=0;
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        
        while(num>0){
            dig = num%10;
            suma = suma+dig;
            num = (int)Math.round(num/10);
        }
        System.out.println("La suma es: "+suma);
    }
}
