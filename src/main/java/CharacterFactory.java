import java.util.Random;

public class CharacterFactory {
    public static GameCharacter createCharacter() {
        float n = new Random().nextFloat();

        if (n < 0.25) return new Hobbit();
        else if (n < 0.5) return new Elf();
        else if (n < 0.75) return new King();
        else return new Knight();
    }
}
