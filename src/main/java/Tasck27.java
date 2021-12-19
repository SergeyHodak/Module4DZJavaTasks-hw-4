/*
    Задание - написать сумматор
    Создай класс FirNumSum, который наследуется от класса FirNum. Переопредели у этого класса
метод calc() так, чтобы он возвращал сумму чисел от 1 до переданного параметра n включительно.

Примеры тестов
вызов new FirNumSum().calc(3) возвращает 6
 */

class Tasck27 {
    public int test(FirNum27 firNum27, int number) {
        return firNum27.calc(number);
    }

    public static void main(String[] args) {
        FirNum27 firNum27 = new FirNumSum27();
        Tasck27 firTest27 = new Tasck27();

        //Should be 6
        System.out.println(firTest27.test(firNum27, 3));
    }
}

class FirNum27 {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum27 extends FirNum27 {
    @Override
    public int calc(int n) {
        int x = 1;
        int result = 0;
        for (;;) {
            if (x<=n) {
                result += x;
                x++;
            } else {
                return result;
            }
        }
    }
}