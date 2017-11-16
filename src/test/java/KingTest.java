import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class KingTest {
    @Test
    public void kick() throws Exception {
        Hobbit hobbit = new Hobbit();
        King king = new King();
        while (hobbit.isAlive()) {
            king.kick(hobbit);
        }
        assertFalse(hobbit.isAlive());
    }
}
