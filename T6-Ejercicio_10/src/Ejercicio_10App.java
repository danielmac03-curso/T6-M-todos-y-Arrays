import javax.swing.JOptionPane;

public class Ejercicio_10App {

	/*Crea un array de números de un tamaño pasado por teclado, el array contendrá
	números aleatorios primos entre los números deseados, por último nos indicar cual es el
	mayor de todos.
	Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
	métodos que necesites.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cantidadNumeros = JOptionPane.showInputDialog("Indica el tamaño tendra el array:");
		int cantidadNumeroInt = Integer.parseInt(cantidadNumeros);
		
		String min = JOptionPane.showInputDialog("Introduzca el valor minimo:");
		int minInt = Integer.parseInt(min);
		
		String max = JOptionPane.showInputDialog("Introduzca el valor màximo:");
		int maxInt = Integer.parseInt(max);
		
		int numeros[] = new int[cantidadNumeroInt];
		numeros = generarNumeroPrimoEnArray(numeros, cantidadNumeroInt, minInt, maxInt);
		
		mostarArray(numeros);
	}
	
	public static int[] generarNumeroPrimoEnArray(int[] array, int tamaño, int min, int max) {
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
			
			if(array[(tamaño-1)] != 0) {
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
