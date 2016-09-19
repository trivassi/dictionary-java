import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void clear() {
    Word.clear();
  }

  @Test
  public void word_createsInstance_true() {
    Word newWord = new Word("hey");
    assertEquals(true, newWord instanceof Word);
  }

  @Test
  public void word_getName_String() {
    Word newWord = new Word("hey");
    assertEquals("hey", newCD.getName());
  }

  @Test
  public void all_returnsAllInstancesOfRectangle_true() {
    Word firstWord = new Word("hey");
    Word secondWord = new Word("hello");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }
}
