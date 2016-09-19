import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition newDefinition = new Definition("hello");
    assertEquals(true, newDefinition instanceof Definition);
  }

  @Test
  public void Definition_getsDefinition_true() {
    Definition newDefinition = new Definition("hello");
    assertEquals("hello", newDefinition.getDefinition());
  }
}
