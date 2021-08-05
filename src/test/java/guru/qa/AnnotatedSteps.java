package guru.qa;

import org.junit.jupiter.api.Test;

public class AnnotatedSteps {
    private static final String REPOSITORY = "Nikasvet/qa_guru_hw6";
    private WebSteps steps = new WebSteps();

    @Test
    public void shouldSeeIssueInRepository() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueText("Issues");

    }
}
