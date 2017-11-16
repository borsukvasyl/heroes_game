import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HobbitTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Hobbit hobbit = new Hobbit();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void toCry() throws Exception {
        String expected = "Don't kill me\n".replaceAll("\\n|\\r\\n", System.getProperty("line.separator"));
        hobbit.toCry();
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void kick() throws Exception {
        String expected = "Don't kill me\n".replaceAll("\\n|\\r\\n", System.getProperty("line.separator"));
        hobbit.kick(new Hobbit());
        assertEquals(expected, outContent.toString());
    }
}
