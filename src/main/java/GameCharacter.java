import java.util.Random;

abstract class GameCharacter {
    private int power;
    private int hp;

    public GameCharacter() {}

    protected GameCharacter(int min_hp, int max_hp, int min_power, int max_power){
            hp = new Random().nextInt(max_hp - min_hp + 1) + min_hp;
            power = new Random().nextInt(max_power - min_power + 1) + min_power;
    }

    abstract public void kick(GameCharacter enemy);

    boolean isAlive() {
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
}
