/*
    Задача - написать Seasons
    Уже есть написанный абстрактный класс Season, который представляет определенный сезон года.
Также есть класс SeasonTest, с помощью которого можно вывести информацию о сезоне.

Напиши следующие классы, которые наследуются от класса Season:
    класс Winter, у которого метод getName() возвращает "winter", метод isCold() возвращает true;
    класс Spring, у которого метод getName() возвращает "spring", метод isCold() возвращает false;
    класс Summer, у которого метод getName() возвращает "summer", метод isCold() возвращает false;
    класс Autumn, у которого метод getName() возвращает "autumn", метод isCold() возвращает true.

Примеры тестов
    вызов new SeasonTest().test(new Winter()) возвращает "winter is cold";
    вызов new SeasonTest().test(new Spring()) возвращает "spring is warm";
    вызов new SeasonTest().test(new Summer()) возвращает "summer is warm";
    вызов new SeasonTest().test(new Autumn()) возвращает "autumn is cold";
 */

class Tasck32 { //class SeasonTest
    public String test(Season32 season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public static void main(String[] args) {
        Tasck32 seasonTest = new Tasck32();

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter32()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring32()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer32()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn32()));
    }
}

abstract class Season32 {
    public abstract String getName();
    public abstract boolean isCold();
}

class Winter32 extends Season32 {
    public String getName() {
        return  "winter";
    }

    public boolean isCold() {
        return true;
    }
}

class Spring32 extends Season32 {
    public String getName() {
        return  "spring";
    }

    public boolean isCold() {
        return false;
    }
}

class Summer32 extends Season32 {
    public String getName() {
        return  "summer";
    }

    public boolean isCold() {
        return false;
    }
}

class Autumn32 extends Season32 {
    public String getName() {
        return  "autumn";
    }

    public boolean isCold() {
        return true;
    }
}