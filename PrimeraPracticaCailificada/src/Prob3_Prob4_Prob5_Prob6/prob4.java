package Prob3_Prob4_Prob5_Prob6;
import java.util.Scanner;
public class prob4 {
static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		String txt = "";
		System.out.println("Ingrese un texto: ");
		txt = entrada.nextLine();
		
		convertirAMayusculas(txt);
	}
	
	public static void convertirAMayusculas(String texto) {
		char s;
		
		for(int i=0; i<texto.length(); i++) {
			s = texto.charAt(i);
			//a = 97	z = 122		A = 65		Z = 90
			if(s >= 97 && s <= 122) {
				s -= 32;
				System.out.print(s + "");
			}else {
				System.out.print(s + "");
			}
		}
	}
}
