import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ElfTest {
    @Test
    public void kick() throws Exception {
        Hobbit hobbit = new Hobbit();
        Elf elf = new Elf();
        elf.kick(hobbit);
        assertFalse(hobbit.isAlive());
    }
}
