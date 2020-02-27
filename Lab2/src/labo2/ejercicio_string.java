package labo2;
import java.util.Scanner;
public class ejercicio_string {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        String palabra;
        String nuevo = "";
        
        System.out.println("Ingrese una palabra");
        palabra = entrada.nextLine();
             
        i = palabra.length()-1;
        while(i>=0){
            nuevo += palabra.charAt(i);
            i--;
        }
        System.out.println(nuevo);
    }
}
