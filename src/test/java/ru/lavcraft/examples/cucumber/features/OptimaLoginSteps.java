package ru.lavcraft.examples.cucumber.features;

import com.codeborne.selenide.Selectors;
import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class OptimaLoginSteps {
    /**
     * Произошло впрыскивание объекта
     * Жизненным циклом объекта управляет фреймворк для DI — guice
     * Благодаря чему его можно переиспользовать в разных степах, разбивая их логически на разные классы
     * @see com.google.inject.Inject
     */
    private final Client client;

    @Given("Я как офтальмолог ищу {string} в гугле")
    public void яКакОфтальмологИщуВГугле(String googleIt) {
        open("https://google.com");
        $(By.name("q")).setValue("Itigris")
                .pressEnter();
    }

    @When("Проверяю есть ли там слово {string}")
    public void проверяюЕстьЛиТамСлово(String keyword) {
        $(Selectors.byPartialLinkText(keyword)).shouldBe(exist);
    }

    @Given("Я как офтальмалог логинюсь в оптиму с логином {string} и паролем {string}")
    public void яКакОфтальмалогЛогинюсьВОптимуСЛогиномИПаролем(String login, String password) {
        client.setLogin(login);
        client.setPassword(password);

        //заполняем логины(не реально. Оставил для примера
        //$(".login_form").setValue(password).pressEnter();
    }

    @Given("Я как офтальмалог вижу список сервисных програм для клиента {string} – {string}")
    public void яКакОфтальмалогВижуСписокСервисныхПрограмДляКлиента(String program, String descriptin) {
        $(Selectors.byPartialLinkText("автоматизация")).shouldBe(exist);
    }
}
