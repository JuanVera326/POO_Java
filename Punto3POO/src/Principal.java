import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		
	}
	public Principal() {
		Perrito miPerrito=new Perrito();
		String u;
		String nom=JOptionPane.showInputDialog("Dale un nombre a tu perrito :3").toUpperCase();
		String men="Selecciona que quieres que haga "+nom+" :3\n";
		men+="\n1. Para hacer ladrar a "+nom;
		men+="\n2. Para hacer caminar a "+nom;
		men+="\n3. Para hacer correr a "+nom;
		men+="\n4. Para hacer saltar a "+nom;
		men+="\n5. Para hacer dar vueltas a "+nom;
		men+="\n6. Para hacer ir al ba�o a "+nom;
		men+="\n7. Para hacer aullar a "+nom;
		men+="\n8. Para hacer comer a "+nom;
		men+="\n9. Para hacer tomar agua a"+nom;
		men+="\n10. Para hacer que "+nom+" se coma un ni�o :3";
		do {
			String e=JOptionPane.showInputDialog(men);
			switch (e) {
			case "1": {
				miPerrito.ladrar(nom);
				break;
			}
			case "2": {
				miPerrito.caminar(nom);
				break;
			}
			case "3": {
				miPerrito.correr(nom);
				break;
			}
			case "4": {
				miPerrito.saltar(nom);
				break;
			}
			case "5": {
				miPerrito.darVueltas(nom);
				break;
			}
			case "6": {
				miPerrito.banio(nom);
				break;
			}
			case "7": {
				miPerrito.aullar(nom);
				break;
			}
			case "8": {
				miPerrito.comer(nom);
				break;
			}
			case "9": {
				miPerrito.tomarAgua(nom);
				break;
			}
			case "10": {
				miPerrito.comerNinio(nom);
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "No Es Valido");}
			u=JOptionPane.showInputDialog("�Quiere que "+nom+" haga otra cosa?\n(SI o NO)");		
		} while (u.toUpperCase().equals("SI"));
		JOptionPane.showMessageDialog(null, "Terminado!!");
	}
}