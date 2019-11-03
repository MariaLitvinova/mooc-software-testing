package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void testExactlyOneOccurence()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testMoreThanOneOccurence()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggxxgg");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testShortestHappyString()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("ggd");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testEmptyString()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testHappyStringWithoutG()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxxxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testUnhappyStringWithG()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xgxgxgxgx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testGroupOfHappyG()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gggggggg");
        Assertions.assertEquals(true, result);
    }
}
