import java.util.Random;

public class Sword  implements KickBehavior{
    @Override
    public void kick(GameCharacter character, GameCharacter enemy) {
        enemy.setHp(enemy.getHp() - new Random().nextInt(character.getPower() + 1));
    }
}
