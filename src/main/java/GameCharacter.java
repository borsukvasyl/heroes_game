import java.util.Random;

abstract class GameCharacter {
    private int power;
    private int hp;

    public GameCharacter() { }

    abstract public void kick(GameCharacter enemy);

    public boolean isAlive() {
        return hp > 0;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int newPower) {
        if (newPower < 0) {
            power = 0;
        }
        else {
            power = newPower;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int newHp) {
        if (newHp < 0) {
            hp = 0;
        }
        else {
            hp = newHp;
        }
    }

    protected GameCharacter(int minHp, int maxHp, int minPower, int maxPower) {
        hp = new Random().nextInt(maxHp - minHp + 1) + minHp;
        power = new Random().nextInt(maxPower - minPower + 1) + minPower;
    }
}
