/*
    Напиши класс SpaceshipCalc. У этого класса должны быть следующие методы:

    int calculateAirBalloons(int passengerCount). Этот метод возвращает общее количество баллонов со сжатым воздухом,
которое нужно взять на космический корабль, из рассчета 10 баллонов на одного пассажира.
Поскольку баллоны с воздухом - это критическая информация, сделай метод финальным, чтобы даже если кто-то
унаследуется от класса SpaceshipCalc, он не мог переопределить этот метод.

    int calculateBookCount(int passengerCount). Этот метод возвращает количество бумажных книг, которое может взять
на борт космический корабль, из рассчета 2 книги на одного пассажира.
 */
public class Tasck15 {
    final int calculateAirBalloons(int passengerCount) {
        return passengerCount * 10;
    }

    int calculateBookCount(int passengerCount) {
        return passengerCount * 2;
    }

    public static void main(String[] args) {
        Tasck15 calc = new Tasck15();
        System.out.println(calc.calculateAirBalloons(35)); //350
        System.out.println(calc.calculateBookCount(50)); //100
    }
}