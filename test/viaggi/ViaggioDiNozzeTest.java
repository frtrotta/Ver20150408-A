package viaggi;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViaggioDiNozzeTest extends PacchettoTest {

	@Test
	public void constructorDivorziException() {
		try {
			ViaggioDiNozze a = new ViaggioDiNozze(ID, descrizione, postiTotali, -1);
			fail("Eccezione attesa per divorzi non negativi");
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Numero divorzi non può essere negativo");
		}
	}

}
