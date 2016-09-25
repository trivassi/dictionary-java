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
    Definition newDefinition = new Definition("hello");
    assertEquals(1, newDefinition.getId());
  }

  @Test
  public void all_ClearsCorrectly_0(){
    Definition newDefinition = new Definition("hello");
    Definition.clear();
    assertEquals(0, Definition.all().size());
  }

  @Test
  public void all_instancesListClearsCorrectly_0(){
    Definition.clear();
    assertEquals(0, Definition.all().size());
  }

  @Test
  public void findDefinition_Definition() {
    Definition newDefinition = new Definition("hello");
    assertEquals(newDefinition, Definition.find(newDefinition.getId()));
  }
}
