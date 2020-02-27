package Prob9;

public class Contacto {
	String nombre;
	String telefono;
	int edad;
	
	public Contacto(){
		
		}
	
	public Contacto(String nombre, String telefono, int edad){
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		}
	
		public void SetNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void SetTelefono (String telefono) {
			this.telefono = telefono;
		}
		
		public String getTelefono() {
			return telefono;
		}
	
		public void SetEdad (int edad) {
			this.edad = edad;
		}
		
		public int getEdad() {
			return edad;
		}
		
		@Override
		public String toString() {
			return this.nombre + "\t" + this.telefono + "\t" + this.edad;
		
}
	}
	