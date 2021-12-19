/*
    Теперь метод equals() работает корректно. Но для правильной работы класса Point с другим кодом, в частности
с классами стандартной Java-библиотеки, необходимо также переопределить метод hashCode().

    Вспомним минутку теории.
    Этот метод возвращает число типа int. Если два объекты равны (по методу equals()), то вызов hashCode()
для этих объектов должен возвращать одинаковые значения. Если же объекты не равны, то hashCode() может
возвращать одинаковое значение, но это нежелательно с точки зрения производительности. Много внутреннего
Java-кода оптимизировано на быструю работу именно при условии, что hashCode() возвращает разные значения
для разных объектов.
    Написание хорошего hashCode() - сложная и нетривиальная задача. В стандартной библиотеке Java есть
вспомогательный класс Objects, у которого есть метод hash(). Этот метод принимает произвольное количество
аргументов, и возвращает результат. Например, вызов Objects.hash(1, 2, 3) возвратит хеш, посчитанный на
основании переданных чисел 1, 2, 3. Конкретное значение может отличаться на разных реализациях Java машины,
но в пределах одной программы для одинаковых входных значений результат будет одним и тем же.

    Задание - написать метод hashCode
    Напиши в классе Point метод hashCode(), который бы работал, как описано выше. Можешь использовать
Objects.hash() (тогда не забудь импортировать этот класс из пакета java.util). Либо же можешь написать
свою реализацию, что будет даже круче.
 */

import java.util.Objects;

class Tasck21 {
    public static void main(String[] args) {
        Point21 p1 = new Point21();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point21 p2 = new Point21();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point21 p3 = new Point21();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false
    }
}


class Point21 {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point21 point = (Point21) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

}