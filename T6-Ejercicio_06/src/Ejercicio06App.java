import javax.swing.JOptionPane;
public class Ejercicio06App {

	/*Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo
	(hay que controlarlo) pedido por teclado. Crea un m�todo que realice esta acci�n, pasando
	el n�mero por par�metro, devolver� el n�mero de cifras.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String num = JOptionPane.showInputDialog("Introduce un n�mero entero positivo");
		int numInt = Integer.parseInt(num);
		
		if(numInt > 0) {
			int cifras = contarCifras(num);
			System.out.println("El n� de cifras es " + cifras);
		}else{
			System.out.println("El numero debe ser positivo");
		}
	}
	
	public static int contarCifras(String num) {
		int numeroDeCifras = num.length();
		return numeroDeCifras;
	}

}
