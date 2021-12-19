/*
    Задание - компрессорная станция
    Опиши класс CompressorStation. В этом классе напиши метод public void compress().
Этот метод должен выводить в консоль текст "Compress done!".
    Добавь в класс Spaceport приватное поле типа CompressorStation, назови его compressorStation.
Сразу проинициализируй это поле (используй выражение new CompressorStation()).
    Добавь в метод launch() класса Spaceport вызов метода compress() поля compressorStation.

Примеры тестов
Выполнение кода

Spaceport spaceport = new Spaceport();
spaceport.launch();
выводит в консоль текст

Refuel done!
Service done!
Compress done!
 */

class Tasck36 { //class Launcher
    public static void main(String[] args) {
        Spaceport36 spaceport = new Spaceport36();
        spaceport.launch();
    }
}

class Spaceport36 {
    private GasStation36 gasStation = new GasStation36();
    private ServiceTower36 serviceTower = new ServiceTower36();
    private CompressorStation36 compressorStation = new CompressorStation36();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
    }
}

class GasStation36 {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower36 {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation36 {
    public void compress() {
        System.out.println("Compress done!");
    }
}