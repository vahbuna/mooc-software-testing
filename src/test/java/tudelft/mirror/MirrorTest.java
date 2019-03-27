package tudelft.mirror;

import org.junit.jupiter.api.*;

public class MirrorTest {
    private Mirror mirror;

    @BeforeEach
    public void init() {
        mirror = new Mirror();
    }

    @Test
    public void mirrorTests() {
        Assertions.assertEquals("ab", mirror.mirrorEnds("abXYZba"));
        Assertions.assertEquals("a", mirror.mirrorEnds("abca"));
        Assertions.assertEquals("aba", mirror.mirrorEnds("aba"));
        Assertions.assertEquals("abba", mirror.mirrorEnds("abba"));
    }
}
