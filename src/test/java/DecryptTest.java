import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void decrypt_decryptMessage_String() throws Exception{
        Decrypt decrypt=new Decrypt();
        String result = "WKH";
        String enteredText = decrypt.Decrypt("The",3);
        assertEquals(result, enteredText);
    }
}
