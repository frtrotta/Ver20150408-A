package viaggi;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrenotazioneTest {
	private final String ID = "id";
	private final Cliente cliente = new Cliente("Ciccio", "Formaggio", "ciccio@formaggio.com");
	private int posti = 17;
	
	@Test
	public void constructorIDException() {
		try {
			Prenotazione p = new Prenotazione("", cliente, posti);
			fail("Eccezione attesa per id di lunghezza 0");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Lunghezza ID deve essere maggiore di 0");
		}
	}
	
	@Test
	public void constructorClientException() {
		try {
			Prenotazione p = new Prenotazione(ID, null, posti);
			fail("Eccezione attesa per cliente non null");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Cliente non può essere null");
		}
	}
	
	@Test
	public void constructorPostiException() {
		try {
			Prenotazione p = new Prenotazione(ID, cliente, 0);
			fail("Eccezione attesa per posti non postivi");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Posti deve essere maggiore di 0");
		}
	}

}
