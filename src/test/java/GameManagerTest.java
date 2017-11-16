import org.junit.Test;

public class GameManagerTest {
    @Test
    public void fight() throws Exception {
        GameCharacter hobbit = new Hobbit();
        GameCharacter elf = new Elf();
        GameCharacter knight = new Knight();
        GameCharacter king = new King();

        GameManager.fight(elf, hobbit);
        GameManager.fight(hobbit, hobbit);
        GameManager.fight(knight, king);

        GameManager.fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }

}