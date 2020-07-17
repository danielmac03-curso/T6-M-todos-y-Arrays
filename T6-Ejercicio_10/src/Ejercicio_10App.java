import javax.swing.JOptionPane;

public class Ejercicio_10App {

	/*Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
	n�meros aleatorios primos entre los n�meros deseados, por �ltimo nos indicar cual es el
	mayor de todos.
	Haz un m�todo para comprobar que el n�mero aleatorio es primo, puedes hacer todos lo
	m�todos que necesites.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cantidadNumeros = JOptionPane.showInputDialog("Indica el tama�o tendra el array:");
		int cantidadNumeroInt = Integer.parseInt(cantidadNumeros);
		
		String min = JOptionPane.showInputDialog("Introduzca el valor minimo:");
		int minInt = Integer.parseInt(min);
		
		String max = JOptionPane.showInputDialog("Introduzca el valor m�ximo:");
		int maxInt = Integer.parseInt(max);
		
		int numeros[] = new int[cantidadNumeroInt];
		numeros = generarNumeroPrimoEnArray(numeros, cantidadNumeroInt, minInt, maxInt);
		
		mostarArray(numeros);
	}
	
	public static int[] generarNumeroPrimoEnArray(int[] array, int tama�o, int min, int max) {
		boolean arrayIncompleto = true;
        int contador = 0;
		
		while(arrayIncompleto) {
			
			int random = (int) (Math.random() * ((max - min) +1 )) + min;
	        int intentos = 0;
	        
	        for (int i = 2; i <= random; i++) {
				
				if(random %i == 0 && random != i) {
					intentos++;
				}
							
			}
					
			if(intentos == 0) {
				array[contador] = random;
				contador++;
			}
			
			if(array[(tama�o-1)] != 0) {
				arrayIncompleto = false;
			}
			
		}
        
		return array;
		
	}
	
	public static void mostarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("El indice " + (i+1) + " tiene el valor " + array[i]);
		}
	}
	
}
