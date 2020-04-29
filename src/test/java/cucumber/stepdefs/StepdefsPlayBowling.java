package cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.newlight77.kata.BowlingScorer;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class StepdefsPlayBowling {

    private List<String> spinsList;
    private int score;

    @Given("le joueur a fait une partie avec les tirs suivants {string}")
    public void leJoueurAFaitUnePartieAvecLesTirsSuivants(String spins) {
        spinsList = Arrays.asList(spins.split(","));
    }

    @When("on calcule son score")
    public void onCalculeSonScore() {
        score = new BowlingScorer().score(spinsList);
    }

    @Then("le score est {int}")
    public void le_score_est(Integer score) {
        Assertions.assertEquals(score, this.score);
    }

}
