package veicoli;

public class Auto extends Veicolo {
	private int numeroPorte;

	public Auto(String targa, String modello, String marca, int numeroPosti) {
		super(targa, modello, marca, numeroPosti);
		
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	@Override
	public String toString() {
		return "Auto [targa=" + targa + ", modello=" + modello + ", marca=" + marca + ", numeroPosti=" + numeroPosti
				+", numeroPorte "+numeroPorte+"]";
	}


	
}
