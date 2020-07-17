import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio_02App {

	/*Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
	nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros min
	que números queremos que los genere, podemos pedirlas por teclado antes de generar los
	números. Este método devolverá un número entero aleatorio. Muestra estos números por
	pantalla.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String cantidadNumeros = JOptionPane.showInputDialog("Que cantidad de números enteros aleatorios quiere generar:");
		int cantidadNumeroInt = Integer.parseInt(cantidadNumeros);
		
		String min = JOptionPane.showInputDialog("Introduzca el valor minimo:");
		int minInt = Integer.parseInt(min);
		
		String max = JOptionPane.showInputDialog("Introduzca el valor màximo:");
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
