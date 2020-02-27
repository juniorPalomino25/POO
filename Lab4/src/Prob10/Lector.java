package Prob10;

public class Lector {
	String nombre;
	String direccion;
	String telefono;
	
	public Lector() {
		
	}
	
	public Lector(String nombre, String direccion, String telefono){
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		}
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void SetDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void SetTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public String toString() {
		return this.nombre + "\t" + this.direccion + "\t" + this.telefono;
	
}
	

}
