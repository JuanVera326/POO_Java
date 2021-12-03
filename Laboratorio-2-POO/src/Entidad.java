import javax.swing.JOptionPane;

public class Entidad {
	double ladoa=0;
	double ladob=0;
	double resultado=0;
	
	public void ingresarDatos() {
		ladoa=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado A!!"));
		ladob=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado B!!"));
	}
	public void calcularArea() {
		resultado= ladoa*ladob;
		JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
	}

}
