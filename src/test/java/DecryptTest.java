import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptTest {

    @Test
    public void decrypt_decryptMessage_String() throws Exception{
        Decrypt decrypt=new Decrypt();
        String result = "WKH";
        String enteredText = decrypt.Decrypt("The",3);
        assertEquals(result, enteredText);
    }
}
