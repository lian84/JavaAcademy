package veicoli;

public class TestVeicoli {

	public static void main(String[] args) {
		Veicolo [] veicolo = new Veicolo[6];
			veicolo[0]= new Auto ("ab002cd", "Fiat", "Panda", 5);
			veicolo[1]= new Auto ("ab022cd", "Fiat", "Punto", 3);
			veicolo[2]= new Auto ("ab232cd", "Fiat", "Palio", 5);
			veicolo[3]= new Camion ("ab123cd", "Scania", "Uno", 6);
			veicolo[4]= new Camion ("ab223cd", "Man", "tre", 8);
			veicolo[5]= new Camion ("ab554cd", "Scania", "Quattro", 4);
			
			for (Veicolo vec : veicolo) {
				System.out.println(vec.toString());
			}
	}

}
