public class Main {
    public static void main(String[] args) {
        GameCharacter character = CharacterFactory.createCharacter();
        GameCharacter enemy = CharacterFactory.createCharacter();

        GameManager.fight(character, enemy);
    }
}
