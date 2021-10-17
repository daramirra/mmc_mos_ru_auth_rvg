package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.MmcLkAuthPage;
import pages.MmcLkRegistrationPage;

import static helpers.DriverUtils.getConsoleLogs;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MmcAuthLkUiTests extends TestBase {

    @Test
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @DisplayName("Проверка заголовка страницы входа в личный кабинет иностранного гражданина")
    void checkTitleTest() {
        MmcLkAuthPage mmcLkAuthPage = MmcLkAuthPage.openPage();
        String expectedTitle = "Вход в личный кабинет иностранного гражданина – Вход в личный кабинет иностранного гражданина";

        step("Заголовок страницы входа в личный кабинет содержит '" + expectedTitle + "'", () -> {
            assertThat(mmcLkAuthPage.getTitle()).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @DisplayName("Лог консоли браузера на странице входа в личный кабинет не содержит ошибок")
    void consoleLogShouldNotHaveErrors() {
        MmcLkAuthPage.openPage();

        step("Страница входа в личный кабинет не содержит ошибок в логах консоли браузера", () -> {
            String consoleLogs = getConsoleLogs();
            assertThat(consoleLogs).doesNotContain("SERVE");
        });
    }

    @Test
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @DisplayName("Переход на вкладку 'Почта' на странице входа в личный кабинет")
    void checkOpenTabEmail() {
        MmcLkAuthPage mmcLkAuthPage = MmcLkAuthPage.openPage();
        mmcLkAuthPage.openEmailTab();
        mmcLkAuthPage.emailInputExists();
    }

    @Test
    @Story("Попытка входа с невалидными данными")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @DisplayName("Попытка входа в личный кабинет с невалидным значением телефона")
    void inputInvalidPhoneShowErrorMessage() {
        Faker faker = new Faker();

        MmcLkAuthPage mmcLkAuthPage = MmcLkAuthPage.openPage();
        mmcLkAuthPage.checkPhoneInputExists();
        mmcLkAuthPage.setPhoneValue(faker.number().digits(3));
        mmcLkAuthPage.setPasswordValue(faker.number().digits(3));
        mmcLkAuthPage.clickEnterButton();
        mmcLkAuthPage.checkAlertContainsMessage("Телефонный номер должен соответствовать формату +79xxxxxxxxx");
    }

    @Test
    @Story("Попытка входа с невалидными данными")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @DisplayName("Попытка входа в личный кабинет без указания пароля")
    void passwordCouldNotBeEmpty() {
        Faker faker = new Faker();

        MmcLkAuthPage mmcLkAuthPage = MmcLkAuthPage.openPage();
        mmcLkAuthPage.checkPhoneInputExists();
        mmcLkAuthPage.setPhoneValue(faker.number().digits(9));
        mmcLkAuthPage.clickEnterButton();
        mmcLkAuthPage.checkAlertContainsMessage("Требуется ввести пароль");
    }

    @Test
    @Story("Открытие страниц")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Регистрация пользователя")
    @DisplayName("Переход на страницу 'Регистрация пользователя'")
    void checkOpenRegistrationPage() {
        MmcLkAuthPage mmcLkAuthPage = MmcLkAuthPage.openPage();
        String expectedAuthTitle = "Вход в личный кабинет иностранного гражданина – Вход в личный кабинет иностранного гражданина";
        step("Заголовок страницы входа в личный кабинет содержит '" + expectedAuthTitle + "'", () -> {
            assertThat(mmcLkAuthPage.getTitle()).isEqualTo(expectedAuthTitle);
        });

        MmcLkRegistrationPage mmcLkRegistrationPage = mmcLkAuthPage.clickRegistrationLink();
        String expectedRegistrationTitle = "Регистрация пользователя";
        step("Заголовок страницы регистрации содержит 'Регистрация пользователя'", () -> {
            assertThat(mmcLkRegistrationPage.getTitle()).isEqualTo(expectedRegistrationTitle);
        });
    }
}

