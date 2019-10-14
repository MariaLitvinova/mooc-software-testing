package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumFinderTest {
    @Test
    public void testDecreasingSequence() throws EmptySequenceException {
        NumFinder nf = new NumFinder();
        nf.find(new int[] {4, 3, 2, 1});

        Assertions.assertEquals(4, nf.getLargest());
        Assertions.assertEquals(1, nf.getSmallest());
    }

    @Test
    public void testEmptySequence() throws EmptySequenceException {
        NumFinder nf = new NumFinder();
        Throwable thrown = assertThrows(EmptySequenceException.class, () -> {
            nf.find(new int[] {});
        });
        assertNotNull(thrown.getMessage());
    }
}
