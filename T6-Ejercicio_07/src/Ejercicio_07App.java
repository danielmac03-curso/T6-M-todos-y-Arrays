import javax.swing.JOptionPane;
public class Ejercicio_07App {
	
	/*Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra
	moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la
	cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
	mostrara un mensaje indicando el cambio (void).*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String[] moneda = {"Libras", "Dolares", "Yenes"};
		
		String cantidad = JOptionPane.showInputDialog("Cantidad de euros a convertir:");
		double cantidadInt = Double.parseDouble(cantidad);
		
		Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una moneda:", "Seleccion",  JOptionPane.DEFAULT_OPTION, null, moneda, "0");
		String seleccionString = seleccion.toString();
				
		convertirMoneda(cantidadInt, seleccionString);
	}
	
	public static void convertirMoneda(double cantidad, String seleccion) {		
		double cantidadNueva = 0;
		String monedaSimbolo = null;
		
		switch (seleccion) {
		case "Libras":
			cantidadNueva = cantidad * 0.86;
			monedaSimbolo = "libras";
			break;
		case "Dolares":
			cantidadNueva = cantidad * 1.28611;
			monedaSimbolo = "$";
			break;
		case "Yenes":
			cantidadNueva = cantidad * 129.852;
			monedaSimbolo = "yenes";
			break;
		}
		
		System.out.println(cantidad + " € " + "son " + cantidadNueva + " " + monedaSimbolo);		
	}

}
