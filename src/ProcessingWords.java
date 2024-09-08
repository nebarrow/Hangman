import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProcessingWords {

    private static final List<String> words = new ArrayList<>();
    private static final StringBuilder secretWord = new StringBuilder();
    private static final HashSet<Character> letters = new HashSet<>();

    private static void getWords() {
        try (Scanner fileScanner = new Scanner(new File("./src/words.txt"))) {
            while (fileScanner.hasNextLine()) {
                words.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        }
    }
    public static void clearList() {
        words.clear();
        letters.clear();
    }
    private static void collectLetters(String word) {
        for (int i = 0; i < word.length(); ++i) {
            letters.add(word.toLowerCase().charAt(i));
        }
    }

    public static void makeSecretWord(String word) {
        collectLetters(word);
        secretWord.setLength(0);
        secretWord.append("*".repeat(word.length()));
    }

    public static String makeWord() {
        getWords();
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
    public static StringBuilder getSecretWord() {
        return secretWord;
    }

    public static HashSet<Character> getLetters() {
        return letters;
    }

    public static boolean isWin() {
        return secretWord.indexOf("*") == -1;
    }


    public static void revealLetter(char letter, String word) {
        for (int j = 0; j < word.length(); ++j) {
            if (word.toLowerCase().charAt(j) == letter) {
                secretWord.setCharAt(j, letter);
            }
        }
    }
}
