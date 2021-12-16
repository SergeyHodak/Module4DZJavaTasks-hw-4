/*
    Напиши класс SpaceRocketLauncher, описывающий космическую ракетную установку.
    У этого класса должны быть следующие приватные поля:
    bigRocketCount - тип int, количество больших ракет
    smallRocketCount - тип int, количество маленьких ракет
    Для обеих полей сделай сеттеры и геттеры. Напиши сеттеры так, чтобы если мы передаем количество ракет меньше 0 или же больше 100, то такой вызов бы игнорировался.
    Также напиши в классе следующие методы:
    public void launchBigRocket(). Этот метод проверяет количество больших ракет (bigRocketCount), и если это количество больше 0 - отнимает одну ракету
    у поля bigRocketCount, и выводит в консоль текст "Launch big rocket".
    public void launchSmallRocket(). Этот метод проверяет количество маленьких ракет (smallRocketCount), и если это количество больше 0 - отнимает одну ракету
    у поля smallRocketCount, и выводит в консоль текст "Launch small rocket".
    public int getTotalPower(). Этот метод считает общую огневую мощь ракетной установки из рассчета, что каждая оставшаяся большая ракета дает 100 единиц мощи,
    каждая маленькая ракета - 50 единиц мощи.
 */

public class Tasck06 {
    private int bigRocketCount; //количество больших ракет
    private int smallRocketCount; //количество маленьких ракет

    public int getBigRocketCount() {
        return this.bigRocketCount;
    }

    public int getSmallRocketCount() {
        return this.smallRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount >= 0 & bigRocketCount <= 100) {
            this.bigRocketCount = bigRocketCount;
        }
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount >= 0 & smallRocketCount <= 100) {
            this.smallRocketCount = smallRocketCount;
        }
    }

    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            this.bigRocketCount--;
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
            this.smallRocketCount--;
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower() {
        return (this.bigRocketCount * 100) + (this.smallRocketCount * 50);
    }

    public static void main(String[] args) {
        Tasck06 launcher = new Tasck06();

        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }
}
/*
Выполнение кода:
    SpaceRocketLauncher launcher = new SpaceRocketLauncher();

    launcher.setBigRocketCount(5);
    launcher.setSmallRocketCount(10);

    System.out.println("Power is " + launcher.getTotalPower());

    launcher.launchBigRocket();
    System.out.println("Big rocket count is " + launcher.getBigRocketCount());

    laucnher.launchSmallRocket();
    System.out.println("Small rocket count is " + laucnher.getSmallRocketCount());

    System.out.println("Power is " + launcher.getTotalPower());
выведет в консоль:

    Power is 1000
    Launch big rocket
    Big rocket count is 4
    Launch small rocket
    Small rocket count is 9
    Power is 850
В коде выше мы задали 5 больших ракет, и 10 маленьких. Огневая мощь составила 1000 единиц.
Потом мы запустили по одной ракете, и запуск каждой ракеты вывел в консоль соответствующее сообщение.
Также после запуска каждой ракеты мы вывели в консоль, сколько ракет осталось.
И в конце мы вывели снова в консоль огневую мощь, которая уменьшилась до 850 (-100 за одну выпущенную
большую ракету, и -50 за одну выпущенную маленькую ракету).
 */