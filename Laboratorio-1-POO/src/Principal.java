
public class Principal {
	
	Flecha flecha1,flecha2,flecha3; //creacion objetos flechas de la clase flechas
	public static void main(String[] args) {
		Principal miPrincipal=new Principal(); //Creacion obejto de la clase principal
	}
	public Principal() {
		flecha1=new Flecha(); 
		flecha1.construirFlecha();	
		flecha1.imprimirEspacio();
		
		flecha2=new Flecha();
		flecha2.longitud=34;		//Ejecucion de metodos sobre los objetos creados
		flecha2.color="rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3=new Flecha(12,"negro");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
	}
}
