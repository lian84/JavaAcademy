package es4;

public class Clienti {
	private String nome;
	private String cognome;
	private static double prezzoDaPagare;
	
	public Clienti(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}

	public double getPrezzoDaPagare() {
		return prezzoDaPagare;
	}

	
	public static void clacolaBollette(Clienti cliente) {
		ClientiLuce cl=null;
		ClientiGas cg=null;
		ClientiFisso cf=null;
		ClientiMobile cm=null;
		
		if (cliente instanceof ClientiLuce) {
			cl=(ClientiLuce)cliente;
			if(cl.getKwConsumati()<=300) {
				prezzoDaPagare= cl.getKwConsumati()*0.25;
			}
			if(cl.getKwConsumati()>=300 && cl.getKwConsumati() <= 700) {
				prezzoDaPagare= cl.getKwConsumati()*0.18;
			}
			if(cl.getKwConsumati()>700) {
				prezzoDaPagare= cl.getKwConsumati()*0.15;
			}
		}
		
		if (cliente instanceof ClientiGas) {
			cg=(ClientiGas)cliente;
			if(cg.getMetricConsumati()<=50) {
				prezzoDaPagare= cg.getMetricConsumati();
			}
			if(cg.getMetricConsumati()>50 && cg.getMetricConsumati() <= 80) {
				prezzoDaPagare= cg.getMetricConsumati()*0.8;
			}
			if(cg.getMetricConsumati()>80) {
				prezzoDaPagare= cg.getMetricConsumati()*0.7;
			}
		}
		if (cliente instanceof ClientiFisso) {
			cf=(ClientiFisso)cliente;
			if(cf.getTipoCliente().equals(cf.getSTANDARD())) {
				prezzoDaPagare= 30;
			}
			if(cf.getTipoCliente().equals(cf.getSPECIAL() )) {
				prezzoDaPagare= 50;
			}
			if(cf.getTipoCliente().equals(cf.getSUPERSPECIAL() )) {
				prezzoDaPagare= 60;
			}
		}
		if (cliente instanceof ClientiMobile) {
			cm=(ClientiMobile)cliente;
			if(cm.getGigaByte()<=30){
				prezzoDaPagare= 8;
			}
			if(cm.getGigaByte()>30 && cm.getGigaByte()<=80) {
				prezzoDaPagare= 12;
			}
			if(cm.getGigaByte()>80) {
				prezzoDaPagare= 15;
			}
		}
	}
	

}
