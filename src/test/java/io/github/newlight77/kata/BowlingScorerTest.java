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
}