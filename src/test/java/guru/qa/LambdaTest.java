package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTest {
    private static final String REPOSITORY = "Nikasvet/qa_guru_hw6";

    @Test
    public void testIssue() {
        step("Открываем главную страницу", () -> open("https://github.com"));

        step("Ищем репозиторий", () -> $(".header-search-input").setValue(REPOSITORY).submit());

        step("Переходим в репозиторий", () -> $(byText("Nikasvet")).click());

        step("Переходим в раздел issues", () -> $(byId("issues-tab")).click());

        step("Проверяем, что Issue существует", () -> {
            $(byText("Issues")).should(Condition.exist);
        });


    }


}
