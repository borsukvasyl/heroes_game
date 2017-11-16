public class King extends GameCharacter {
    private KickBehavior kickBehavior = new Sword();

    public King() {
        super(5, 15, 5, 15);
    }

    @Override
    public void kick(GameCharacter enemy) {
        kickBehavior.kick(this, enemy);
    }
}
