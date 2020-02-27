package pe.edu.unmsm.agenda;

public class Contacto{
	
	String nombre;
	int edad;
	double salario;
	
	public Contacto(){
		
	}
	public Contacto(String nombre, double salario, int edad){
		this.nombre = nombre;
		this.salario = salario;
		this.edad = edad;
		}
	
		public void SetNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void SetSalario (double salario) {
			this.salario = salario;
		}
		
		public double getSalario() {
			return salario;
		}
	
		public void SetEdad (int edad) {
			this.edad = edad;
		}
		
		public int getEdad() {
			return edad;
		}
		
		@Override
		public String toString() {
			return this.nombre + "\t" + this.salario + "\t" + this.edad;
		}
}
