package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void testExactlyOneOccurence() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testMoreThanOneOccurences() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggxxgg");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testShortestHappyString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("ggd");
        Assertions.assertEquals(true, result);
    }
}
