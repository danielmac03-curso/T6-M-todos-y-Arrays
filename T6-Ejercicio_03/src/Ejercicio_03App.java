import javax.swing.JOptionPane;
public class Ejercicio_03App {

	/*Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos
	por parámetro para que nos indique si es o no un número primo, debe devolver true si es
	primo sino false.
	Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
	primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String num = JOptionPane.showInputDialog("Introduzca un numero:");
		int numInt = Integer.parseInt(num);	
		boolean numComprobado = comprobarPrimo(numInt);
		
		if(numComprobado == true) {
			System.out.println("El "+ num + " es un numero primo");
		}else{
			System.out.println("El "+ num + " NO es un numero primo");
		}
	}
	
	public static boolean comprobarPrimo (int num) {
		int intentos = 0;
		
		for (int i = 2; i <= num; i++) {						
			if(num %i == 0 && num != i) {
				intentos++;
			}
		}
				
		if(intentos == 0) {
			return true;
		}else{
			return false;
		}
							
	}

}
