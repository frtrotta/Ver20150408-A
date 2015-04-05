package ver20150408_a;

import viaggi.*;

public class Ver20150408_A {

	public static void main(String[] args) throws Exception {
		Avventura a = new Avventura("a1", "Un pacchetto di avventura", 5, 10);

		Cliente c = new Cliente("Ciccio", "Formaggio", "ciccio@formaggio.com");
		
		Prenotazione p = new Prenotazione("p1", c, 2);
		a.addPrenotazione(p);
		System.out.println("Prenotazioni: " + a.getPrenotazioni().size());
		p = new Prenotazione("p2", c, 1);
		a.addPrenotazione(p);
		System.out.println("Prenotazioni: " + a.getPrenotazioni().size());
		try {
			p = new Prenotazione("p3", c, 4);
			throw new Exception("Eccezione non lanciata");
		}
		catch (Exception e) {
			System.out.println("Prenotazione non aggiunta");
			System.out.println("Prenotazioni: " + a.getPrenotazioni().size());
		}
	}

}
