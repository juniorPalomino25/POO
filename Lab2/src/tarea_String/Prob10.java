package tarea_String;

import java.util.Scanner;

public class Prob10 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		String usuario, contraseña;
		boolean autenticar;
		
		System.out.println("escriba su usuario: ");
		usuario = entrada.nextLine();
		System.out.println("escriba su contraseña: ");
		contraseña = entrada.nextLine();
		
		
		autenticar=esAutenticado(usuario,contraseña);
		System.out.println("la autenticación es: "+autenticar);
	}
		public static boolean esAutenticado (String cadena, String contra) {
			int i=0,p;
			boolean estado = true;
			char caracter;
			String nuevo="";
					while(i<cadena.length()) {
						caracter = cadena.charAt(i);
						switch (caracter) {
							case 'a' : caracter = '4';break;
							case 'e' : caracter = '3';break;
							case 'i' : caracter = '1';break;
							case 'o' : caracter = '0';break;
							case 'u' : caracter = '8';break;
						}
						nuevo += caracter;
						i++;
					}
				p=contra.compareTo(nuevo);
			if(p!=0) {
				estado = false;
				}
			
			return estado;
			}
		}
	
	

