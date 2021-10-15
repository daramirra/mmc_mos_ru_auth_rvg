# Проект по автоматизации тестирования форм:

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:heavy_check_mark: [входа в личный кабинет](https://mmc.mos.ru/client-office/security/auth-rvg/login?2&service=http://mmc.mos.ru/client-office/auth/signin-cas),

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:heavy_check_mark: [регистрации личного кабинета](https://mmc.mos.ru/client-office/security/lk/register?service=http://mmc.mos.ru/client-office/auth/signin-cas),

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:heavy_check_mark: [восстановления пароля личного кабинета](https://mmc.mos.ru/client-office/security/auth-rvg/recovery-password?1&service=http://mmc.mos.ru/client-office/auth/signin-cas).

Данные формы являются частью разработки **Системы обеспечения информационной безопасности "ВИЗОР"**, реализованной компанией **[ФРЕШТЕХ](http://visor.frte.ru/solutions/)**, сотрудником которой я являюсь на данный момент.

## Использованные технологии и инструменты


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
