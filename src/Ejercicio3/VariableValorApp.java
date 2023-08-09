package Ejercicio3;

public class VariableValorApp {

	public static void main(String[] args) {
		int X = 3;
		int Y = 5;
		double N = 1.5;
		double M = 2.5;
		
		int suma = X + Y;
		int resta = X - Y;
		int producto = X * Y;
		double cociente = X / Y;
		double resto = X % Y;
		double suma2 = N + M;
		double resta2 = N - M;
		double producto2 = N * M;
		double cociente2 = N / M;
		double resto2 = N % M;
		double suma3 = X + N;
		double cociente3 = Y / M;
		double resto3 = Y % M;
		
		int dobleX = X * 2;
		int dobleY = Y * 2;
		double dobleN = N * 2;
		double dobleM = M * 2;
		
		double sumatorio = X + Y + N + M;
		double multiplicador = X * Y * N * M;
		
		
		System.out.println("El valor de X es: " + X);
		System.out.println("El valor de Y es: " + Y);
		System.out.println("El valor de N es: " + N);
		System.out.println("El valor de M es: " + M);
		System.out.println("La suma de X + Y es: " + suma);
		System.out.println("La resta de X - Y es: " + resta);
		System.out.println("El producto de X * Y es: " + producto);
		System.out.println("El cociente de X / Y es: " + cociente);
		System.out.println("El resto de X % Y es: " + resto);
		System.out.println("La suma de N + M es: " + suma2);
		System.out.println("La resta de N - M es: " + resta2);
		System.out.println("El producto de N * M es: " + producto2);
		System.out.println("El cociente de N / M es: " + cociente2);
		System.out.println("El resto de N % M es: " + resto2);
		System.out.println("La suma de X + N es: " + suma3);
		System.out.println("El cociente de Y / M es: " + cociente3);
		System.out.println("El resto de Y % M es: " + resto3);
		System.out.println("El doble de X es: " + dobleX);
		System.out.println("El doble de Y es: " + dobleY);
		System.out.println("El doble de N es: " + dobleN);
		System.out.println("El doble de M es: " + dobleM);
		System.out.println("El sumatorio de X, Y, N, M es: " + sumatorio);
		System.out.println("El multiplicador de X, Y, N, M es: " + multiplicador);

		
	}
}