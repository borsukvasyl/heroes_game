public class Elf extends GameCharacter {
    private static final int HP = 10,
            POWER = 10;

    public Elf() {
        setHp(HP);
        setPower(POWER);
    }

    @Override
    public void kick(GameCharacter enemy) {
        if (getPower() > enemy.getPower()) {
            enemy.setHp(0);
        }
        else {
            enemy.setPower(enemy.getPower() - 1);
        }
    }
}
