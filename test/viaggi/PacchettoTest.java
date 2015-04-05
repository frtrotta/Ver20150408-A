package viaggi;

import static org.junit.Assert.*;

import org.junit.Test;

public class PacchettoTest {
	protected String ID = "id";
	protected String descrizione = "Un bel pacchetto di viaggio";
	protected int postiTotali = 5;
	
	@Test
	public void constructorIDException() {
		try {
			Pacchetto p = new Pacchetto("", descrizione, postiTotali);
			fail("Eccezione attesa per id di lunghezza 0");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Lunghezza ID deve essere maggiore di 0");
		}
	}
		
	@Test
	public void constructorDescrizioneException() {
		try {
			Pacchetto p = new Pacchetto(ID, "", postiTotali);
			fail("Eccezione attesa per descrizione di lunghezza 0");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Lunghezza descrizione deve essere maggiore di 0");
		}
	}
	
	@Test
	public void constructorPostiTotaliException() {
		try {
			Pacchetto p = new Pacchetto(ID, descrizione, 0);
			fail("Eccezione attesa per posti totali maggiori di 0");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Posti totali deve essere maggiore di 0");
		}
	}
	
	@Test
	public void postiDisponibili() throws Exception {
		final int postiTotali = 40;
		final int postiRichiesti = 10;
		Pacchetto p = new Pacchetto(ID, descrizione, postiTotali);
		Cliente c = new Cliente("Ciccio", "Formaggio", "ciccio@formaggio.com");
		for(int i=0; i<postiRichiesti; i++) {
			p.addPrenotazione(new Prenotazione("id" + i, c, 1));
		}
		assertEquals(p.getPostiDisponibili(), postiTotali - postiRichiesti);
	}
		
	@Test
	public void postiNonDisponibili() throws Exception {
		final int postiTotali = 40;
		final int postiRichiesti = 40;
		Pacchetto p = new Pacchetto(ID, descrizione, postiTotali);
		Cliente c = new Cliente("Ciccio", "Formaggio", "ciccio@formaggio.com");
		for(int i=0; i<postiRichiesti; i++) {
			p.addPrenotazione(new Prenotazione("id" + i, c, 1));
		}
		try {
			p.addPrenotazione(new Prenotazione("id-overflow", c, 1));
			fail("Attesa eccezione posti non diponibili");
		}
		catch(Exception e) {
			assertEquals(e.getMessage(), "Posti disponibili (0) non sufficienti per i posti richiesti (1).");
		}
		
		
	}
}
