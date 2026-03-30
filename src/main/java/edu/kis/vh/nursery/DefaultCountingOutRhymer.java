package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int MAX_INDEX = CAPACITY - 1;
    public static final int EMPTY_INDICATOR = -1;
    public static final int DEFAULT_RETURN = -1;

    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_INDICATOR;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return getTotal() == EMPTY_INDICATOR;
    }

    public boolean isFull() {
        return getTotal() == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total--];
    }

}