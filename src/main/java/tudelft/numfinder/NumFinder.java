package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) throws EmptySequenceException {
        if (nums == null || nums.length == 0)  {
            throw new EmptySequenceException("Sequence is null or empty!");
        }

        for (int n : nums) {
            if (n < smallest)
                smallest = n;
            if (n > largest)
                largest = n;
        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
