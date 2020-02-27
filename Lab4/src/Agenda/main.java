package Agenda;

import java.util.Scanner;

public class main {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite la cantidad de contactos a registrar: ");
		int tam = entrada.nextInt();
		Agenda agenda = new Agenda(tam);
		System.out.println("Se creo la Agenda");
		while(true) {
			System.out.println("\tAGENDA\t");
			System.out.println("1.Agregar contactos");
			System.out.println("2.Mostrar todos los contactos");
			System.out.println("3.Buscar contacto por nombre");
			System.out.println("4.Salir");
			System.out.print("Escoja una opcion: ");
			int opc = entrada.nextInt();
			switch(opc) {
			case 1: 
				agregarContacto(agenda);
				break;
			case 2:	
				agenda.pedidoContactos();
				break;
			case 3:	
				entrada.nextLine();
				System.out.println("Ingrese nombre a buscar: ");
				String nombre = entrada.nextLine();
				agenda.busquedaContacto(nombre);
				break;
			case 4:	
				System.exit(0);
				break;
			default:
				System.out.println("Escoja una opcion valida");
				break;
			
			}
		}
		
	}

	
public static void agregarContacto(Agenda agenda) {
	String nomb;
	String num[];
	String dirCom;
	String dirDom;
	int cantNumTel;
	
	entrada.nextLine();
	
	System.out.println("Datos del contacto: ");
	
	System.out.println("Nombre: ");
	nomb = entrada.nextLine();
	
	System.out.println("Cuantos números telefónicos tiene?: ");
	cantNumTel = entrada.nextInt();
	
	num = new String[cantNumTel];
	
	entrada.nextLine();
	
	for(int j=0; j < num.length; j++) {
		System.out.println("Numero " + (j+1) + ": ");
		num[j] = entrada.nextLine();
	}
	
	System.out.println("Dirección comercial: ");
	dirCom = entrada.nextLine();
	
	System.out.println("Dirección domicilio: ");
	dirDom = entrada.nextLine();
	
	Contacto contacto = new Contacto(nomb,num,dirCom,dirDom);
	agenda.agregarContactos(contacto);
}

}
