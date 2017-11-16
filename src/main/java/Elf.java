public class Elf extends GameCharacter {
    public Elf() {
        setHp(10);
        setPower(10);
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
