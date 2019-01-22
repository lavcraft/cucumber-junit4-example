# Простой Cucumber пример с Junit4 и Guice для DI

## Что нужно установить заранее

1. IntellJ IDEA. Советую ставить через jetbrains-toolbox. На маке `brew cask install jetbrains-toolbox`
2. Установить плагин Lombok через Plugins в IntellJ IDEA (Ctrl+SHit+A -> Plugins -> Enter -> Marketplace -> Lombok -> Install)
3. Включить Annotation Processing в IntellJ IDEA (Ctrl+Shift+A -> Annotation Processor -> Enter -> Enable Annotation Processing)
4. Теперь можно работать

## Запуск из терминала

В Headless режиме
```sh
./gradlew cucumberFirstSuite # или сокращённо по первым буквам cFS
# или
./gradlew test
```

В Headfull режиме (открывается браузер)
```sh
./gradlew cucumberFirstSuiteHeadfull # или сокращённо по первым буквам cFSH
```
