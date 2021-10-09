package pages;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;

public abstract class BasePage {
    public String getTitle() {
        return title();
    }

    public void checkAlertContainsMessage(String value) {
        step("Отображено сообщение об ошибке '" + value + "'", () -> {
            $(".alert-danger").shouldHave(text(value));
        });
    }
}
