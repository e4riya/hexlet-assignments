package exercise;

import java.util.stream.IntStream;

// BEGIN
public class ReversedSequence implements CharSequence{
    private String reversedSequence;
    public ReversedSequence(String reversedSequence){
        this.reversedSequence = new StringBuilder(reversedSequence).reverse().toString();
    }
    @Override
    public int length() {
        return reversedSequence.length();
    }

    @Override
    public char charAt(int index) {
        return reversedSequence.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return reversedSequence.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedSequence.subSequence(start,end);
    }

    @Override
    public IntStream chars() {
        return reversedSequence.chars();
    }

    @Override
    public String toString() {
        return reversedSequence;
    }

    @Override
    public IntStream codePoints() {
        return reversedSequence.codePoints();
    }
}
// END
