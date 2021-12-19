/*
    Задача - спроектировать контрольную панель
    ВАЖНО! Сохрани код решения этой задачи, он пригодится тебе при решении следующей задачи.
    Объяви класс для измерения высоты, назови его Altimeter. Переопредели у этого класса метод toString(),
чтобы он возвращал текст "Measure height".
    Объяви класс для измерения давления атмосферы, назови его AirGauge. Переопредели у этого класса метод toString(),
чтобы он возвращал текст "Measure air pressure".
    Объяви класс ControlPanel. У этого класса объяви следующие приватные поля:
        поле с именем altimeter типа Altimeter;
        поле с именем airGauge типа AirGauge;
            Сразу проиницализируй эти поля при объявлении.
    Создай метод public void control() у класса ControlPanel. Он должен выводить в консоль поля altimeter и airGauge.

Запусти программу, и убедись, что исполнение метода main() у класса ControlPanelTest выводит в консоль правильный результат.

Примеры тестов
выполнение кода new ControlPanel().control() выводит в консоль текст
Measure height
Measure air pressure
 */

class Tasck39 {
    public static void main(String[] args) {
        new ControlPanel39().control();
    }
}

class Altimeter39 {
    @Override
    public String toString(){return "Measure height";}
}

class AirGauge39 {
    @Override
    public String toString(){return "Measure air pressure";}
}

class ControlPanel39 {
    private Altimeter39 altimeter = new Altimeter39();
    private AirGauge39 airGauge = new AirGauge39();

    public void control() {
        System.out.println(altimeter);
        System.out.println(airGauge);
    }
}