public class Knight extends GameCharacter {
    private static int MIN_HP = 2, MAX_HP = 12, MIN_POWER = 2, MAX_POWER = 12;

    private KickBehavior kickBehavior = new Sword();

    public Knight() {
        super(MIN_HP, MAX_HP, MIN_POWER, MAX_POWER);
    }

    @Override
    public void kick(GameCharacter enemy) {
        kickBehavior.kick(this, enemy);
    }
}
