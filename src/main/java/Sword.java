import java.util.Random;

public class Sword  implements KickBehavior{
    @Override
    public void kick(GameCharacter c1, GameCharacter c2) {
        c2.setHp(c2.getHp() - new Random().nextInt(c1.getPower() + 1));
    }
}
