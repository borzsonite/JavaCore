package JavaMarafon.Day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.info();
        for (int i = player1.getStamina(); i > 0; i--) {
            player1.run();
        }
        System.out.println(player1.getStamina());
        player1.info();

    }

}

class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player() {
        stamina = 90 + (int) Math.random() * 100;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    protected void run() {
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    protected void info() {
        if (countPlayers < 6) {
            System.out.println("Количество игроков меньше 6 есть еще " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}