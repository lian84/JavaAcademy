package es4;

public class ClientiLuce extends Clienti {
	private double costoKwh;
	private double kwConsumati;
	
	public ClientiLuce(String nome, String cognome,double kwConsumati) {
		super(nome, cognome);
		this.kwConsumati=kwConsumati;
	}

	public double getCostoKwh() {
		return costoKwh;
	}


	public void setCostoKwh(double costoKwh) {
		this.costoKwh = costoKwh;
	}


	public double getKwConsumati() {
		return kwConsumati;
	}
	
}
