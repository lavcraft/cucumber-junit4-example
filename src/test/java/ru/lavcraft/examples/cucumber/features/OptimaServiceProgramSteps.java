package ru.lavcraft.examples.cucumber.features;

import com.google.inject.Inject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
/**
 * {@code @Slf4j} — генерирует поле log — с логгером автоматически
 * {@code @RequiredArgsConstructor} — генерирует конструктор для всех final полей. Автоматом ставит на них аннотацию {@code @Inject}
 */
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class OptimaServiceProgramSteps {
    private final User   user; //пользователь салона оптики
    private final Client client; //офтальмолог

    @When("Я предлагаю ему сервисную программу")
    public void яПредлагаетЕмуСервиснуюПрограмму() {

    }

    @And("Пользователь даёт мне свой телефон \"([^\"]*)\"")
    public void пользовательДаётМнеСвойТелефон(String phone) {
        user.setPhone(phone);
    }

    @And("Я получаю код на телефон")
    public void яПолучаюКодНаТелефон() {

    }

    @And("Пользователь вводит код с телефона")
    public void пользовательВводитКодСТелефона() {
    }

    @Then("Я подверждаю сервисную программу")
    public void яПодверждаюСервиснуюПрограмму() {
        client.getLogin();
    }

    @And("Партнёр получает информацию о пользователе")
    public void партнёрПолучаетИнформациюОПользователе() {

    }

    @And("Пользователь получает обещанный сервисной программой плюшки")
    public void пользовательПолучаетОбещанныйСервиснойПрограммойПлюшки() {

    }

    @Given("Пользователь {string} общается с офтальмологом")
    public void пользовательОбщаетсяСОфтальмологом(String userName) {
        user.setName(userName);
    }
}
