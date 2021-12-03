import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*Creacion de objetos*/
		Libro libro1=new Libro(12345, "100 años de soledad", "Gabito", 3000);
		Libro libro2=new Libro(123456, "libro de 2000 chistes malos", "nose sabe", 2999);
		
		JOptionPane.showMessageDialog(null, libro1.toString());
		JOptionPane.showMessageDialog(null, libro2.toString());
		
		/*Procesos basicos con los objetos y parametros*/
		if (libro1.getNumPaginas()>libro2.getNumPaginas()) {
			JOptionPane.showMessageDialog(null, libro1.getTitulo()+" tiene mas paginas");
		} else {
			JOptionPane.showMessageDialog(null, libro2.getTitulo()+" tiene mas paginas");
		}
	}

}
