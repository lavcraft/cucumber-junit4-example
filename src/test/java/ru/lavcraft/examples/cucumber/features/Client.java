package ru.lavcraft.examples.cucumber.features;

import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.Data;

/**
 * Представляет операторов салона оптики. Например офтальмолога
 */
@Data
@ScenarioScoped //состояние объекта будет сохранятся и мутироваться на протяжении всего сценарии
public class Client {
    private String name;
    private String login;
    private String password;
}
