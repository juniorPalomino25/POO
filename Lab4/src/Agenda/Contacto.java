package Agenda;
import java.io.Serializable;


public class Contacto {
	
	private String nombre;
	private String[] telefono;
	private String dirDom;
	private String dirCom;
	
	public Contacto(String nombre, String [] telefono, String dirDom, String dirCom ){
		this.nombre = nombre;
		this.telefono = telefono;
		this.dirDom = dirDom;
		this.dirCom = dirCom;
		}
	
	
	
	
	public void setNombre(String nome) {
		
        this.nombre = nombre;

    }
		public String getNombre() {
			
			return nombre;
			
		}

		public void setTelefono(String[] telefono) {
			
	        this.telefono = telefono;
	
	    }

	
	    public String[] getTelefono() {
	
	        return telefono;
	
	    }

	
	    public String getDirDom() {
	
	        return dirDom;
	
	    }



	    public void setDirDom(String dirDom) {
	
	        this.dirDom= dirDom;
	
	    }
	    


	    public void setDirCom(String dirCom) {
	
	        this.dirCom= dirCom;
	
	    }

	    
	    public String getDirCom() {
	    	
	        return dirCom;
	
	    }




    @Override
	
	    public String toString() {
    		
    	String resultado = "";
		String cantidad = "";
		//return this.nombre + "---" + this.telefono + "---" + this.dirCom + "---" + this.dirDom;
		for(int i=0; i<telefono.length; i++) {
			cantidad = cantidad + this.telefono[i] + "  ";
		}
		resultado = "\n\n\nNombre: " + this.nombre + "\nNumero(s): " + cantidad + "\nDir. Comercial: " + this.dirCom + "\nDir. Domicilio: " + this.dirDom + "\n\n";
		return resultado;
	       
	    }    
}
