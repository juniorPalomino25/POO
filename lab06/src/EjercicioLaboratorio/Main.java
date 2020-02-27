package EjercicioLaboratorio;

public class Main {
	public static void main(String[] args) {
		Animal animales[] = new Animal[10];
		animales[0]= new Hombre();
		animales[1]= new Hombre();
		animales[2]= new Hombre();
		animales[3]= new Gato();
		animales[4]= new Gato();
		animales[5]= new Gato();
		animales[6]= new Perro();
		animales[7]= new Perro();
		animales[8]= new Perro();
		animales[9]= new Perro();
		
		
		for(int i=0;i<animales.length;i++) {
		System.out.print(animales[i].hablar() + " ");
		
	}
}

}
