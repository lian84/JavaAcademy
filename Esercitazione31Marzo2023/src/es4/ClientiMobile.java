package es4;

public class ClientiMobile extends Clienti {
	private int gigaByte;

	public ClientiMobile(String nome, String cognome, int gigaByte) {
		super(nome, cognome);
		this.gigaByte=gigaByte;
	}

	public int getGigaByte() {
		return gigaByte;
	}

	
}
