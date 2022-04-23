import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserTest {

    @Test
    public void check_if_output_right() throws Exception{
        Ceaser cipher=new Ceaser ("THE QUICK BROWN", 2);
        assertEquals(true,cipher instanceof Ceaser);
    }
}
