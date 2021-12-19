/*
    Задание - радиолокационная станция
    Опиши класс Radar. В этом классе напиши метод public void scan().
Этот метод должен выводить в консоль текст "Scan done!".
    Добавь в класс Spaceport приватное поле типа Radar, назови его radar. Сразу проинициализируй это поле.
    Добавь в метод launch() класса Spaceport вызов метода scan() поля radar.

Примеры тестов
Выполнение кода

Spaceport spaceport = new Spaceport();
spaceport.launch();
выводит в консоль текст

Refuel done!
Service done!
Compress done!
Scan done!
 */

class Tasck37 { //class Launcher
    public static void main(String[] args) {
        Spaceport37 spaceport = new Spaceport37();
        spaceport.launch();
    }
}

class Spaceport37 {
    private GasStation37 gasStation = new GasStation37();
    private ServiceTower37 serviceTower = new ServiceTower37();
    private CompressorStation37 compressorStation = new CompressorStation37();
    private Radar37 radar = new Radar37();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
    }
}

class GasStation37 {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower37 {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation37 {
    public void compress() {
        System.out.println("Compress done!");
    }
}

class Radar37 {
    public void scan() {
        System.out.println("Scan done!");
    }
}