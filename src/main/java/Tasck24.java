/*
    Задача - описать класс Stars
.. звезды принято считать следующим образом:
    1000 звезд записывается символом X;
    100 звезд записывается символом Y;
    10 звезд записывается символом Z;
    1 звезда записывается символом *.

Несколько примеров:
    1001 звезда - это X*;
    576 звезд - это YYYYYZZZZZZZ******
    Нужно использовать минимальное число символов.
То есть, например, 101 звезду нужно представить в виде Y*, но не в виде ZZZZZZZZZZ*.

    Задача
    Напиши класс Stars. В этом классе объяви поле count типа int - количество звезд.
    Переопредели в классе Stars метод toString(). Он должен возвращать количество
звезд в принятом в Междугалактической Гильдии Космоходцев формате.
 */

public class Tasck24 { //класс Stars
    private int count;

    public void setCount(int count) {this.count = count;}

    public int getCount() {return this.count;}

    @Override
    public String toString() {
        String result = "";
        int stars = this.count;
        if (stars > 999) {
            String x = "X".repeat(stars/1000);
            result += x;
            stars %= 1000;
        }
        if (stars > 99) {
            String y = "Y".repeat(stars/100);
            result += y;
            stars %= 100;
        }
        if (stars > 9) {
            String z = "Z".repeat(stars/10);
            result += z;
            stars %= 10;
        }
        if (stars > 0) {
            String v = "*".repeat(stars);
            result += v;
            stars = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Tasck24 stars = new Tasck24();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
