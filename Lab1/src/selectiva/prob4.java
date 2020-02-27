package selectiva;
	import java.util.Scanner;
public class prob4 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int anio;
	        System.out.print("Ingrese una año: ");
	        anio = entrada.nextInt();
	        
	        if(anio>0){
	            if(anio%4==0){
	                if(anio%100!=0){
	                    System.out.println("El año es bisiesto");
	                }else{
	                    System.out.println("El año no es bisiesto");
	                }
	            }else{
	                System.out.println("El año no es bisiesto");
	            }
	        }else{
	            System.out.println("El año es incorrecto!!!");
	        }
	        
	        
	        
	    }
}
