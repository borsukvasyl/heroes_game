public class Hobbit extends GameCharacter {
    public Hobbit() {
        setHp(3);
        setPower(0);
    }

    public void toCry() {
        System.out.println("Don't kill me");
    }

    @Override
    public void kick(GameCharacter enemy) {
        toCry();
    }
}
