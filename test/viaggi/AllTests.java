package viaggi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AvventuraTest.class, ClienteTest.class, PacchettoTest.class,
		PrenotazioneTest.class, ViaggioDiNozzeTest.class })
public class AllTests {

}
