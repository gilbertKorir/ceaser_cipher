import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    void encrypt_encryptMessage_String() throws Exception{
        Encrypt encrypt = new Encrypt();
        String expectedOutput="FCF";
        String output=encrypt.Encrypt("dad",2);
        assertEquals(expectedOutput,output);
    }

}