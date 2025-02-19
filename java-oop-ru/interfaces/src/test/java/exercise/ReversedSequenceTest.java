package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedSequenceTest {

    @Test
    void testReversedSequence(){
        assertEquals("dcba",new ReversedSequence("abcd").toString());
    }
}
