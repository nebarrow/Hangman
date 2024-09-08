public class Player {
    private int livesLeft;

    public Player() {
        this.livesLeft = 6;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void hasIncorrectAnswer(Player player) {
        player.livesLeft--;
    }
}
