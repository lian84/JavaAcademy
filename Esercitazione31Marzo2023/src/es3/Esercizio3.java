package es3;

public class Esercizio3 {

	public static void main(String[] args) {
		
		int numeri [] = {3,22,4,52,34,56};
		metodo(numeri);
		
	}
	
	public static void metodo(int... numeri) {
		for (int i=numeri.length-1; i>=0; i--) {
			System.out.print(numeri[i]+" ");
		}
	}

}
