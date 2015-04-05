package viaggi;

import static org.junit.Assert.*;

import org.junit.Test;

public class AvventuraTest extends PacchettoTest {

	@Test
	public void constructorDispersiException() {
		try {
			Avventura a = new Avventura(ID, descrizione, postiTotali, -1);
			fail("Eccezione attesa per dispersi non negativi");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Numero dispersi non può essere negativo");
		}
	}

}
