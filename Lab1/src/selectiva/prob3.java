package selectiva;
	import java.util.Scanner;

public class prob3 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c,med=0;
        System.out.print("Ingrese el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = entrada.nextInt();
        System.out.print("Ingrese el tercer numero");
        c = entrada.nextInt();
        
        if(a>b && a>c){
            if(b>c){
                med=b;
            }else{
                med=c;
            }
        }
        else if(b>a && b>c){
            if(a>c){
                med=a;
            }else{
                med=c;
            }
        }else if(c>a && c>b){
            if(a>b){
                med=a;
            }else{
                med=b;
            }
        }else if(a==b || a==c || b==c){
            System.out.println("No se puede determinar");
        }
        
        System.out.println("El termino medio es: "+med);
    }
}
