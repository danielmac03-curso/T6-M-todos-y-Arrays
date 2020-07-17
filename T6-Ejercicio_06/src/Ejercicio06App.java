import javax.swing.JOptionPane;
public class Ejercicio06App {

	/*Crea una aplicación que nos cuente el número de cifras de un número entero positivo
	(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
	el número por parámetro, devolverá el número de cifras.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String num = JOptionPane.showInputDialog("Introduce un número entero positivo");
		int numInt = Integer.parseInt(num);
		
		if(numInt > 0) {
			int cifras = contarCifras(num);
			System.out.println("El nº de cifras es " + cifras);
		}else{
			System.out.println("El numero debe ser positivo");
		}
	}
	
	public static int contarCifras(String num) {
		int numeroDeCifras = num.length();
		return numeroDeCifras;
	}

}
