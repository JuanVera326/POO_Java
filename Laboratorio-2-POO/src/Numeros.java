import javax.swing.JOptionPane;

public class Numeros {
	
	int number;
	int i,neg,par;	//Declaracion de variables
	
	public void entrada() {
		for (int i = 0; i < 5; i++) {
			number=ingresarDatos("Digite un numero");	//Llamado de metodo
			if (number%2==0) {
				par++;
			}if (number<0) {	//Calculo del dato ingresado y procesado
				neg++;
			}
		}JOptionPane.showMessageDialog(null, "El numero de numeros pares es: "+par+"\nEl numero de numeros negativos es: "+neg);
	}
	public static int ingresarDatos(String mensaje) {
		int valor;
		valor=Integer.parseInt(mensaje);	//Procesado y conversion del dato ingresado por cadena String a Entero
		return valor;
	}
}
