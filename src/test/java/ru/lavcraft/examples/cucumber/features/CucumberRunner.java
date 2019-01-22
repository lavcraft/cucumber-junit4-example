package ru.lavcraft.examples.cucumber.features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * В данном примере используем JUnit 4
 * <p>
 * Чтобы JUnit правильно сматчил *.feature файлы с нашими сценариями и их имплементации
 * используется две сущности – glue и feature
 * <p>
 * { @code glue } — используется для указание в каких Java пакетах нужно искать имплементации (методы проаннотированные {@code @Given/@When/@Then/etc })
 * { @code features } — для поиска *.feature файлов со сценариями
 *
 * @see <a href="https://github.com/cucumber/cucumber-jvm/blob/master/examples/java8-calculator/src/test/resources/cucumber/examples/java/calculator/basic_arithmetic.feature">Пример feature файла</a>
 *
 * PS: в Junit 5 пока не доделана интеграция с Cucumber
 * PSPS: Так же запуск можно производить без JUnit, с помощью cucumber cli. Смотри build.gradle файл и таски cucumber*
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "ru.lavcraft.examples.cucumber.features",
        features = "src/test/resources/"
)
public class CucumberRunner {
}
