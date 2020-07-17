import javax.swing.JOptionPane;
public class Ejercicio_11 {

	/*Crea dos arrays de n�meros con la dimensi�n pasada por teclado.
	Uno de ellos estar� rellenado con n�meros aleatorios y el otro apuntara al array anterior,
	reasigna los valores del segundo array con valores aleatorios.
	Despu�s, crea un m�todo que tenga como par�metros, los dos arrays y devuelva uno nuevo
	con la multiplicaci�n de la posici�n 0 del array1 con el del array2 y as� sucesivamente.
	Por �ltimo, muestra el contenido de cada array.*/
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String tama�oArray = JOptionPane.showInputDialog("Indica el tama�o que tendra el array:");
		int tama�oArrayInt = Integer.parseInt(tama�oArray);
		
		int array1[] = new int[tama�oArrayInt];	
		int array2[] = new int[tama�oArrayInt];
		
		array1 = rellenarArrayAleatoriamente(array1);
		array2 = rellenarArrayAleatoriamente(array2);
		
		int[] arrayFinal = multiplicacionEntreArrays(array1, array2);
		mostarArray(arrayFinal);	
	}
	
	public static int[] rellenarArrayAleatoriamente(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random()*100);
			array[i] = random;
		}
		
		return array;	
	}
	
	public static int[] multiplicacionEntreArrays(int[] array1, int[] array2) {
		int resultado[] = new int[(array1.length)];
		
		for (int i = 0; i < array1.length; i++) {
			resultado[i] = array1[i] * array2[i];
		}
		
		return resultado;
	}
	
	public static void mostarArray (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("El indice " + (i+1) + " tiene el valor " + array[i]);
		}
	}

}
