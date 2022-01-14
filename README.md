## Домашнее задание к занятию 1.2: Структурные шаблоны. Adapter, Proxy, Decorator, Facade, Flyweight

# Задача Калькулятор

**v 1.0**

Задание реализовано. 

Код класса Main:

```
public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("The result of SUM is " + calc.sum(3, 3));
        System.out.println("The result of MULT is " + calc.mult(3,3));
        System.out.println("The result of POW is " + calc.pow(3,3));
    }
}
```

Вывод в консоль после выполнения:

```
3:04:20 PM: Executing task ':Main.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :Main.main()
The result of SUM is 6
The result of MULT is 9
The result of POW is 27

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 709ms
2 actionable tasks: 2 executed
3:04:21 PM: Task execution finished ':Main.main()'.

```