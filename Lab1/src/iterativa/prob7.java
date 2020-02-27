package iterativa;
	import java.util.Scanner;

public class prob7 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int num,temp,ultimo,com=0;
	        System.out.print("Ingrese un numero: ");
	        num = entrada.nextInt();
	        temp = num;
	        while(temp!=0){
	            ultimo = temp%10;
	            temp /= 10;
	            com = com*10 + ultimo;
	        }
	        if(com==num){
	            System.out.println("El numero es capicua");
	        }
	        else{
	            System.out.println("El numero no es capicua");
	        }
	        
	    }
}
