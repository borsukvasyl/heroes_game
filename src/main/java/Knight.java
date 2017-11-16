public class Knight extends GameCharacter {
    private KickBehavior kickBehavior = new Sword();

    public Knight() {
        super(2, 12, 2, 12);
    }

    @Override
    public void kick(GameCharacter enemy) {
        kickBehavior.kick(this, enemy);
    }
}
