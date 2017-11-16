public class King extends GameCharacter {
    private static int MIN_HP = 5, MAX_HP = 15, MIN_POWER = 5, MAX_POWER = 15;

    private KickBehavior kickBehavior = new Sword();

    public King() {
        super(MIN_HP, MAX_HP, MIN_POWER, MAX_POWER);
    }

    @Override
    public void kick(GameCharacter enemy) {
        kickBehavior.kick(this, enemy);
    }
}
