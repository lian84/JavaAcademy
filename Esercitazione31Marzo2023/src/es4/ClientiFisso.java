package es4;

public class ClientiFisso extends Clienti {
	private String tipoCliente;
	private final String STANDARD="STANDARD";
	private final String SPECIAL="SPECIAL";
	private final String SUPERSPECIAL="SUPERSPECIAL";
	
	public ClientiFisso(String nome, String cognome, String tipoCliente) {
		super(nome, cognome);
		this.tipoCliente=tipoCliente;

	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public String getSTANDARD() {
		return STANDARD;
	}

	public String getSPECIAL() {
		return SPECIAL;
	}

	public String getSUPERSPECIAL() {
		return SUPERSPECIAL;
	}
	
	
	
	
}
