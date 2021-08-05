package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CleanSelenide {

    @Test
    public void testIssue() {
        open("https://github.com");
        $(".header-search-input").setValue("Nikasvet/qa_guru_hw6").submit();
        $(byText("Nikasvet")).click();
        $(byId("issues-tab")).click();
        $(byText("Issues")).should(Condition.exist);

    }


}
