import javax.swing.JOptionPane;
public class Ejercicio_05App {

	/*Crea una aplicación que nos convierta un número en base decimal a binario. Esto lo
	realizara un método al que le pasaremos el numero como parámetro, devolverá un String
	con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
	dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que
	no se pueda dividir mas, el resto que obtengamos de cada división formara el numero
	binario, de abajo a arriba.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String num = JOptionPane.showInputDialog("Introduzca un numero:");
		int numInt = Integer.parseInt(num);
		
		String binario = convertirABinario(numInt);
		System.out.println("El numero " + numInt + " es igual a " + binario + " en binario");	
	}
	
	/* Utilizada para hacer pruebas
	public static String convertirABinarioFunction(int num) {
		String resultado = Integer.toBinaryString(num);	
		return resultado;
	}
	*/
	
	public static String convertirABinario(int num) {
		boolean sePuedeDividir = true;				
		int division = num / 2;
		int resto = num % 2;
		String resultado = Integer.toString(resto);
		
		while(sePuedeDividir) {
			resto = division % 2;
			division = division / 2;
			resultado += Integer.toString(resto);
			
			if(division == 0) {
				sePuedeDividir = false;
			}		
		}
			
		resultado = new StringBuilder(resultado).reverse().toString();
		return resultado;
	}
	
}
