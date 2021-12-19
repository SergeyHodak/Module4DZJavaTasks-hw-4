/*
    Задание - объявить башню обслуживания
    Опиши класс ServiceTower. В этом классе напиши метод public void service().
Этот метод должен выводить в консоль текст "Service done!".
    Добавь в класс Spaceport приватное поле типа ServiceTower, назови его serviceTower.
Сразу проинициализируй это поле (используй выражение new ServiceTower()).
    Добавь в метод launch() класса Spaceport вызов метода service() поля serviceTower.

Примеры тестов
Выполнение кода

Spaceport spaceport = new Spaceport();
spaceport.launch();
выводит в консоль текст

Refuel done!
Service done!
 */

class Tasck35 { //class Launcher
    public static void main(String[] args) {
        Spaceport35 spaceport = new Spaceport35();
        spaceport.launch();
    }
}

class Spaceport35 {
    private GasStation35 gasStation = new GasStation35();
    private ServiceTower35 serviceTower = new ServiceTower35();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
    }
}

class GasStation35 {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower35 {
    public void service() {
        System.out.println("Service done!");
    }
}