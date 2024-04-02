package n1exercici1;

public class Percusion extends Instrumento {
	
	public Percusion(String nombre) {
		super(nombre); 
	}
	
	@Override
	public String tocar() {
		return "Está sonando un instrumento de percusión"; 
	}

}
