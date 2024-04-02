package n1exercici1;



public abstract class Instrumento {
	
	
	//Bloque static 
	static {
		System.out.println("Bienvenidos/as, esta es una lista de Instrumentos: "); 
	}
	
	private String nombre; 
	private static int precio = 250; 
	
	public Instrumento(String nombre) {
		this.nombre = nombre; 
		// this.precio = precio; 
	}
	
	
	
	// Getter
		  public String getNombre() {
		    return this.nombre;
		  }
		  
		  public int getPrecio() {
			    return Instrumento.precio; 
		  }

		  // Setter
		  public void setNombre(String nombre) {
		    this.nombre = nombre;
		  }
		  
		  public void setPrecio(int precio) {
		    Instrumento.precio = precio;
		  }
	
	public abstract String tocar();
	


}
