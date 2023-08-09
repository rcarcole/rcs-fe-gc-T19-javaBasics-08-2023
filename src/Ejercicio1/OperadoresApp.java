package Ejercicio1;

 public class OperadoresApp {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		int suma = a + b;
		int resta = a - b;
		int producto = a * b;
		double division = (double) a / b;
		double modulo = a % b;
		
		System.out.println("La resultado de la suma es: " +suma);
		System.out.println("La resultado de la resta es: " +resta);
		System.out.println("La resultado de la multiplicación es: " +producto);
		System.out.println("La resultado de la división es: " +division);
		System.out.println("La resultado del resto es: " +modulo);
	}
}