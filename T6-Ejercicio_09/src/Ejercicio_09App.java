import javax.swing.JOptionPane;
public class Ejercicio_09App {
	
	/*Crea un array de n�meros donde le indicamos por teclado el tama�o del array,
	rellenaremos el array con n�meros aleatorios entre 0 y 9, al final muestra por pantalla el
	valor de cada posici�n y la suma de todos los valores. Haz un m�todo para rellenar el array
	(que tenga como par�metros los n�meros entre los que tenga que generar), para mostrar el
	contenido y la suma del array y un m�todo privado para generar n�mero aleatorio (lo
	puedes usar para otros ejercicios).*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tama�oArray = JOptionPane.showInputDialog("Indique el tama�o del array:");
		int tama�oArrayInt = Integer.parseInt(tama�oArray);
		
		int numeros[] = new int[tama�oArrayInt];
		
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
