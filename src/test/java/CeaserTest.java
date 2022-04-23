import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserTest {

    @Test
    public void check_if_output_right() throws Exception{
        Ceaser cipher=new Ceaser ("THE QUICK BROWN", 2);
        assertEquals(true,cipher instanceof Ceaser);
    }
//getting the key
    @Test
    public void newCaesar_checkKey_4(){
        Ceaser testCaesar = new Ceaser ("a",4);
        assertEquals(4,testCaesar.getmKey());
    }
    //getting the text in capita letters
    @Test
    public void newCaesar_check_theText(){
        Ceaser testCaesar = new Ceaser ("The quick brown",1);
        assertEquals("THE QUICK BROWN",testCaesar.getmMessage());
    }
}
