/*
    Задание - написать класс-считалочку
    Создай класс FirNum. У этого класса создай метод public int calc(int n). Он принимает целое число,
и возвращает его же. Это будет основа для всех дальнейших алгоритмов.

Примеры тестов
вызов new FirNum().calc(10) возвращает 10
 */
class Tasck26 {
    public int test(FirNum26 firNum26, int number) {
        return firNum26.calc(number);
    }

    public static void main(String[] args) {
        FirNum26 firNum26 = new FirNum26();
        Tasck26 firTest26 = new Tasck26();

        //Should be 10
        System.out.println(firTest26.test(firNum26, 10));
    }
}

class FirNum26 {
    public int calc(int n) {
        return n;
    }
}