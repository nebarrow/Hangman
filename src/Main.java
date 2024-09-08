import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            String usersCommand = startMenu();
            switch (usersCommand.toUpperCase()) {
                case "Н":
                    System.out.println("Введите верную букву:");
                    playGame();
                    break;
                case "З":
                    break;
                default:
                    System.out.println("Вы ввели не ту букву!");
            }
            break;
        } while (true);
    }

    private static String startMenu() {
        System.out.println("[Н]ачать игру" + '\t' + "[З]акончить игру");
        return scanner.nextLine().toUpperCase();
    }
    private static String continueMenu() {
        System.out.println("[П]родолжить игру" + '\t' + "[З]акончить игру");
        return scanner.nextLine().toUpperCase();
    }

    private static void playGame() {
        Player player = new Player();
        Game.startGame(player);
        do {
            String usersCommand = continueMenu();
            switch (usersCommand.toUpperCase()) {
                case "П":
                    System.out.println("Введите верную букву:");
                    Game.startGame(new Player());
                    break;
                case "З":
                    return;
                default:
                    System.out.println("Вы ввели не ту букву!");
            }
        } while (true);
    }
}