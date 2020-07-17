import javax.swing.JOptionPane;
public class Ejercicio_04App {		
	
	/*Crea una aplicaci�n que nos calcule el factorial de un n�mero pedido por teclado, lo
	realizara mediante un m�todo al que le pasamos el n�mero como par�metro. Para calcular
	el factorial, se multiplica los n�meros anteriores hasta llegar a uno. Por ejemplo, si
	introducimos un 5, realizara esta operaci�n 5*4*3*2*1=120.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = JOptionPane.showInputDialog("Introduzca un numero:");
		int numInt = Integer.parseInt(num);
		
		int factorial = obtenerFactorial(numInt);
		System.out.println("El factorial es " + factorial);	
	}
	
	public static int obtenerFactorial (int num){		
		int resultado = num;
		
		for (int i = 1; i < num; i++) {
			resultado *= num - i;
		}
		
		return resultado;
	}

}
