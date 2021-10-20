package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OibAuthPage extends BasePage {
    final static String BASE_URL = "https://sdo-oib-test.it2g.ru/auth-sdo/login?service=https://sdo-oib-test.it2g.ru/organizations/shiro-cas";

    @Step("Открыть страницу 'Вход в личный кабинет иностранного гражданина'")
    public static OibAuthPage openPage() {
        open(BASE_URL);
        return new OibAuthPage();
    }

    @Step("Перейти на вкладку 'Почта'")
    public void openEmailTab() {
        $(By.linkText("Почта")).click();
    }

    @Step("Открытая вкладка 'Почта' содержит поле ввода идентификатора учетной записи 'Почта'")
    public void emailInputExists() {
        $(By.name("email")).shouldBe(visible);
    }

    @Step("Открытая страница содержит поле ввода идентификатора учетной записи 'Телефон'")
    public void checkPhoneInputExists(){
        $(By.name("phone")).shouldBe(visible);
    }

    @Step("Заполнить поле ввода идентификатора учетной записи 'Телефон'")
    public void setPhoneValue(String phoneValue){
        $(By.name("phone")).setValue(phoneValue);
    }

    @Step("Заполнить поле 'Пароль'")
    public void setPasswordValue(String passwordValue){
        $(By.name("password")).setValue(passwordValue);
    }

    @Step("Нажать кнопку 'Войти'")
    public void clickEnterButton(){
        $(By.tagName("button")).click();
    }

    @Step("Нажать на ссылку 'Регистрация'")
    public OibRegistrationPage clickRegistrationLink(){
        $(By.linkText("Регистрация")).click();
        return new OibRegistrationPage();
    }
}
