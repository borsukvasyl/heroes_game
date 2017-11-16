public class Main {
    public static void main(String[] args) {
        GameCharacter character1 = CharacterFactory.createCharacter();
        GameCharacter character2 = CharacterFactory.createCharacter();

        GameManager.fight(character1, character2);
    }
}
