import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class testAllureSearch {


    @Test
    @AllureId("11299")
    @DisplayName("Поиск отеля")
    //  @Tags({@Tag("blocker"), @Tag("web")})
    @Story("Поиск на сайте Островок")
    @Owner("allure8")
    @Feature("searchHotel")
    public void testAuth() {
        step("Открываем главную страницу 'https://ostrovok.ru/'");
        step("Ввести в поле направление текст 'Санкт-Петербург'");
        step("В поле Заезд выбрать дату '30.07.2022'");
        step("В поле Выезд выбрать дату '31.07.2022'");
        step("В поле 1 номер для выбрать '1 гостя'");
        step("Нажать кнопку 'Найти'");
        step("Проверить что в списке отображается отель - заголовок \"Отель Park Inn by Radisson Nevsky St. Petersburg\"");
    }
}

