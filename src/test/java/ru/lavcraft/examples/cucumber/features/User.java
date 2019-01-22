package ru.lavcraft.examples.cucumber.features;

import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.Data;

/**
 * Пользователя который приходит в салон оптики
 * Использовать для впрыскивания в разные тесты
 *
 * см cucumber-guice, guice и IoC
 */
@Data
@ScenarioScoped
public class User {
    private String name;
    private String phone;
}
