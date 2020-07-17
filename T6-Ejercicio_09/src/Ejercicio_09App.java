import javax.swing.JOptionPane;
public class Ejercicio_09App {
	
	/*Crea un array de números donde le indicamos por teclado el tamaño del array,
	rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el
	valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array
	(que tenga como parámetros los números entre los que tenga que generar), para mostrar el
	contenido y la suma del array y un método privado para generar número aleatorio (lo
	puedes usar para otros ejercicios).*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tamañoArray = JOptionPane.showInputDialog("Indique el tamaño del array:");
		int tamañoArrayInt = Integer.parseInt(tamañoArray);
		
		int numeros[] = new int[tamañoArrayInt];
		
		int minNum = 0;
		int maxNum = 9;
		
		numeros = rellenarArray(numeros, minNum, maxNum);
		mostrarNumeros(numeros);
	}
	
	public static int[] rellenarArray(int[] numeros, int minNum, int maxNum) {		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * ((maxNum - minNum) +1 )) + minNum;
		}
		
		return numeros;
	}
	
	public static void mostrarNumeros(int[] numeros) {
		int sumarArray = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			sumarArray += numeros[i];
			System.out.println(numeros[i]);
		}
		
		System.out.println("El total del array es: " + sumarArray);
		
	}

}
