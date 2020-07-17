import javax.swing.JOptionPane;
public class Ejercicio_01App {
	
	/*Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos
	que figura queremos calcular su área y según lo introducido pedirá los valores necesarios
	para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá
	un número real. Muestra el resultado por pantalla.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double PI = 3.14;
		double resultado = 0;
		String[] figura = {"Circulo" , "Triangulo", "Cuadrado"};
		Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una figura:", "Seleccion",  JOptionPane.DEFAULT_OPTION, null, figura, "0");
		
		if(seleccion.equals(figura[0])) {			
			String parametro1 = JOptionPane.showInputDialog("Introduzca el radio del circulo:");
			double parametro1Double = Double.parseDouble(parametro1);
			
			resultado = circulo(parametro1Double, PI);
		}else if(seleccion.equals(figura[1])) {			
			String parametro1 = JOptionPane.showInputDialog("Introduzca la base del tringulo:");
			double parametro1Double = Double.parseDouble(parametro1);

			String parametro2 = JOptionPane.showInputDialog("Introduzca la altura del trinagulo:");			
			double parametro2Double = Double.parseDouble(parametro2);
			
			resultado = triangulo(parametro1Double, parametro2Double);
		}else if(seleccion.equals(figura[2])) {			
			String parametro1 = JOptionPane.showInputDialog("Introduzca la medido de un lado del cuadrado:");
			double parametro1Double = Double.parseDouble(parametro1);
			
			resultado = cuadrado(parametro1Double);
		}
		
		System.out.println("El area del " + seleccion + " es igual a " + resultado);		
	}
	
	public static double circulo(double parametro1Double, double PI){			
		double resultado = (Math.pow(parametro1Double, 2)) * PI;			
		return resultado;			
	}
	
	public static double triangulo(double parametro1Double, double parametro2Double){		
		double resultado = (parametro1Double * parametro1Double) / 2;		
		return resultado;		
	}
	
	public static double cuadrado(double parametro1Double){	
		double resultado = parametro1Double * parametro1Double;		
		return resultado;
	}

}
