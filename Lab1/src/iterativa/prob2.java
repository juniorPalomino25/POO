package iterativa;
	import java.util.Scanner;
public class prob2 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,i=2;
        
        System.out.print("Ingrese un numero: ");
        num = entrada.nextInt();
        System.out.println("\n");
        while(num!=1){
            
            if(num%i==0){
                num /=i;
                System.out.print(i+"*");
            }
            
            else if(num%i!=0){
                i++;
            }
        }
        
    }
}
