package io.github.newlight77.kata;

public class ScoreFrame {

    private final int score;
    private final boolean isSpare;

    public ScoreFrame(int score, boolean isSpare) {
        this.score = score;
        this.isSpare = isSpare;
    }

    public int getScore() {
        return score;
    }

    public boolean isSpare() {
        return isSpare;
    }
}
