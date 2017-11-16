public class Main {
    public static void main(String[] args) {
        GameCharacter c1 = CharacterFactory.createCharacter();
        GameCharacter c2 = CharacterFactory.createCharacter();

        GameManager.fight(c1, c2);
    }
}
