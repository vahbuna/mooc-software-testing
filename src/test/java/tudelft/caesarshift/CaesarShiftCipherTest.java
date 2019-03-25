package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
        
public class CaesarShiftCipherTest {
    private CaesarShiftCipher cipher;
    
    @BeforeEach
    public void setupObject() {
        cipher = new CaesarShiftCipher();
    }
    
    @Test
    public void smallJump() {
        Assertions.assertEquals("fghi", cipher.CaesarShiftCipher("abcd", 5));
    
    }
    
    @Test
    public void noJump() {
        Assertions.assertEquals("temp", cipher.CaesarShiftCipher("temp", 0));
    }
    
    @Test
    public void smallReverseJump() {
        Assertions.assertEquals("abcd", cipher.CaesarShiftCipher("fghi", -5));
    }
    
    @Test
    public void cycle() {
        Assertions.assertEquals("temp", cipher.CaesarShiftCipher("temp", 26));
    }

    @Test
    public void invalid() {
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("TEMP", 26));
    }

    @Test
    public void smallJumpCycle() {
        Assertions.assertEquals("zab", cipher.CaesarShiftCipher("xyz", 2));
    }

    @Test
    public void smallReverseJumpCycle() {
        Assertions.assertEquals("xyz", cipher.CaesarShiftCipher("zab", -2));
    }
}
