/*
    Задание - создать класс для описания точки
Напиши класс Point, описывающий точку в пространстве. Создай у него три приватных поля типа int, с именами x, y и z.
Для каждого поля создай публичный сеттер и геттер. Запусти код, и убедись, что созданные две точки (p1 и p2) хоть и
имеют одинаковые координаты, но метод equals для них работает неправильно, и возвращает false.
*/

class Tasck19 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        System.out.println(p1.equals(p2)); //Will be false
    }
}

/*
class Point {
    private int x;
    private int y;
    private int z;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }
}
*/