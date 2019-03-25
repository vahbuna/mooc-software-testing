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

}
