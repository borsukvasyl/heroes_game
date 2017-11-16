import java.util.Random;

public class CharacterFactory {
    public static GameCharacter createCharacter() {
        GameCharacter characters[] = new GameCharacter[] {new Hobbit(), new Elf(), new King(), new Knight()};
        Random rand = new Random();
        return characters[rand.nextInt(characters.length)];
    }
}
