import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class KnightTest {
    @Test
    public void kick() throws Exception {
        Hobbit hobbit = new Hobbit();
        Knight knight = new Knight();
        knight.kick(hobbit);
        while (hobbit.isAlive()) {
            knight.kick(hobbit);
        }
        assertFalse(hobbit.isAlive());
    }

}