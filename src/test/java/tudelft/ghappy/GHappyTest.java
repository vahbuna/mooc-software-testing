package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void defaultTests() {
        GHappy happy = new GHappy();
        Assertions.assertTrue(happy.gHappy("xxggxx"));
        Assertions.assertFalse(happy.gHappy("xxgxx"));
        Assertions.assertFalse(happy.gHappy("xxggyygxx"));
    }
}
