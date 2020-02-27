package ProgramaEjercicio;

import java.util.Scanner;

public class probLibro {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		
		
		int num1;
		int num2;
		int s=0;
		char expresion;
		System.out.print("digite el primer numero con espacio: ");
		cadena = entrada.nextLine();
	
		num1 = cadena.charAt(0);
		expresion = cadena.charAt(2);
		num2 = cadena.charAt(4);
		
		if (expresion == '+') {
			s=num1+num2;
		}
		if (expresion == '-') {
				s = num1-num2;
			}
		if(expresion == '*') {
					s = num1 * num2;
				}
		if(expresion == '/'){
						s = num1 / num2;
					}
		System.out.println("el resultado es: "+ s);
				}
			}
		
	

