
<img width="90%" align="right" alt="Github" src="https://github.com/daramirra/mmc_mos_ru_auth_rvg/blob/main/images/absgeo.png" />

# Проект по автоматизации тестирования форм:

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:heavy_check_mark: [входа в личный кабинет](https://mmc.mos.ru/client-office/security/auth-rvg/login?2&service=http://mmc.mos.ru/client-office/auth/signin-cas),

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:heavy_check_mark: [регистрации личного кабинета](https://mmc.mos.ru/client-office/security/lk/register?service=http://mmc.mos.ru/client-office/auth/signin-cas),

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:heavy_check_mark: [восстановления пароля личного кабинета](https://mmc.mos.ru/client-office/security/auth-rvg/recovery-password?1&service=http://mmc.mos.ru/client-office/auth/signin-cas).

Данные формы являются частью разработки **[Системы обеспечения информационной безопасности "ВИЗОР"](http://visor.frte.ru/solutions/)**, реализованной компанией **[ФРЕШТЕХ](http://visor.frte.ru/solutions/)**, сотрудником которой я являюсь на данный момент.

## Использованные технологии и инструменты
<p  align="left"
   
  <code><img width="5%" title="IntelliJ IDEA" src="images/IDEA-logo.svg"></code>
  <code><img width="5%" title="Java" src="images/jira-logo.svg"></code>
  <code><img width="5%" title="Selenide" src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg"></code>
  <code><img width="5%" title="Allure Report" src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg"></code>
  <br />
  <code><img width="5%" title="Allure TestOps" src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg"></code>
  <code><img width="5%" title="Gradle" src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg"></code>
  <code><img width="5%" title="JUnit5" src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg"></code>
  <code><img width="5%" title="Github" src="https://starchenkov.pro/qa-guru/img/skills/Github.svg"></code>
  <code><img width="5%" title="Jenkins" src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg"></code>
  <br />
  <code><img width="5%" title="Docker" src="https://starchenkov.pro/qa-guru/img/skills/Docker.svg"></code>
  <code><img width="5%" title="Rest-Assured" src="https://starchenkov.pro/qa-guru/img/skills/Rest-Assured.svg"></code>
  <code><img width="5%" title="Appium" src="https://starchenkov.pro/qa-guru/img/skills/Appium.svg"></code>
  <code><img width="5%" title="Browserstack" src="https://starchenkov.pro/qa-guru/img/skills/Browserstack.svg"></code>
  <code><img width="5%" title="Gitlab" src="https://about.gitlab.com/images/press/press-kit-icon.svg"></code>
 
</p>

## Реализованы проверки

### UI
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:green_circle:&nbsp;&nbsp;Проверка заголовка страницы входа в личный кабинет иностранного гражданина

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:green_circle:&nbsp;&nbsp;Лог консоли браузера на странице входа в личный кабинет не содержит ошибок

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:green_circle:&nbsp;&nbsp; Переход на вкладку 'Почта' на странице входа в личный кабинет

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:green_circle:&nbsp;&nbsp; Попытка входа в личный кабинет с невалидным значением телефона

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:green_circle:&nbsp;&nbsp; Попытка входа в личный кабинет без указания пароля

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:green_circle:&nbsp;&nbsp; Переход на страницу 'Регистрация пользователя'

### Команда для запуска из терминала

Локально должны быть заданы параметры в local.properies
```
gradle clean test
```
Для запуска в несколько потоков
```
gradle clean -Dthreads=5
```
