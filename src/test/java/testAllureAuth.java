import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class testAllureAuth {




    @Test
    @AllureId("11296")
    @DisplayName("Авторизация через Google")
  //  @Tags({@Tag("blocker"), @Tag("web")})
    @Story("Поиск на сайте Островок")
    @Owner("allure8")
    @Feature("testAuth")
    public void testAuth() {
        step("Открываем главную страницу 'https://ostrovok.ru/'");
        step("Нажимаем кнопку Войти");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь 'Anna Rainchik'", () -> {
            step("Вводим логин 'annarainchik@gmail.com' ");
            step("Вводим пароль '123456789' ");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Имя 'Anna Rainchik'");
            step("Login 'annarainchik@gmail.com'");
            step("Аватарка");
        });
        step("Разлогиниваемся");
    }
}


