package viaggi;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {
	private final String nome = "Ciccio";
	private final String cognome = "Formaggio";
	private final String email = "ciccio@formaggio.com";

	@Test
	public void constructorNomeException() {
		try {
			Cliente c = new Cliente("", cognome, email);
			fail("Eccezione attesa per nome di lunghezza 0");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Lunghezza nome deve essere maggiore di 0");
		}
	}

	@Test
	public void constructorCognomeException() {
		try {
			Cliente c = new Cliente(nome, "", email);
			fail("Eccezione attesa per cognome di lunghezza 0");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Lunghezza cognome deve essere maggiore di 0");
		}
	}
	
	@Test
	public void constructorEmailException() {
		try {
			Cliente c = new Cliente(nome, cognome, "");
			fail("Eccezione attesa per email di lunghezza 0");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Lunghezza email deve essere maggiore di 0");
		}
	}

}
