import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSolutionsTest {
    @Test
    void enterprisePage() {

        //Открыть гл.страницу GitHub
        open("https://github.com/");

        //Выберите меню Solutions -> Enterprize с помощью команды hover для Solutions
        $(byText("Solutions")).hover();
        $("ul.list-style-none").$(byText("Enterprise")).click();

        //Убедитесь что загрузилась нужная страница, например что заголовок - Build like the best
        $(".h1-mktg").shouldHave(Condition.text("Build like the best"));
    }
}
