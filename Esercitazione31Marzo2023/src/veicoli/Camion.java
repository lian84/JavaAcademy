package veicoli;

public class Camion extends Veicolo {
	private int numeroRuote;

	public Camion(String targa, String modello, String marca, int numeroPosti) {
		super(targa, modello, marca, numeroPosti);
	}

	@Override
	public String toString() {
		return "Camion [targa=" + targa + ", modello=" + modello + ", marca=" + marca + ", numeroPosti=" + numeroPosti
				+", numeroRuote "+numeroRuote+"]";
	}

	

}
