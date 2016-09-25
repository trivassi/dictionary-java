import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition newDefinition = new Definition("hello");
    assertEquals(true, newDefinition instanceof Definition);
  }

  @Test
  public void Definition_getsName_true() {
    Definition newDefinition = new Definition("hello");
    assertEquals("hello", newDefinition.getName());
  }

  @Test
  public void all_returnsDefinitionList_true() {
    Definition firstDefinition = new Definition("hello");
    Definition secondDefinition = new Definition("hey");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void getId_returnsId_int() {
    Word newWord = new Word("hey");
    assertEquals(1, newWord.getId());
  }
}
