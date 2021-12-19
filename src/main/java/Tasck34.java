/*
    Задание - строим заправочную станцию
    Опиши класс GasStation. В этом классе напиши метод public void refuel().
Этот метод должен выводить в консоль текст "Refuel done!".
    Добавь в класс Spaceport приватное поле типа GasStation, назови его gasStation.
Сразу проинициализируй это поле (используй выражение new GasStation()).
    Добавь в метод launch() класса Spaceport вызов метода refuel() поля gasStation.

Примеры тестов
Выполнение кода

Spaceport spaceport = new Spaceport();
spaceport.launch();
выводит в консоль текст Refuel done!.
 */

class Tasck34 { //class Launcher
    public static void main(String[] args) {
        Spaceport34 spaceport = new Spaceport34();
        spaceport.launch();
    }
}

class Spaceport34 {
    private GasStation34 gasStation = new GasStation34();

    public void launch() {
        gasStation.refuel();
    }
}
class GasStation34 {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}