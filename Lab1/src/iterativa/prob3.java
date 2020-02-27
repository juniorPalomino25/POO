package iterativa;
	import java.util.Scanner;
public class prob3 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,contador=0;
        
        System.out.print("Ingrese un numero: ");
        num = entrada.nextInt();
        
        //Hallamos la cantidad de dividores
        for(int i=2;i<=num;i++){
            if(num%i==0){
                contador++;
            }
        }
        
        //Si la cantidad de divisores sin contar la unidad es uno (con la unidad serian dos divisores)
        if(contador==1){
            System.out.println(num+" es primo");
        }else{
            System.out.println(num+" no es primo");
        }
        
    }
}
