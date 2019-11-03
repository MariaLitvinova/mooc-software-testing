package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void testPositiveShiftByLessThan26()
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encodedString = cipher.CaesarShiftCipher("abc", 1);

        Assertions.assertEquals("bcd", encodedString);
    }

    @Test
    public void testPositiveShiftByMoreThan26()
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encodedString = cipher.CaesarShiftCipher("abc", 27);

        Assertions.assertEquals("bcd", encodedString);
    }

    @Test
    public void testPositiveShiftByExactly26()
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encodedString = cipher.CaesarShiftCipher("abc", 26);

        Assertions.assertEquals("abc", encodedString);
    }

    @Test
    public void testStringWithSpaces()
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encodedString = cipher.CaesarShiftCipher("a b c", 26);

        Assertions.assertEquals("a b c", encodedString);
    }

    @Test
    public void testEmptyString()
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encodedString = cipher.CaesarShiftCipher("", 26);

        Assertions.assertEquals("", encodedString);
    }

    @Test
    public void testInvalidString()
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encodedString = cipher.CaesarShiftCipher("qqq1114444", 26);

        Assertions.assertEquals("invalid", encodedString);
    }

    @Test
    public void testNegativeShift()
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encodedString = cipher.CaesarShiftCipher("bcd", -1);

        Assertions.assertEquals("abc", encodedString);
    }
}
