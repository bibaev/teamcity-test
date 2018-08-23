import org.junit.Test;

import static org.junit.Assert.*;

public class MathImplTest {
    private static final Math INSTANCE = new MathImpl();

    @Test
    public void sum() {
        assertEquals(10, INSTANCE.sum(4, 6));
    }
}