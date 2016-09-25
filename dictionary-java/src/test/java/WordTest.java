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
    assertEquals("hey", newWord.getName());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("hey");
    Word secondWord = new Word("hello");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void returnsId_int() {
    Word newWord = new Word("hey");
    assertEquals(1, newWord.getId());
  }

  @Test
  public void getDefinitions_returnsDefinitionsArrayList_0() {
    Word newWord = new Word("hey");
    assertEquals(0, newWord.getDefinitions().size());
  }

  @Test
  public void addsDefinitiontoList_true() {
    Word newWord = new Word("hey");
    Definition testDefinition = new Definition("hello");
    newWord.addDefinition(testDefinition);
    assertTrue(newWord.getDefinitions().contains(testDefinition));
  }

  @Test
  public void findWord_Word() {
    Word newWord = new Word("hey");
    assertEquals(newWord, Word.find(newWord.getId()));
  }

  @Test
  public void ListClearsCorrectly_0(){
    Word newWord = new Word("hey");
    Word.clear();
    assertEquals(0, Word.all().size());
  }

}
