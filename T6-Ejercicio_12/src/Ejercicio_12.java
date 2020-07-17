import javax.swing.JOptionPane;
public class Ejercicio_12 {
	
	/*Crea un array de números de un tamaño pasado por teclado, el array contendrá
	números aleatorios entre 1 y 300 y mostrará aquellos números que acaben en un dígito que
	nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
	estos deben guardarse en un nuevo array.
	Por ejemplo, en un array de 10 posiciones le indicamos mostrar los números acabados en 5,
	podría salir 155, 25, etc*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tamañoArray = JOptionPane.showInputDialog("Indica el tamaño del array:");
		int tamañoArrayInt = Integer.parseInt(tamañoArray);
		
		String digito = JOptionPane.showInputDialog("Indica que digito debe acabar el numero para ser guardado:");
		int digitoInt = Integer.parseInt(digito);
		
		int minInt = 1;
		
		int maxInt = 30;
		
		int arrayNumerosAleatorios[] = new int[300];		
		arrayNumerosAleatorios = generarNumerosAleatorios(arrayNumerosAleatorios, minInt, maxInt);
		
		int tamañoArrayConFiltro = totalArrayConFiltro(arrayNumerosAleatorios, digitoInt, tamañoArrayInt);
		
		int arrayFiltrado[] = new int[tamañoArrayConFiltro];
		arrayFiltrado = filtrarArrayPorDigito(arrayNumerosAleatorios, digitoInt, tamañoArrayConFiltro);
		
		mostarArray(arrayFiltrado);
	}
	
	public static int[] generarNumerosAleatorios(int[] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * ((max - min) +1 )) + min;
			array[i] = random;
		}
		
		return array;
	}
	
	public static int totalArrayConFiltro(int[] array, int filtro, int tamaño) {
		int resultado = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] %10 == filtro && resultado < tamaño) {
				resultado++;
			}	
		}
		
		return resultado;
	}
		
	
	public static int[] filtrarArrayPorDigito (int[] array, int filtro, int tamaño) {
		int resultado[] = new int[tamaño];
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] %10 == filtro && contador < tamaño) {
				resultado[contador] = array[i];
				contador++;
			}	
		}
		
		return resultado;
	}
	
	public static void mostarArray (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("El indice " + (i+1) + " tiene el valor " + array[i]);
		}
	}
	
}
