/*
    Задание - сделать командный пункт
    Опиши класс CommandPost. В этом классе напиши метод public void command().
Этот метод должен выводить в консоль текст "Fire!".
    Добавь в класс Spaceport приватное поле типа CommandPost, назови его commandPost. Сразу проинициализируй это поле.
    Добавь в метод launch() класса Spaceport вызов метода command() поля commandPost.

Примеры тестов
Выполнение кода

Spaceport spaceport = new Spaceport();
spaceport.launch();
выводит в консоль текст

Refuel done!
Service done!
Compress done!
Scan done!
Fire!
 */

class Tasck38 { //class Launcher
    public static void main(String[] args) {
        Spaceport38 spaceport = new Spaceport38();
        spaceport.launch();
    }
}

class Spaceport38 {
    private GasStation38 gasStation = new GasStation38();
    private ServiceTower38 serviceTower = new ServiceTower38();
    private CompressorStation38 compressorStation = new CompressorStation38();
    private Radar38 radar = new Radar38();
    private CommandPost38 commandPost = new CommandPost38();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
}

class GasStation38 {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower38 {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation38 {
    public void compress() {
        System.out.println("Compress done!");
    }
}

class Radar38 {
    public void scan() {
        System.out.println("Scan done!");
    }
}
class CommandPost38 {
    public void command() {
        System.out.println("Fire!");
    }
}