package io.github.newlight77.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class BowlingScorerTest {

    @Test
    public void shouldReturnZero_WhenHavingAllMissedSpins() {
        List<String> spins = Arrays.asList("--", "--", "--", "--");

        int score = new BowlingScorer().score(spins);

        Assertions.assertEquals(0, score);
    }

    @Test
    public void shouldReturnZero_WhenHavingNoSpin() {
        List<String> spins = Collections.emptyList();

        int score = new BowlingScorer().score(spins);

        Assertions.assertEquals(0, score);
    }

    @Test
    public void shouldReturnScore_WhenHavingAllNotMissedSpins() {
        List<String> spins = Arrays.asList("11", "22", "33", "44");

        int score = new BowlingScorer().score(spins);

        Assertions.assertEquals(20, score);
    }

    @Test
    public void shouldReturnScore_WhenHavingSomeMissedSpins() {
        List<String> spins = Arrays.asList("1-", "-2", "33", "-4");

        int score = new BowlingScorer().score(spins);

        Assertions.assertEquals(13, score);
    }

    @Test
    public void shouldReturnScore_WhenHavingAtLeastOneSpare() {
        List<String> spins = Arrays.asList("11", "2/", "3-", "14");

        int score = new BowlingScorer().score(spins);

        Assertions.assertEquals(25, score);
    }
}