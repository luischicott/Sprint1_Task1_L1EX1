package n1exercici1;

public class S1_T1_N1EX1_Luis_Chicott {

	public static void main(String[] args) {
		
		/*Al cargar la clase 'Instrumento' aquí en el main creando objetos de sus clases hijas
		 se va a ejecutar por única vez un bloque estático que está en la clase. */
		 
	
		
		Viento flauta1 = new Viento("flauta"); 
		Cuerda guitarra1 = new Cuerda("guitarra"); 
		Percusion tambor1 = new Percusion ("tambor"); 
		
		System.out.println(flauta1.getNombre() + " | precio:  " + flauta1.getPrecio());
		System.out.println(flauta1.tocar()); 
		
		System.out.println(guitarra1.getNombre() + " | precio: " + guitarra1.getPrecio());
		System.out.println(guitarra1.tocar()); 
		
		System.out.println(tambor1.getNombre() + " | precio: " + guitarra1.getPrecio());
		System.out.println(tambor1.tocar()); 
		
		
		// Aquí modifico el valor del miembro estático 'precio' desde el objeto instrumento de cuerda 
		guitarra1.setPrecio(450);
		
		/* Aquí se imprime el valor del miembro estático 'precio' desde el objeto instrumento de viento
		y así se corrobora que cambió ya que es un miembro estático de la clase */
		System.out.println("precio: " + flauta1.getPrecio()); 
		
		
		
		
	}

}
