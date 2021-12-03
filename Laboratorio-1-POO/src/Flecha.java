import javax.swing.JOptionPane;

public class Flecha {
	int longitud;	//Definicion atributos de la clase
	String color;
	 
	public Flecha() {
		longitud=18;	//Constructor clase flecha 
		color="negro";
	}
	public Flecha(int longitud,String color) {
		this.longitud=longitud;	//Constructor clase flecha 
		this.color=color;
	}
	public void imprimirEspacio(){
		System.out.println();
	}
	public void construirFlecha() {
		for (int i = 0; i < longitud; i++) {
			imprime("-");		//Ciclo consruccion y guardado de la forma
		}
		imprime(">");
	}
	private void imprime(String simbolo) {
		if (color.equals("negro")) {		
			System.out.print(simbolo);	//Impresion de las flechas guardadas
		}else {
			System.err.print(simbolo);
		}
	}
	
}
