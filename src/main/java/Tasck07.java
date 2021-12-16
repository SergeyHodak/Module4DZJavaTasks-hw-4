/*
    Напиши класс Engine. У этого класса должно быть приватное поле power типа int. Создай геттер и сеттер для этого поля.
    Также создай метод public String getFuelType(), который возвращает тип топлива, на котором работает двигатель.
    Этот метод должен возвращать строку "A500" - это стандартное топливо.
 */

public class Tasck07 {
    private int power;

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        System.out.println(new Tasck07().getFuelType()); // возвращает "A500"
    }
}