import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptTest {
    @Test
    public void newEncrypt_createInstanceOfEncrypt_true() throws Exception{
        Decrypt decrypt = new Decrypt();
        String output = decrypt.Decrypt("THE QUICK BROWN", 3);
        assertEquals(true,output instanceof String);
    }

    @Test
    public void decrypt_decryptMessage_String() throws Exception{
        Decrypt decrypt=new Decrypt();
        String result = "WKH";
        String enteredText = decrypt.Decrypt("The",3);
        assertEquals(result, enteredText);
    }
}