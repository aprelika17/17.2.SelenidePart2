import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ActionsTest {

    @Test
    void actionTest() {
        //Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Перенесите прямоугольник А на место В
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(200, 0).release().perform();

        //Проверьте, что прямоугольники действительно поменялись
        $("#column-b").$("header").shouldHave(Condition.text("A"));
    }
}
