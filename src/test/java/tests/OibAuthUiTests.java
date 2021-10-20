package tests;

import annotations.JiraIssue;
import annotations.JiraIssues;
import annotations.Layer;
import annotations.Microservice;
import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.OibAuthPage;
import pages.OibRegistrationPage;

import static helpers.DriverUtils.getConsoleLogs;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OibAuthUiTests extends TestBase {

    @Test
    @Owner("dlapshinova")
    @Layer("web")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @JiraIssues({@JiraIssue("HOMEWORK-254")})
    @DisplayName("Проверка заголовка страницы входа")
    void checkTitleTest() {
        OibAuthPage mmcLkAuthPage = OibAuthPage.openPage();
        String expectedTitle = "СЛУЖБА АУТЕНТИФИКАЦИИ ПОЛЬЗОВАТЕЛЕЙ";

        step("Заголовок страницы входа в личный кабинет содержит '" + expectedTitle + "'", () -> {
            assertThat(mmcLkAuthPage.getTitle()).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Owner("dlapshinova")
    @Layer("web")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @JiraIssues({@JiraIssue("HOMEWORK-254")})
    @DisplayName("Лог консоли браузера на странице входа в личный кабинет не содержит ошибок")
    void consoleLogShouldNotHaveErrors() {
        OibAuthPage.openPage();

        step("Страница входа в личный кабинет не содержит ошибок в логах консоли браузера", () -> {
            String consoleLogs = getConsoleLogs();
            assertThat(consoleLogs).doesNotContain("SERVE");
        });
    }

   /* @Test
    @Owner("dlapshinova")
    @Layer("web")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @JiraIssues({@JiraIssue("HOMEWORK-254")})
    @DisplayName("Переход на вкладку 'Почта' на странице входа в личный кабинет")
    void checkOpenTabEmail() {
        OibAuthPage mmcLkAuthPage = OibAuthPage.openPage();
        mmcLkAuthPage.openEmailTab();
        mmcLkAuthPage.emailInputExists();
    }

    @Test
    @Owner("dlapshinova")
    @Layer("web")
    @Story("Попытка входа с невалидными данными")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @Microservice("Auth")
    @JiraIssues({@JiraIssue("HOMEWORK-254")})
    @DisplayName("Попытка входа в личный кабинет с невалидным значением телефона")
    void inputInvalidPhoneShowErrorMessage() {
        Faker faker = new Faker();

        OibAuthPage mmcLkAuthPage = OibAuthPage.openPage();
        mmcLkAuthPage.checkPhoneInputExists();
        mmcLkAuthPage.setPhoneValue(faker.number().digits(3));
        mmcLkAuthPage.setPasswordValue(faker.number().digits(3));
        mmcLkAuthPage.clickEnterButton();
        mmcLkAuthPage.checkAlertContainsMessage("Телефонный номер должен соответствовать формату +79xxxxxxxxx");
    }

    @Test
    @Owner("darina")
    @Layer("web")
    @Story("Попытка входа с невалидными данными")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Вход в личный кабинет")
    @Microservice("Auth")
    @JiraIssues({@JiraIssue("HOMEWORK-254")})
    @DisplayName("Попытка входа в личный кабинет без указания пароля")
    void passwordCouldNotBeEmpty() {
        Faker faker = new Faker();

        OibAuthPage mmcLkAuthPage = OibAuthPage.openPage();
        mmcLkAuthPage.checkPhoneInputExists();
        mmcLkAuthPage.setPhoneValue(faker.number().digits(9));
        mmcLkAuthPage.clickEnterButton();
        mmcLkAuthPage.checkAlertContainsMessage("Требуется ввести пароль");
    }

    @Test
    @Owner("darina")
    @Layer("web")
    @Story("Открытие страниц")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Feature("Регистрация пользователя")
    @JiraIssues({@JiraIssue("HOMEWORK-254")})
    @DisplayName("Переход на страницу 'Регистрация пользователя'")
    void checkOpenRegistrationPage() {
        OibAuthPage mmcLkAuthPage = OibAuthPage.openPage();
        String expectedAuthTitle = "Вход в личный кабинет иностранного гражданина – Вход в личный кабинет иностранного гражданина";
        step("Заголовок страницы входа в личный кабинет содержит '" + expectedAuthTitle + "'", () -> {
            assertThat(mmcLkAuthPage.getTitle()).isEqualTo(expectedAuthTitle);
        });

        OibRegistrationPage mmcLkRegistrationPage = mmcLkAuthPage.clickRegistrationLink();
        String expectedRegistrationTitle = "Регистрация пользователя";
        step("Заголовок страницы регистрации содержит 'Регистрация пользователя'", () -> {
            assertThat(mmcLkRegistrationPage.getTitle()).isEqualTo(expectedRegistrationTitle);
        });
}*/
}

