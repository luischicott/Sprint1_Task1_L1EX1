package n1exercici1;

public class Cuerda extends Instrumento {
	
	public Cuerda(String nombre) {
		super(nombre); 
	}
	
	@Override
	public String tocar() {
		return "Está sonando un instrumento de cuerda"; 
	}

}
