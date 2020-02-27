package iterativa;
	import java.util.Scanner;
public class prob1 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,i=1,may=0;
        System.out.print("Ingrese dos numeros: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        //Encontramos al mayor
        if(a>b){
            may=a;
        }
        else if(b>a){
            may=b;
        }
        //Usamos al mayor para que el iterador pare en el y mostramos en pantalla todos los divisores en comun
        while(i<=may){
            if(a%i==0 && b%i==0){
                System.out.println(i);             
            } 
            i++;
        }
        
    }
}
