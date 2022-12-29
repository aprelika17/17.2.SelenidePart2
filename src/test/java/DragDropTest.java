import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragDropTest {

    @Test
    void dragAndDropTest() {
        //Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
        $("#column-a").dragAndDropTo($("#column-b"));

        //Проверьте, что прямоугольники действительно поменялись
        $("#column-b").$("header").shouldHave(Condition.text("A"));
    }
}
