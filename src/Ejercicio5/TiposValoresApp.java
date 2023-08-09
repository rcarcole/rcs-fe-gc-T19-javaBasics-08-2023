package Ejercicio5;

public class TiposValoresApp {

	public static void main(String[] args) {
	    int A = 1;
	    int B = 2;
	    int C = 3;
	    int D = 4;

	    int Ainicial = A;
	    int Binicial = B;
	    int Cinicial = C;
	    int Dinicial = D;
	    B = Cinicial;
	    C = Ainicial;
	    A = Dinicial;
	    D = Binicial;

	    System.out.println("'B' tenía el valor de: " + Binicial + " y ahora toma el de 'C' que es: " + B);
	    System.out.println("'C' tenía el valor de: " + Cinicial + " y ahora toma el de 'A' que es: " + C);
	    System.out.println("'A' tenía el valor de: " + Ainicial + " y ahora toma el de 'D' que es: " + A);
	    System.out.println("'D' tenía el valor de: " + Dinicial + " y ahora toma el de 'B' que es: " + D);
	}
}