import java.util.HashSet;
import java.util.Scanner;

public class Game {

    private static final HashSet<Character> usersLetters = new HashSet<>();
    private static final String[] scaffold = {Scaffold.FULL_BODY.toString(), Scaffold.FIRST_LEG.toString(), Scaffold.SECOND_HAND.toString(), Scaffold.FIRST_HAND.toString(), Scaffold.BODY.toString(), Scaffold.HEAD.toString(), Scaffold.STICK.toString()};

    public static void startGame(Player player) {
        String correctWord = ProcessingWords.makeWord();
        ProcessingWords.makeSecretWord(correctWord);
        while (!ProcessingWords.isWin() && player.getLivesLeft() >= 0) {
            System.out.println(ProcessingWords.getSecretWord());
            Scanner answer = new Scanner(System.in);
            String playerAnswer = answer.nextLine();

            if (playerAnswer.length() != 1) {
                System.out.println("Пожалуйста, введите только одну букву");
                continue;
            }
            try {
                char playersLetter = playerAnswer.toLowerCase().charAt(0);

                if (ProcessingWords.getLetters().contains(playersLetter)) {
                    ProcessingWords.revealLetter(playersLetter, correctWord);

                } else if (!ProcessingWords.getLetters().contains(playersLetter) && !usersLetters.contains(playersLetter)) {
                    System.out.println(scaffold[player.getLivesLeft()]);
                    usersLetters.add(playersLetter);
                    player.hasIncorrectAnswer(player);
                }
        } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        if (player.getLivesLeft() == -1) {
            System.out.println("Вы проиграли! Загаданное слово: " + correctWord);
            usersLetters.clear();
            ProcessingWords.clearList();
        } else {
            System.out.println("Вы выиграли!");
            usersLetters.clear();
        }
    }
}
