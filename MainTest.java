import org.junit.Test;
import static org.junit.Assert.*; 

public class MainTest {

  @Test
  public void testNothing(){}
  
  @Test
  public void testSomeStuff(){
   assertEquals("Addition fehlerhaft", 2+3, 5);
   String s = new String();
   assertNotNull("kein String vorhanden", s);
   assertTrue("Multiplikation fehlgeschlagen", 3*7 > 4*5);
  }

}
