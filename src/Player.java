public class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;
    }
}
