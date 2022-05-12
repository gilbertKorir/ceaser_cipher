import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptTest {
    @Test
    public void decrypt_decryptMessage_String() throws Exception{
        Encrypt encrypt = new Encrypt();
        String result = "QEB";
        String enteredText = encrypt.Encrypt("THE",3);
        assertEquals(result, enteredText);
    }

    @Test
    public void newEncrypt_createInstanceOfEncrypt_true() throws Exception{
        Encrypt encrypt = new Encrypt();
        String output = encrypt.Encrypt("THE QUICK BROWN", 3);
        assertEquals(true,output instanceof String);
    }
}
