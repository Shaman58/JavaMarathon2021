package day7;

public class Player {
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA)
                countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", (6 - countPlayers));
        else System.out.println("На поле нет свободных мест");
    }
}
