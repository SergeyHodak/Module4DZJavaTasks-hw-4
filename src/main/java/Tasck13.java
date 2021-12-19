/*
    Классы LaunchCalculator и абстрактный класс Spaceport уже написаны. Тебе нужно написать классы
    JupiterStar, MercuryBeat и SunHeaven, в которых будет зашита логика рассчета стоимости взлета ракеты.
 */

class Tasck13 {
    public int calculateTotalPrice(Spaceport13 spaceport, int passengerCount) {
        return spaceport.calculateTotalPrice(passengerCount);
    }

    public static void main(String[] args) {
        Tasck13 calculator = new Tasck13();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar13(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat13(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven13(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
    }
}

abstract class Spaceport13 {
    public abstract int calculateTotalPrice(int passengerCount);
}

class JupiterStar13 extends Spaceport13 {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        /*
        космопорт JupiterStar берет фиксированную плату в 500 единиц и дополнительно по 2 единицы за каждого пассажира;
        passengerCount - количество пассажиров.
        */
        return 500 + (passengerCount * 2);
    }
}

class MercuryBeat13 extends Spaceport13 {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        /*
        космопорт MercuryBeat не берет фиксированной платы за взлет, но берет по 15 единиц за каждого пассажира;
        passengerCount - количество пассажиров.
        */
        return passengerCount * 15;
    }
}

class SunHeaven13 extends Spaceport13 {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        /*
        космопорт SunHeaven берет лишь фиксированную плату в 2000 единиц, но количество пассажиров при этом неограничено.
        */
        return 2000;
    }
}