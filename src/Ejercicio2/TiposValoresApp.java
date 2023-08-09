package Ejercicio2;

public class TiposValoresApp {

	public static void main(String[] args) {
		int N = 5;
		double A = 2.5;
		char C = 'h';
		
		System.out.println("El valor de 'N' es: " +N);
		System.out.println("El valor de 'A' es: " +A);
		System.out.println("El valor de 'C' es: " +C);

		double suma = N + A;
		double resta = A - N;
		int valorNumerico = (int) C;
		
		System.out.println("La suma de 'N' + 'A' es: " +suma);
		System.out.println("El diferencia de 'A' - 'N' es: " +A);
		System.out.println("El valor numérico correspondiente a 'C'("+C+") es: " +valorNumerico);
		
	}
	

}
