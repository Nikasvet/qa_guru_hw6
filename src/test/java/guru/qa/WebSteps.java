package guru.qa;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий [{repository}]")
    public void searchForRepository(String repository) {
        $(".header-search-input").setValue(repository).submit();
    }

    @Step("Переходим в репозиторий [{repository}]")
    public void goToRepository(String repository) {
        $(byText("Nikasvet")).click();
    }

    @Step("Переходим в раздел issues")
    public void openIssuesTab() {
        $(byId("issues-tab")).click();
    }

    @Step("Проверяем, что Issue существует")
    public void shouldSeeIssueText(String text) {
        $(byText("Issues")).should(Condition.exist);
    }
}
