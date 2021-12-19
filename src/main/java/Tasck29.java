/*
    Задание - посчитать произведение нечетных чисел
считать не факториал, а произведение лишь нечетных чисел, которые не больше или равны n.
    Создай класс FirNumMultiplyOdd, который наследуется от класса FirNum.
    Переопредели у этого класса метод calc() так, чтобы он возвращал произведение нечетных чисел от 1 до n включительно.

Примеры тестов
вызов new FirNumMultiplyOdd().calc(4) возвращает 3
вызов new FirNumMultiplyOdd().calc(5) возвращает 15
 */

class Tasck29 {
    public int test(FirNum29 firNum29, int number) {
        return firNum29.calc(number);
    }

    public static void main(String[] args) {
        FirNum29 firNum29 = new FirNumMultiplyOdd29();
        Tasck29 firTest29 = new Tasck29();

        //Should be 15
        System.out.println(firTest29.test(firNum29, 5));
    }
}

class FirNum29 {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum29 extends FirNum29 {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial29 extends FirNum29 {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd29 extends FirNum29 {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <=n; i+=2) {
            result *= i;
        }
        return result;
    }
}