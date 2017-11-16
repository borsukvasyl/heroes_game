public class GameManager {
    public static void fight(GameCharacter c1, GameCharacter c2) {
        if (c1.getClass().equals(c2.getClass())
                && (c1.getClass().equals(Hobbit.class) || c2.getClass().equals(Elf.class))) {
            System.out.println("Draw");
            return;
        }

        GameCharacter gameCharacterCopy;

        System.out.println(String.format("%s: hp=%d, power=%d", c1.getClass().getName(), c1.getHp(), c1.getPower()));
        System.out.println(String.format("%s: hp=%d, power=%d\n", c2.getClass().getName(), c2.getHp(), c2.getPower()));

        while (true) {
            System.out.println(String.format("%s attacks %s", c1.getClass().getName(), c2.getClass().getName()));
            c1.kick(c2);
            System.out.println(String.format("%s hp=%d", c2.getClass().getName(), c2.getHp()));

            if (!c2.isAlive()) {
                System.out.println(String.format("%s wins",c1.getClass().getName()));
                return;
            }

            gameCharacterCopy = c1;
            c1 = c2;
            c2 = gameCharacterCopy;
        }
    }
}
