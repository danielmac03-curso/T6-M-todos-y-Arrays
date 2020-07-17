import javax.swing.JOptionPane;
public class Ejercicio_12 {
	
	/*Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
	n�meros aleatorios entre 1 y 300 y mostrar� aquellos n�meros que acaben en un d�gito que
	nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
	estos deben guardarse en un nuevo array.
	Por ejemplo, en un array de 10 posiciones le indicamos mostrar los n�meros acabados en 5,
	podr�a salir 155, 25, etc*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tama�oArray = JOptionPane.showInputDialog("Indica el tama�o del array:");
		int tama�oArrayInt = Integer.parseInt(tama�oArray);
		
		String digito = JOptionPane.showInputDialog("Indica que digito debe acabar el numero para ser guardado:");
		int digitoInt = Integer.parseInt(digito);
		
		int minInt = 1;
		
		int maxInt = 30;
		
		int arrayNumerosAleatorios[] = new int[300];		
		arrayNumerosAleatorios = generarNumerosAleatorios(arrayNumerosAleatorios, minInt, maxInt);
		
		int tama�oArrayConFiltro = totalArrayConFiltro(arrayNumerosAleatorios, digitoInt, tama�oArrayInt);
		
		int arrayFiltrado[] = new int[tama�oArrayConFiltro];
		arrayFiltrado = filtrarArrayPorDigito(arrayNumerosAleatorios, digitoInt, tama�oArrayConFiltro);
		
		mostarArray(arrayFiltrado);
	}
	
	public static int[] generarNumerosAleatorios(int[] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * ((max - min) +1 )) + min;
			array[i] = random;
		}
		
		return array;
	}
	
	public static int totalArrayConFiltro(int[] array, int filtro, int tama�o) {
		int resultado = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] %10 == filtro && resultado < tama�o) {
				resultado++;
			}	
		}
		
		return resultado;
	}
		
	
	public static int[] filtrarArrayPorDigito (int[] array, int filtro, int tama�o) {
		int resultado[] = new int[tama�o];
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] %10 == filtro && contador < tama�o) {
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
