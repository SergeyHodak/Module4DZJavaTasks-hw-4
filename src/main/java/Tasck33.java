/*
    Задание - строим космодром
    Напиши класс Spaceport - это будет основа.
    У этого класса опиши метод public void launch(), который не делает ничего. Это заглушка, дальше этот код будем расширять.

Примеры тестов
код new Spaceport().launch() не выводит ничего в консоль
 */

class Tasck33 { //class Launcher
    public static void main(String[] args) {
        Spaceport33 spaceport = new Spaceport33();
        spaceport.launch();
    }
}

class Spaceport33 {
    public void launch() {}
}