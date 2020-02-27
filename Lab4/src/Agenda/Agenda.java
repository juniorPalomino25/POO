package Agenda;

import java.util.Scanner;


public class Agenda {
	private static Contacto arr[];
	private int ind;
	private int tam;
	
	public Agenda(int n) {
		this.tam = n;
		this.ind = 0;
		this.arr= new Contacto[tam];
	}
	
	public void agregarContactos(Contacto contacto) {
		 
		 if(this.tam == this.ind) {
				System.out.println("\nCAPACIDAD EXCEDIDA!");
			}else {
				this.arr[this.ind] = contacto;
				this.ind++;
				System.out.println("\nAgregado exitosamente!");
			}
		 
	 }
	
	public void pedidoContactos() {
		System.out.println("\nNOMBRE\tTELEFONO\tDETALLE");
		for( int i=0; i< this.ind; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	public static int numeroContactos(Contacto[] arr) {
		int cant=0;
		
		cant = arr.length;
		
		return cant;
	}
	
	public static void busquedaContacto(String nombre) {
		
		int i=0;
		boolean estado=false ;
		while (estado == true) {
			estado = nombre.equals(arr[i]);
			i++;
		}
			if (estado = true) {
				System.out.println("el nombre:"+nombre);
				System.out.print("fue encontrado");
			}
				else {
					System.out.println("el nombre no fue encontrado");
				}
			
		}
		
		
		
	}
	

