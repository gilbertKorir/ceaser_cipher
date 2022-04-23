import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void newEncrypt_createInstanceOfEncrypt_true() throws Exception{
        Encrypt encrypt=new Encrypt();
        String output=encrypt.Encrypt("THE QUICK BRWON", 3);
        assertEquals(true,output instanceof String);
    }
}