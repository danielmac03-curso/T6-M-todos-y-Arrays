import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio_02App {

	/*Crea una aplicaci�n que nos genere una cantidad de n�meros enteros aleatorios que
	nosotros le pasaremos por teclado. Crea un m�todo donde pasamos como par�metros min
	que n�meros queremos que los genere, podemos pedirlas por teclado antes de generar los
	n�meros. Este m�todo devolver� un n�mero entero aleatorio. Muestra estos n�meros por
	pantalla.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String cantidadNumeros = JOptionPane.showInputDialog("Que cantidad de n�meros enteros aleatorios quiere generar:");
		int cantidadNumeroInt = Integer.parseInt(cantidadNumeros);
		
		String min = JOptionPane.showInputDialog("Introduzca el valor minimo:");
		int minInt = Integer.parseInt(min);
		
		String max = JOptionPane.showInputDialog("Introduzca el valor m�ximo:");
		int maxInt = Integer.parseInt(max);
			
		for (int i = 0; i < cantidadNumeroInt; i++) {
			int numeroGenerado = generarNumero(minInt, maxInt);
			System.out.println("Numero " + (i+1) + " : " +  numeroGenerado);
		}
	}
	
	public static int generarNumero(int min, int max) {
        int random = (int) (Math.random() * ((max - min) +1 )) + min;
		return random;
	}

}
