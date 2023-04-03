package es2;

public class Esercizio2 {

	public static void main(String[] args) {
		int numeri [] = {-3,22,4,52,34,56};
		pariPositivi(numeri);
		
		
	}
	
	public static void pariPositivi(int[] numeri){
		int pari=0;
		int positivi=0;
		for(int i=0; i< numeri.length; i++) {
			if (numeri[i]%2 == 0) pari=pari+1;
			if (numeri[i]>0) positivi=positivi+1;
		}
		if (pari == numeri.length && positivi == numeri.length)
			{System.out.println("Ci sono tutti numeri pasi positivi");
		}else if(pari == numeri.length && positivi != numeri.length)
			{System.out.println("Ci sono tutti numeri pari ma non tutti positivi");
		}else if(pari != numeri.length && positivi == numeri.length)
			{System.out.println("Ci sono tutti numeri positivi ma non tutti pari");
		}else if(pari != numeri.length && positivi != numeri.length)
			{System.out.println("I numeri non sono tutti pari e positivi");
			}
			
		
	}

}
