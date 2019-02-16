import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPilaArrayL {
    @Test
    public void testSize() {
        PilaArrayL instance = new PilaArrayL();
        int expected = 0;
        int result = instance.size();
        assertEquals(expected, result);
    }
}
