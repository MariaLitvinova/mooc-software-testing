package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordDoesMatch()
    {
        int words = new CountLetters().count("cats|horror");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void noWordsMatch()
    {
        int words = new CountLetters().count("dog|fig");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void firstWprdMatches()
    {
        int words = new CountLetters().count("horror|fig");
        Assertions.assertEquals(1, words);
    }
}