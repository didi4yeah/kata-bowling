package io.github.newlight77.kata;

import java.util.List;

public class BowlingScorer {

    private ScoreFrame scoreFrame = new ScoreFrame(0, false);

    public int score(List<String> framesList) {
        int result = 0;
        for (String frame : framesList) {
            if(frame.equals("--")) {
                result += 0;
            } else {
                scoreFrame = scoreFrame(frame, scoreFrame.isSpare());
                result += scoreFrame.getScore();
            }
        }
        return result;
    }

    private ScoreFrame scoreFrame(String frame, boolean previousIsSpare) {

        int firstSpin = getSpin(frame.charAt(0));

        if(previousIsSpare) {
            firstSpin = firstSpin*2;
        }

        int secondSpin = getSpin(frame.charAt(1));

        return new ScoreFrame(firstSpin + secondSpin, hasSpare(frame));
    }

    private boolean hasSpare(String frame) {
        return frame.contains("/");
    }

    private int getSpin(char spin) {
        int result;
        switch (spin) {
            case '-':
                result = 0;
                break;
            case '/':
                result = 10;
                break;
            default:
                result = Integer.parseInt("" + spin);
        }
        return result;
    }
}
