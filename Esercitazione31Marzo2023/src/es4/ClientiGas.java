package es4;

public class ClientiGas extends Clienti {
	private int metricConsumati;
	
	
	public ClientiGas(String nome, String cognome, int metricConsumati) {
		super(nome, cognome);
		this.metricConsumati = metricConsumati;
	}

	public int getMetricConsumati() {
		return metricConsumati;
	}	
	
}
