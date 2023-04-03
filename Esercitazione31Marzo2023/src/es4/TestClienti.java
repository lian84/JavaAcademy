package es4;

public class TestClienti {

	public static void main(String[] args) {
		Clienti [] cliente = new Clienti[10];
		cliente[0]= new ClientiLuce("Antonio", "Rossi", 530);
		cliente[1]= new ClientiLuce("Lucio", "Rossi", 100);
		cliente[2]= new ClientiGas("Marco", "Rossi", 300);
		cliente[3]= new ClientiGas("Giuseppe", "Rossi", 120);
		cliente[4]= new ClientiGas("Valerio", "Rossi", 150);
		cliente[5]= new ClientiFisso("Luca", "Rossi", "STANDARD");
		cliente[6]= new ClientiFisso("Maria", "Rossi", "SPECIAL");
		cliente[7]= new ClientiFisso("Piero", "Rossi", "SUPERSPECIAL");
		cliente[8]= new ClientiMobile("Lello", "Rossi", 20);
		cliente[9]= new ClientiMobile("Carmine", "Rossi", 90);

		

		for (Clienti st : cliente) {
			Clienti.clacolaBollette(st);
			p("Il cliente "+ st.getNome()+" "+st.getCognome() +" dovrá pagare "+st.getPrezzoDaPagare()+" Euro");
		}
	}
	
	public static void p (Object p) {
		System.out.println(p);
	}

}
