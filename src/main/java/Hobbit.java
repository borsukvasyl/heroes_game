public class Hobbit extends GameCharacter {
    private static final int HP = 3,
            POWER = 0;

    public Hobbit() {
        setHp(HP);
        setPower(POWER);
    }

    public void toCry() {
        System.out.println("Don't kill me");
    }

    @Override
    public void kick(GameCharacter enemy) {
        toCry();
    }
}
