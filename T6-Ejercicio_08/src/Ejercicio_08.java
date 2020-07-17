import javax.swing.JOptionPane;
public class Ejercicio_08 {
	
	/*Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
	consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
	otro para mostrar.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int numeros[] = new int[10];
		
		numeros = rellenarValores(numeros);
		mostrarValores(numeros);
	}
	
	public static int[] rellenarValores(int[] numeros) {
		for (int i = 0; i < 10; i++) {
			String numero = JOptionPane.showInputDialog("Introduce el " + (i+1) + "º número");
			int numeroInt = Integer.parseInt(numero);	
			numeros[i] = numeroInt;
		}
		
		return numeros;
	}
	
	public static void mostrarValores(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El indice es " + i + " y el valor es " + numeros[i]);
		}
	}

}
