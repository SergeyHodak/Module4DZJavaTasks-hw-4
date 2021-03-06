/*
    Задача - написать класс StarTrack
    Класс точки описан, работает правильно и хорошо. Теперь нужно сделать класс, который бы представлял
путь - отрезок, у которого есть стартовая и финальная точка.
    Напиши класс StarTrack. Объяви у этого класса два приватных поля типа Point с именами start и finish.
Напиши сеттеры и геттеры для этих полей.
    Реализуй методы equals() и hashCode() для класса StarTrack. Два объекта StarTrack считаются равны,
если у них равны точки start и finish.
 */

import java.util.Objects;

class Tasck22 {
    public static void main(String[] args) {
        Point22 p1 = new Point22();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point22 p2 = new Point22();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point22 p3 = new Point22();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        StarTrack22 track1 = new StarTrack22();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack22 track2 = new StarTrack22();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack22 track3 = new StarTrack22();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2) + " <- должно быть true"); //Should be true
        System.out.println(track1.equals(track3) + " <- должно быть false"); //Should be false
        System.out.println((track1.hashCode() == track2.hashCode()) + " <- должно быть true"); //Should be true



        // тесты
        Point22 p4 = new Point22();
        p4.setX(971);
        p4.setY(768);
        p4.setZ(1);

        Point22 p5 = new Point22();
        p5.setX(81);
        p5.setY(510);
        p5.setZ(982);

        Point22 p6 = new Point22();
        p6.setX(971);
        p6.setY(768);
        p6.setZ(1);

        Point22 p7 = new Point22();
        p7.setX(81);
        p7.setY(510);
        p7.setZ(982);

        StarTrack22 track4 = new StarTrack22();
        track4.setStart(p4);
        track4.setFinish(p5);

        StarTrack22 track5 = new StarTrack22();
        track5.setStart(p6);
        track5.setFinish(p7);

        System.out.println("StarTrack{st[971, 768, 0] fin[81, 510, 982]} и StarTrack{st[971, 768, 0] fin[81, 510, 982]} -> " + track4.equals(track5) + " <- Должно быть true"); //true
    }
}

class Point22 {
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
        Point22 point = (Point22) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public static void main(String[] args) {
        Point22 p1 = new Point22();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point22 p2 = new Point22();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        System.out.println(p1.equals(p2)); //true

        System.out.println(Objects.hash(1, 2, 3)); //какаято арифметика выдающая результат в инте
    }
}

class StarTrack22 {
    private Point22 start;
    private Point22 finish;

    public Point22 getStart() {
        return start;
    }

    public void setStart(Point22 A) {
        this.start = A;
    }

    public Point22 getFinish() {
        return finish;
    }

    public void setFinish(Point22 B) {
        this.finish = B;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        StarTrack22 starTrack = (StarTrack22) o;
        String a = this.start.toString();
        String b = starTrack.start.toString();
        String c = this.finish.toString();
        String d = starTrack.finish.toString();
        return a.equals(b) & c.equals(d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}