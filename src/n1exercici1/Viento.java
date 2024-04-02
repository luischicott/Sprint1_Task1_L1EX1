package n1exercici1;

public class Viento extends Instrumento {
	
	public Viento(String nombre) {
		super(nombre); 
	}
	

	@Override
	public String tocar() {
		return "Está sonando un instrumento de viento"; 
	}
	
	
}
