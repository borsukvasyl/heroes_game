import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GameCharacterTest {
    private class TesterCharacter extends GameCharacter {
        @Override
        public void kick(GameCharacter enemy) {

        }
    }

    private GameCharacter character = new TesterCharacter();

    @Test
    public void isAlive() throws Exception {
        character.setHp(5);
        assertTrue(character.isAlive());
        character.setHp(0);
        assertFalse(character.isAlive());
    }

    @Test
    public void powerGetterAndSetter() throws Exception {
        character.setPower(12);
        assertEquals(12, character.getPower());
        character.setPower(-2);
        assertEquals(0, character.getPower());
    }

    @Test
    public void hpSetterAndGetter() throws Exception {
        character.setHp(12);
        assertEquals(12, character.getHp());
        character.setHp(-1);
        assertEquals(0, character.getHp());
    }
}